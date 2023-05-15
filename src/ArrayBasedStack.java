import java.util.Arrays;

public class ArrayBasedStack {
    private int[] arr;
    private int top;
    private int capacity;
    int DEFAULT_CAPACITY = 16;
    private final int MAX_STACK_SIZE = Integer.MAX_VALUE - 1;
    private int minElement;

    public ArrayBasedStack() {
        arr = new int[DEFAULT_CAPACITY];
        top = 0;
        capacity = arr.length;
    }

    public void push(int value) {
        if (top >= capacity) {
            Boolean enlargeResult = enlarge();
            if (!enlargeResult) throw new RuntimeException("The stack is full");
        }
        if (top == 0) minElement = value;
        else {
            if (value < minElement) minElement = value;
        }
        arr[top] = value;
        top += 1;
    }

    public Boolean enlarge() {
        if (capacity >= MAX_STACK_SIZE) return false;
        // Если размер больше макс.возможного, преобразуем его в int, если нет - используем макс.возможное
        int newCapacityL = capacity * 2;
        int newCapacity = Math.min(newCapacityL, MAX_STACK_SIZE);

        // Ниже - копирование данных в новый массив
        arr = Arrays.copyOf(arr, newCapacity);
        capacity = newCapacity;
        return true;
    }

    public int pop() {
        if (top == 0) {
            return Integer.MIN_VALUE;
        }

        top -= 1;
        if (arr[top] == minElement) {
            minElement = arr[0];

            // Устанавливаем значение мин.элемента:
            if (peek() == Integer.MIN_VALUE) minElement = Integer.MIN_VALUE;
            else {
                for (int i = 0; i < top; i++) {
                    if (arr[i] < minElement) minElement = arr[i];
                }
            }
        }
        return arr[top];
    }

    public int peek() {
        if (top == 0)
            return Integer.MIN_VALUE;
        else
            return arr[top - 1];
    }

    public int getMin() {
        return minElement;
    }

    public int get_stack_size() {
        return top;
    }
}

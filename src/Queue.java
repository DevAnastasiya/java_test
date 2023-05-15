public class Queue {
    private final ArrayBasedStack stack_one;
    private ArrayBasedStack stack_two;

    public Queue() {
        stack_one = new ArrayBasedStack();
        stack_two = new ArrayBasedStack();
    }

    public void push(int element) {
        stack_one.push(element);
    }

    public int pop() {
        // заполнение стека №2, если пустой
        if (stack_two.peek() == Integer.MIN_VALUE) {
            while (stack_one.peek() != Integer.MIN_VALUE) {
                int element = stack_one.pop();
                stack_two.push(element);
            }
        }
        // вынуть элемент из стека №2
        return stack_two.pop();
    }

    public int getMin() {

        if (stack_one.peek() == Integer.MIN_VALUE)
            return stack_two.getMin();
        else {
            int min_first = stack_one.getMin();
            int min_second = stack_two.getMin();
            return Math.min(min_first, min_second);
        }
    }

    public void clear() {

    }

    public void peek() {
        stack_two.peek();
    }
}

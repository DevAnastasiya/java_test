import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyLinkedList<T> {
    private Node<T> head;

    public void linked_list_to_linked_hash_set() {

        Node<T> ptr = head;
        LinkedHashSet<T> lhset = new LinkedHashSet<>();

        // переводим лист в LinkedHashSet
        while (ptr != null) {
            if (lhset.contains(ptr.data)) {
                delete(ptr.data);
                ptr = ptr.next;
            } else {
                lhset.add(ptr.data);
                ptr = ptr.next;
            }
        }
        System.out.println(lhset);
    }

    public void make_a_cycle(int t1, int t2) { // t1 будет ссылаться на t2
        Node<T> ptr1, ptr2;
        ptr1 = ptr2 = head;

        // находим первый эл-т
        for (int i = 0; i < t1; i++) ptr1 = ptr1.next;
        // находим второй эл-т
        for (int i = 0; i < t2; i++) ptr2 = ptr2.next;

        ptr1.next = ptr2;
        //System.out.println(ptr1.data); // для проверки
        //System.out.println(ptr1.next.data); // для проверки
        //System.out.println(ptr2.data); // для проверки
    }

    public Boolean find_cycles_with_hashset() {
        Node<T> ptr = head;
        Boolean cycled = true;
        LinkedHashSet<Node<T>> lhset = new LinkedHashSet<>();

        while (ptr != null) {
            if (lhset.contains(ptr)) {
                return cycled;
            }
            lhset.add(ptr);
            System.out.println("Node with data \"" + ptr.data + "\" has been added");
            ptr = ptr.next;
        }
        System.out.println("Список не зациклен");
        return false;
    }

    // Узнать индекс эл-та в конечном списке
    public int get_indice(T t) {

        int indice = 0;
        Node<T> ptr = head;

        if (ptr.data != t) {
            ptr = ptr.next;
            indice++;
            System.out.println(indice);
        }
        if (ptr.data == t) {
            System.out.println("Indice of the element is " + indice);
            return indice;
        }
        if (ptr == null) {
            System.out.println("This element doesn't exist");
            return -1;
        }
        return indice;
    }

    public Boolean check_for_cycles() {

        Node<T> flag = head;
        Node<T> ptr = head;
        Boolean cycled = true;

        while (ptr.next != null) {
            if (ptr.next.next == null) {
                return false;
            } else {
                flag = flag.next;
                ptr = ptr.next.next;
                if (ptr == flag) {
                    return cycled;
                }
            }
        }
        return false;
    }

    public void remove_duplicates() {

        Node<T> curr = head; //с этим эл-том будут сравниваться последующие
        Node<T> ptr; // указатель указывает на то, что сравнивают с curr

        while (curr != null) {
            ptr = curr;

            while (ptr.next != null) {

                if (curr.data == ptr.next.data) {
                    System.out.println("Коллизия");
                    ptr.next = ptr.next.next;
                } else ptr = ptr.next;
            }
            curr = curr.next;
        }
    }

    public void push_front(T t) {
        Node<T> newFirstNode = new Node<>(t);
        newFirstNode.next = head;
        head = newFirstNode;
    }

    public void push_back(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }

        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node<>(t);
    }

    // поиск эл-та
    public int get(T t) {
        if (head == null) return -1; // вернуть -1 если эл-т не найден

        if (head.data == t) {
            return 0;
        }

        Node<T> curr = head;
        int result = 0;
        while (curr.next != null) {
            ++result;
            if (curr.next.data == t) return result;

            curr = curr.next;
        }

        return -1;
    }

    public T get_first_element() {
        return head.data;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public void delete_first_element() {
        Node<T> ptr = head;
        head = ptr.next;
    }

    public void delete(T t) {
        if (head == null) return;

        if (head.data == t) {
            head = head.next;
            return;
        }

        Node<T> curr = head;
        while (curr.next != null) {
            if (curr.next.data == t) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

        curr = curr.next;
    }

    @Override // Generate -> ToString()
    public String toString() {
        return "LinkedList{" +
                "head= " + head +
                '}';
    }

    private static class Node<T> {
        private final T data;
        private Node<T> next; // ссылка на след.эл-т

        private Node(T data) { // это автоматически переопределенный конструктор
            this.data = data;
        }

        @Override
        public String toString() { // Generate -> ToString()
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
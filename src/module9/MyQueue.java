package module9;

public class MyQueue<T> {

    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size;

    public void add(T value) {
        if (firstElement == null) {
            firstElement = new Node<T>(value);
            lastElement = firstElement;
        } else {
            Node<T> tempElement = lastElement;
            lastElement = new Node<T>(value);
            tempElement.next = lastElement;
            lastElement.prev = tempElement;
        }
        size++;
    }

    public void clear() {
        size = 0;
        firstElement = null;
        lastElement = null;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (firstElement != null) {
            return firstElement.value;
        }
        return null;
    }

    public T poll() {
        if (firstElement != null) {
            T toBePolled = firstElement.value;
            firstElement = firstElement.next;

            if (firstElement != null) {
                firstElement.prev = null;
            }
            size--;
            return toBePolled;
        }
        return null;
    }

    class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;


        public Node(T value) {
            this.value = value;
        }
    }
}

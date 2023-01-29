package module9;

public class MyStack<T> {

    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size;

    public void push(T value) {
        if (firstElement == null) {
            firstElement = new Node<T>(value);
            lastElement = firstElement;
        } else {
            Node tempElement = lastElement;
            lastElement = new Node<T>(value);
            tempElement.next = lastElement;
            lastElement.prev = tempElement;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }

        Node<T> toBeRemoved = getNode(index);
        Node<T> prev = toBeRemoved.prev;
        Node<T> next = toBeRemoved.next;
        if (prev != null) {
            prev.next = next;
        }
        if (next != null) {
            next.prev = prev;
        }
        if (prev == null && next == null) {
            firstElement = null;
            lastElement = null;
        }
        size--;
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
        if (lastElement != null) {
            return lastElement.value;
        }
        return null;
    }

    public T poll() {
        if (lastElement != null) {
            T toBePolled = lastElement.value;
            lastElement = lastElement.prev;

            if (lastElement != null) {
                lastElement.next = null;
            } else {
                firstElement = null;
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

    private Node<T> getNode(int index) {
        int i = 0;
        Node<T> result = firstElement;
        while (i < index) {
            result = result.next;
            i++;
        }
        return result;
    }
}

package module9;

public class MyQueue {

    private Node firstElement;
    private Node lastElement;
    private int size;

    public void add(Object value) {
        if (firstElement == null) {
            firstElement = new Node(value);
            lastElement = firstElement;
        } else {
            Node tempElement = lastElement;
            lastElement = new Node(value);
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

    public Object peek() {
        if (firstElement != null) {
            return firstElement.value;
        }
        return null;
    }

    public Object poll() {

        if (firstElement != null) {
            Object toBePolled = firstElement.value;
            firstElement = firstElement.next;

            if (firstElement != null) {
                firstElement.prev = null;
            }
            size--;
            return toBePolled;
        }
        return null;
    }

    class Node {
        private Object value;
        private Node prev;
        private Node next;


        public Node(Object value) {
            this.value = value;
        }
    }
}

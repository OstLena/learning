package module9;

public class MyStack {

    private Node firstElement;
    private Node lastElement;
    private int size;

    public void push(Object value) {
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

    public void remove(int index){

        Node toBeRemoved = getNode(index);
        Node prev = toBeRemoved.prev;
        Node next = toBeRemoved.next;
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

    public Object peek() {
        if (lastElement != null) {
            return lastElement.value;
        }
        return null;
    }

    public Object poll() {
        if (lastElement != null) {
            Object toBePolled = lastElement.value;
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

    class Node {
        private Object value;
        private Node prev;
        private Node next;


        public Node(Object value) {
            this.value = value;
        }
    }

    private Node getNode(int index) {
        int i = 0;
        Node result = firstElement;
        while (i < index) {
            result = result.next;
            i++;
        }
        return result;
    }
}

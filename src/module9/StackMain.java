package module9;

public class StackMain {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        System.out.println(myStack.peek());

        Object next = myStack.poll();
        while (next != null) {
            System.out.println(next);
            next = myStack.poll();
        }

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        myStack.clear();
        System.out.println(myStack.peek());
        System.out.println(myStack.poll());
        System.out.println(myStack.size());
    }
}

package module9;

public class QueueMain {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            myQueue.add(i);
        }

        System.out.println(myQueue.peek());

        Object next = myQueue.poll();
        while (next != null) {
            System.out.println(next);
            next = myQueue.poll();
        }
//        for (int i = 0; i < myQueue.size(); i++) {
//            System.out.println(myQueue.poll());
//        }

        for (int i = 0; i < 10; i++) {
            myQueue.add(i);
        }
        myQueue.clear();
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
    }
}

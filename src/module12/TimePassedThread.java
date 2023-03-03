package module12;

import java.util.concurrent.atomic.AtomicLong;

public class TimePassedThread {
//    Напишіть програму, яка кожну секунду відображає на екрані дані про час, що минув від моменту запуску програми.
//
//    Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.


    public static void main(String[] args) throws InterruptedException {

        Thread firstThread = new Thread(new Runnable() {

            AtomicLong currentTime = new AtomicLong(0);

            @Override
            public void run() {
                while (true) {
                    long timePassed = currentTime.addAndGet(1);

                    System.out.println("Since program started total time in seconds passed: " + timePassed);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        Thread secondThread = new Thread(() -> {

            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("5 seconds passed");
            }
        });
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

    }
}

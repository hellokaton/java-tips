package javatips.jvmtools.jstack;

import java.util.concurrent.TimeUnit;

/**
 * 挂起线程
 *
 * @author biezhi
 * @date 2018-11-05
 */
public class WaitExample {


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println("hello");
                    while (true) {
                        TimeUnit.SECONDS.sleep(1);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("jvm-wait-example");
        thread.start();

        int count = 0;
        while (true) {
            if (count == 5) {
                synchronized (lock) {
                    lock.notify();
                }
            }
            TimeUnit.SECONDS.sleep(1);
            count++;
        }

    }
}

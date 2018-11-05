package javatips.jvmtools.jstack;

import java.util.concurrent.TimeUnit;

/**
 * CPU 过高
 */
public class HighCPUExample {

    private static int count;

    private static void calc() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        // 开启子线程
        Thread thread1 = new Thread(() -> {
            while (true) {
                calc();
            }
        });
        thread1.setName("occupy-cpu");
        thread1.start();

        System.out.println("tid:" + thread1.getId());

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("dididi 稳定运行");
                } catch (Exception e) {
                }
            }
        });

        thread2.setName("dididi");
        thread2.start();

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("主线程在运行...");
        }

    }

}

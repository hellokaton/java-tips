package javatips.jvmtools.jstack;

/**
 * 死锁
 */
public class DeadLockExample {

    private static Object Lock1 = new Object();
    private static Object Lock2 = new Object();

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: 持有 Lock1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }

                System.out.println("Thread 1: 等待 Lock2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: 持有 Lock1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: 持有 Lock2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }

                System.out.println("Thread 2: 等待 Lock1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: 持有 Lock1 & 2...");
                }
            }
        }
    }

    public static void main(String[] args) {
        new ThreadDemo1().start();
        new ThreadDemo2().start();
    }

}
package javatips.debug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程调试
 *
 * @author biezhi
 * @date 2018/8/14
 */
public class Example4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable r1 = () -> {
            System.out.println("当前线程: " + Thread.currentThread().getName());
            System.out.println("少小离家老大回，菊花变成向日葵。");
        };

        Runnable r2 = () -> {
            System.out.println("当前线程: " + Thread.currentThread().getName());
            System.out.println("有钱人终成眷属，有情人终生痛苦。");
        };

        Runnable r3 = () -> {
            System.out.println("当前线程: " + Thread.currentThread().getName());
            System.out.println("问世间情为何物，不过一物降一物。");
        };

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        System.out.println("山外青山楼外楼，没房结婚真发愁。");

        executorService.shutdown();
    }

}

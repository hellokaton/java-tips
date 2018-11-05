package javatips.jvmtools;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @author biezhi
 * @date 2018/10/12
 */
public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("args: " + Arrays.toString(args));
        while (true) {
            System.out.println("2333");
            TimeUnit.SECONDS.sleep(1);
        }
    }

}

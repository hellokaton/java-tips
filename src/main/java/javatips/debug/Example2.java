package javatips.debug;

/**
 * 条件断点
 *
 * @author biezhi
 * @date 2018/8/14
 */
public class Example2 {

    private static void execute(int num) {
        System.out.println("execute: " + num);
        // TODO
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            execute(i);
        }
    }

}

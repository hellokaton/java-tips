package javatips.exception;

/**
 * 指定具体异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example2 {

    public void doNotDoThis() throws Exception {
        Integer year = Integer.parseInt("biezhi???");
        System.out.println("哦 " + year);
    }

    public void doThis() throws NumberFormatException {
        Integer year = Integer.parseInt("biezhi???");
        System.out.println("哦 " + year);
    }

}

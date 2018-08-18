package javatips.debug;

/**
 * 基本使用
 *
 * @author biezhi
 * @date 2018/8/17
 */
public class Example1 {

    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }

    private static void helloIntelliJ() {
        System.out.println("我来自北方，请不要为难我");
        System.out.println("因为我只是一只小猫咪");
        Runtime runtime = Runtime.getRuntime();
//        throw new CustomException("I,m worry.");
    }

    public static void main(String[] args) {
        helloIntelliJ();
        System.out.println("No 啪不了木.");
    }

}

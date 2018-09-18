package javatips.exception;

/**
 * 包装异常不要丢弃原始异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example9 {

    class MyBusinessException extends Exception {
        public MyBusinessException(String message) {
            super(message);
        }
        public MyBusinessException(String message, Throwable cause) {
            super(message, cause);
        }

    }

    public void wrapException(String id) throws MyBusinessException {
        try {
            long userId = Long.parseLong(id);
            System.out.println("userId: " + userId);
        } catch (NumberFormatException e) {
            throw new MyBusinessException("描述错误的消息", e);
        }
    }

    public static void main(String[] args) throws MyBusinessException {
        new Example9().wrapException("emmm");
    }

}

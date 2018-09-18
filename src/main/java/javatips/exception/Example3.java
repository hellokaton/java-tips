package javatips.exception;

/**
 * 给异常加点说明
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example3 {

    class NotFoundGirlFriendException extends Exception {

        public NotFoundGirlFriendException(String message) {
            super(message);
        }
    }

    /**
     * 当心抛出 NotFoundGirlFriendException...
     *
     * @param input
     * @throws NotFoundGirlFriendException 如果你不订阅 ... 那么😁😁😁
     */
    public void doSomething(String input) throws NotFoundGirlFriendException {

    }

}

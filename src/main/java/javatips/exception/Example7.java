package javatips.exception;

/**
 * 不要忽略异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example7 {

    public void doNotIgnoreExceptions() {
        try {
            // 做点什么吧，先生
        } catch (NumberFormatException e) {
            // 嘤该不会走到这里（不，一定不会的）
        }
    }

}

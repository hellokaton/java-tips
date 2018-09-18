package javatips.exception;

/**
 * 不要捕获 Throwable
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example6 {

    public void doNotCatchThrowable() {
        try {
            // 做点什么吧
        } catch (Throwable t) {
            // 停下来，不要 🙅 这么干
        }
    }

}

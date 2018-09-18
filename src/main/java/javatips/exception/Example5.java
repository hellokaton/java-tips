package javatips.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 优先捕获具体异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example5 {

    private static final Logger log = LoggerFactory.getLogger(Example5.class);

    public void catchMostSpecificExceptionFirst() {
        try {
            doSomething("不要跟我讲这些，因为我只是一只小猫咪！");
        } catch (NumberFormatException e) {
            log.error("字符串转数字失败", e);
        } catch (IllegalArgumentException e) {
            log.error("非法参数", e);
        }
    }

    private void doSomething(String message) {
        Integer emmm = Integer.parseInt(message);
    }

    public static void main(String[] args) {
        new Example5().catchMostSpecificExceptionFirst();
    }

}

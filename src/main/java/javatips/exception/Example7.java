package javatips.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 不要忽略异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example7 {

    private static final Logger log = LoggerFactory.getLogger(Example7.class);

    public void doNotIgnoreExceptions() {
        try {
            // 做点什么吧，先生
        } catch (NumberFormatException e) {
            // 嘤该不会走到这里（不，一定不会的）
            log.error("不可能走到的", e);
        }
    }

}

package javatips.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用描述性消息抛出异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example4 {

    private static final Logger log = LoggerFactory.getLogger(Example4.class);

    public void foo() {
        try {
            new Long("biezhi大法好");
        } catch (NumberFormatException e) {
            log.error("用户ID格式化失败", e);
        }
    }

}

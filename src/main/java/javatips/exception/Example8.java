package javatips.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 不要同时记录并抛出异常
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example8 {

    private static final Logger log = LoggerFactory.getLogger(Example8.class);

    public void foo() {
        try {
            new Long("xyz");
        } catch (NumberFormatException e) {
//            log.error("", e);
            throw e;
        }
    }

    public static void main(String[] args) {
        new Example8().foo();
    }
}

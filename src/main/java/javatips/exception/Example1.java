package javatips.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 在 Finally 中清理资源，或者使用 Try-With-Resource 语句
 *
 * @author biezhi
 * @date 2018/9/18
 */
public class Example1 {

    private static final Logger log = LoggerFactory.getLogger(Example1.class);

    public void doNotCloseResourceInTry() {
        FileInputStream inputStream = null;
        try {
            File file = new File("./王爵的私有宝贝.txt");
            inputStream = new FileInputStream(file);
            // 使用 inputStream 读取文件内容

            // 兄弟，不要这么做
            inputStream.close();
        } catch (FileNotFoundException e) {
            log.error("", e);
        } catch (IOException e) {
            log.error("", e);
        }
    }

    public void closeResourceInFinally() {
        FileInputStream inputStream = null;
        try {
            File file = new File("./王爵的私有宝贝.txt");
            inputStream = new FileInputStream(file);
            // 使用 inputStream 读取文件内容

        } catch (FileNotFoundException e) {
            log.error("", e);
        } catch (IOException e) {
            log.error("", e);
        } finally {
            if(null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.error("关闭流失败", e);
                }
            }
        }
    }

    public void autoCloseResource() {
        File file = new File("./王爵的私有宝贝.txt");
        try (FileInputStream inputStream = new FileInputStream(file)){
            // 使用 inputStream 读取文件内容

        } catch (FileNotFoundException e) {
            log.error("", e);
        } catch (IOException e) {
            log.error("", e);
        }
    }

}

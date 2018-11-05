package javatips.jvmtools.jstack;

import java.io.IOException;
import java.io.InputStream;

/**
 * 等待 IO
 *
 * @author biezhi
 * @date 2018-11-05
 */
public class WaitIOExample {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int         i  = is.read();
        System.out.println("exit。");
    }

}

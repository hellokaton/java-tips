package javatips.lambda.exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static javatips.lambda.exception.LambdaExceptionUtil.*;

/**
 * @author biezhi
 * @date 2018/7/24
 */
public class Example {

    public static List<Class> findClasses(List<String> names) {
        return names.stream()
                .map(className -> uncheck(Class::forName, className))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        try {
            List<Class> classes = findClasses(Arrays.asList("Hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

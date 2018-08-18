package javatips.lambda.exception;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author biezhi
 * @date 2018/7/24
 */
public final class Unchecked {

    @FunctionalInterface
    interface ExceptionFunction<T, R> {
        R apply(T t) throws Exception;
    }

    public static <T, R> Function<T, R> wrap(ExceptionFunction<T, R> mapper) {
        Objects.requireNonNull(mapper);
        return t -> {
            try {
                return mapper.apply(t);
            } catch (Exception e) {
                throwException(e);
                return null;
            }
        };
    }

    public static <T extends Exception> void throwException(Exception e) throws T {
        throw (T) e;
    }

}

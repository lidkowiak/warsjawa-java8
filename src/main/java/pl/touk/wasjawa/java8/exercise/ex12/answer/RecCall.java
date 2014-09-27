package pl.touk.wasjawa.java8.exercise.ex12.answer;

import java.util.stream.Stream;

@FunctionalInterface
public interface RecCall<T> {

    RecCall<T> next();

    default boolean isDone() {
        return false;
    }

    default T getVal() {
        throw new IllegalStateException();
    }

    default T apply() {
        return Stream.iterate(this, RecCall::next)
                .filter(RecCall::isDone)
                .findAny()
                .get()
                .getVal();
    }

    public static <T> RecCall<T> cont(RecCall<T> nextCall) {
        return nextCall;
    }

    public static <T> RecCall<T> stop(T value) {
        return new RecCall<T>() {
            @Override
            public boolean isDone() {
                return true;
            }

            @Override
            public T getVal() {
                return value;
            }

            @Override
            public RecCall<T> next() {
                throw new IllegalStateException();
            }
        };
    }
}

package pl.touk.wasjawa.java8.exercise.ex09.answer;

import java.util.stream.IntStream;

public class Exercise09 {
    public static void main(String[] args) {
        IntStream.range(1, 100).mapToObj(Factorial::factorial).forEach(System.out::println);
    }

}

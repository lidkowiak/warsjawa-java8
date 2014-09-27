package pl.touk.wasjawa.java8.exercise.ex07.answer;

import java.util.function.Supplier;

public class Exercise07 {

    public static void main(String[] args) {
        Exercise07 exercise07 = new Exercise07();
        String chosen = exercise07.choose(1, () -> first(), () -> second(), () -> third());
        System.out.println("You choose " + chosen);
    }

    public String choose(int num, Supplier<String> first, Supplier<String> second, Supplier<String> third) {
        switch (num) {
            case 1:
                return first.get();
            case 2:
                return second.get();
            case 3:
                return third.get();
            default:
                throw new IllegalArgumentException("Illegal num " + num);
        }
    }

    private static String first() {
        System.out.println("Doing something");
        return "1st";
    }

    private static String second() {
        System.out.println("Doing something else");
        return "2nd";
    }

    private static String third() {
        System.out.println("... and again...");
        return "3rd";
    }

}

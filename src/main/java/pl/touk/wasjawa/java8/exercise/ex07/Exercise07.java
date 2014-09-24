package pl.touk.wasjawa.java8.exercise.ex07;

public class Exercise07 {

    public static void main(String[] args) {
        Exercise07 exercise07 = new Exercise07();
        String chosen = exercise07.choose(1, first(), second(), third());
        System.out.println("You choose " + chosen);
    }

    public String choose(int num, String first, String second, String third) {
        switch (num) {
            case 1:
                return first;
            case 2:
                return second;
            case 3:
                return third;
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

package pl.touk.wasjawa.java8.exercise.ex11;

public class Exercise11 {

    private final int sum;

    public Exercise11(int sum) {
        this.sum = sum;
    }

    public Exercise11 add(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("arg can not be negative number, given " + x);
        }
        return new Exercise11(sum + x);
    }
}

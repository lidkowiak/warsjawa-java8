package pl.touk.wasjawa.java8.exercise.ex12;

import java.math.BigInteger;

public class Exercise12 {

    public BigInteger fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive number, given" + n);
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return fib(n-1).add(fib(n - 2));
    }
}

package pl.touk.wasjawa.java8.exercise.ex09.answer;

import java.math.BigInteger;

public class Factorial {

    private static Cache<Integer, BigInteger> cache = new Cache<>();

    public static BigInteger factorial(int n) {
        return cache.getOrCache(n, () -> calculateFactorial(n));
    }

    private static BigInteger calculateFactorial(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }
}

package pl.touk.wasjawa.java8.exercise.ex09;

import java.math.BigInteger;

public class Factorial {

    private static Cache<Integer, BigInteger> cache = new Cache<>();

    public static BigInteger factorial(int n) {
        if (cache.isInCache(n)){
            return cache.get(n);
        }
        BigInteger factorial = calculateFactorial(n);
        cache.cacheValue(n, factorial);
        return factorial;
    }

    private static BigInteger calculateFactorial(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }
}

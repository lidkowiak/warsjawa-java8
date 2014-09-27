package pl.touk.wasjawa.java8.exercise.ex10.answer;

import pl.touk.wasjawa.java8.exercise.ex10.BigDecimalStats;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

class BigDecimalStatCollector implements Collector<BigDecimal, BigDecimalStatCollector.BigDecimalMutableStats, BigDecimalStats> {

    @Override
    public Supplier<BigDecimalMutableStats> supplier() {
        return () -> new BigDecimalMutableStats();
    }

    @Override
    public BiConsumer<BigDecimalMutableStats, BigDecimal> accumulator() {
        return (acc, num) -> {
            if (acc.min == null || acc.min.compareTo(num) > 0) {
                acc.min = num;
            }
            if (acc.max == null || acc.max.compareTo(num) < 0) {
                acc.max = num;
            }
            acc.sum = acc.sum.add(num);
            acc.count = acc.count.add(BigInteger.ONE);
        };
    }

    @Override
    public BinaryOperator<BigDecimalMutableStats> combiner() {
        return (leftAcc, rightAcc) -> new BigDecimalMutableStats(
                leftAcc.min.min(rightAcc.min),
                leftAcc.max.max(rightAcc.max),
                leftAcc.sum.add(rightAcc.sum),
                leftAcc.count.add(rightAcc.count)
        );
    }

    @Override
    public Function<BigDecimalMutableStats, BigDecimalStats> finisher() {
        return mutable -> new BigDecimalStats(Optional.ofNullable(mutable.min), Optional.ofNullable(mutable.max), mutable.sum, mutable.avg(), mutable.count);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED);
    }

    static class BigDecimalMutableStats {
        BigDecimal min;
        BigDecimal max;
        BigDecimal sum = BigDecimal.ZERO;
        BigInteger count = BigInteger.ZERO;

        BigDecimalMutableStats() {
        }

        BigDecimalMutableStats(BigDecimal min, BigDecimal max, BigDecimal sum, BigInteger count) {
            this.min = min;
            this.max = max;
            this.sum = sum;
            this.count = count;
        }

        BigDecimal avg() {
            if (BigInteger.ZERO.compareTo(count) == 0) {
                return BigDecimal.ZERO;
            }
            return sum.divide(new BigDecimal(count), RoundingMode.HALF_DOWN);
        }
    }
}

package pl.touk.wasjawa.java8.exercise.ex10.answer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import pl.touk.wasjawa.java8.exercise.ex10.BigDecimalStats;

public class BigDecimalStatCollector {

    public static final Collector<BigDecimal, BigDecimalMutableStats, BigDecimalStats> INSTANCE = Collector
	    .of(() -> new BigDecimalMutableStats(),
		    (acc, num) -> acc.consume(num),
		    (leftAcc, rightAcc) -> leftAcc.combine(rightAcc),
		    mutable -> mutable.toBigDecimalStats(),
		    Characteristics.CONCURRENT, Characteristics.UNORDERED);

    static class BigDecimalMutableStats {
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal sum = BigDecimal.ZERO;
	private BigInteger count = BigInteger.ZERO;

	private BigDecimalMutableStats() {
	}

	BigDecimal avg() {
	    return BigInteger.ZERO.equals(count) ? BigDecimal.ZERO : sum
		    .divide(new BigDecimal(count), RoundingMode.HALF_DOWN);
	}

	void consume(BigDecimal num) {
	    min = min(min, num);
	    max = max(max, num);
	    sum = sum.add(num);
	    count = count.add(BigInteger.ONE);
	}

	BigDecimalMutableStats combine(BigDecimalMutableStats other) {
	    min = min(min, other.min);
	    max = max(max, other.max);
	    sum = sum.add(other.sum);
	    count = count.add(other.count);
	    return this;
	}

	BigDecimal min(BigDecimal a, BigDecimal b) {
	    return (a == null || a.compareTo(b) > 0) ? b : a;
	}

	BigDecimal max(BigDecimal a, BigDecimal b) {
	    return (a == null || a.compareTo(b) < 0) ? b : a;
	}

	BigDecimalStats toBigDecimalStats() {
	    return new BigDecimalStats(Optional.ofNullable(min),
		    Optional.ofNullable(max), sum, avg(), count);
	}
    }
}

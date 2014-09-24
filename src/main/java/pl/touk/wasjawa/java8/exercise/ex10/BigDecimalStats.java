package pl.touk.wasjawa.java8.exercise.ex10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class BigDecimalStats {
    private final Optional<BigDecimal> min;
    private final Optional<BigDecimal> max;
    private final BigDecimal sum;
    private final BigDecimal avg;
    private final BigInteger count;

    public BigDecimalStats(Optional<BigDecimal> min, Optional<BigDecimal> max, BigDecimal sum, BigDecimal avg, BigInteger count) {
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.avg = avg;
        this.count = count;
    }

    public Optional<BigDecimal> getMin() {
        return min;
    }

    public Optional<BigDecimal> getMax() {
        return max;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public BigInteger getCount() {
        return count;
    }
}

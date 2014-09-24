package pl.touk.wasjawa.java8.exercise.ex10;

import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

public class StockService {
    public BigDecimalStats stocksStats(List<Stock> stocks) {
        BigDecimal min = null;
        BigDecimal max = null;
        BigDecimal sum = BigDecimal.ZERO;
        BigInteger count = BigInteger.ZERO;
        for (Stock stock : stocks) {
            if (min == null || min.compareTo(stock.getPrice()) > 0) {
                min = stock.getPrice();
            }
            if (max == null || max.compareTo(stock.getPrice()) < 0) {
                max = stock.getPrice();
            }
            sum = sum.add(stock.getPrice());
            count = count.add(BigInteger.ONE);
        }
        BigDecimal avg = (BigInteger.ZERO.compareTo(count) == 0) ? BigDecimal.ZERO : sum.divide(new BigDecimal(count), RoundingMode.HALF_DOWN);
        return new BigDecimalStats(Optional.ofNullable(min), Optional.ofNullable(max), sum, avg, count);
    }

}

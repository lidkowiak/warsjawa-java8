package pl.touk.wasjawa.java8.exercise.ex02.answer;

import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;

import java.math.BigDecimal;
import java.util.List;

public class StocksService {

    private static final BigDecimal EXPENSIVE_STOCK_LIMIT = BigDecimal.valueOf(100);

    public BigDecimal totalValueOfExpensiveStocks(List<Stock> stocks) {
        return stocks.stream()
                .map(stock -> stock.getPrice())
                .filter(price -> EXPENSIVE_STOCK_LIMIT.compareTo(price) < 0)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}

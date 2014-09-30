package pl.touk.wasjawa.java8.exercise.ex10.answer;

import java.util.List;

import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;
import pl.touk.wasjawa.java8.exercise.ex10.BigDecimalStats;

public class StockService {
    public BigDecimalStats stocksStats(List<Stock> stocks) {
        return stocks.stream()
                .map(Stock::getPrice)
                .collect(BigDecimalStatCollector.INSTANCE);
    }

}

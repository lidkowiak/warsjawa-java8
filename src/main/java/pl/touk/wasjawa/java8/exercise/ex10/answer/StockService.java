package pl.touk.wasjawa.java8.exercise.ex10.answer;

import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;
import pl.touk.wasjawa.java8.exercise.ex10.BigDecimalStats;

import java.util.List;

public class StockService {
    public BigDecimalStats stocksStats(List<Stock> stocks) {
        return stocks.stream()
                .map(Stock::getPrice)
                .collect(new BigDecimalStatCollector());
    }

}

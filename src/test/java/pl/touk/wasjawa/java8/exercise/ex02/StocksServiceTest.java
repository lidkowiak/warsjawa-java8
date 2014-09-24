package pl.touk.wasjawa.java8.exercise.ex02;

import org.junit.Test;
import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StocksServiceTest {

    private final StocksService stocksService = new StocksService();

    @Test
    public void shouldAddAllStockValueGraterThenOneHundred() {
        //given
        List<Stock> stocks = Arrays.asList(
                new Stock("ALIOR", BigDecimal.valueOf(78)),
                new Stock("ASSECOPOL", BigDecimal.valueOf(43.3)),
                new Stock("BOGDANKA", BigDecimal.valueOf(114.55)),
                new Stock("BZWBK", BigDecimal.valueOf(364.25)),
                new Stock("EUROCASH", BigDecimal.valueOf(34.8)),
                new Stock("JSW", BigDecimal.valueOf(31.9)),
                new Stock("KERNEL", BigDecimal.valueOf(27.52)),
                new Stock("KGHM", BigDecimal.valueOf(135.2))
        );

        //when
        BigDecimal expensiveStocksValue = stocksService.totalValueOfExpensiveStocks(stocks);

        //then
        BigDecimal expected = BigDecimal.valueOf(614);
        assertEquals(0, expected.compareTo(expensiveStocksValue));
    }

    @Test
    public void shouldNotAddStockValueEqualOneHundred() {
        //given
        List<Stock> stocks = Arrays.asList(
                new Stock("ALIOR", BigDecimal.valueOf(78)),
                new Stock("ASSECOPOL", BigDecimal.valueOf(100)),
                new Stock("BOGDANKA", BigDecimal.valueOf(114.55)),
                new Stock("BZWBK", BigDecimal.valueOf(364.25)),
                new Stock("EUROCASH", BigDecimal.valueOf(34.8)),
                new Stock("JSW", BigDecimal.valueOf(31.9)),
                new Stock("KERNEL", BigDecimal.valueOf(27.52)),
                new Stock("KGHM", BigDecimal.valueOf(135.2))
        );

        //when
        BigDecimal expensiveStocksValue = stocksService.totalValueOfExpensiveStocks(stocks);

        //then
        BigDecimal expected = BigDecimal.valueOf(614);
        assertEquals(0, expected.compareTo(expensiveStocksValue));
    }

    @Test
    public void shouldReturnZeroWhenNoStocksGraterThenOneHundred() {
        //given
        List<Stock> stocks = Arrays.asList(
                new Stock("ALIOR", BigDecimal.valueOf(78)),
                new Stock("EUROCASH", BigDecimal.valueOf(34.8)),
                new Stock("JSW", BigDecimal.valueOf(31.9)),
                new Stock("KERNEL", BigDecimal.valueOf(27.52))
        );

        //when
        BigDecimal expensiveStocksValue = stocksService.totalValueOfExpensiveStocks(stocks);

        //then
        BigDecimal expected = BigDecimal.valueOf(0);
        assertEquals(0, expected.compareTo(expensiveStocksValue));
    }

    @Test
    public void shouldReturnZeroWhenStockListIsEmpty() {
        //given
        List<Stock> stocks = Collections.emptyList();

        //when
        BigDecimal expensiveStocksValue = stocksService.totalValueOfExpensiveStocks(stocks);

        //then
        BigDecimal expected = BigDecimal.valueOf(0);
        assertEquals(0, expected.compareTo(expensiveStocksValue));
    }

}
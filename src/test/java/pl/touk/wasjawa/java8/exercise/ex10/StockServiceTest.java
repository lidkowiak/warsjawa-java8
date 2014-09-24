package pl.touk.wasjawa.java8.exercise.ex10;

import org.junit.Assert;
import org.junit.Test;
import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StockServiceTest {

    private final StockService stockService = new StockService();

    @Test
    public void shouldCalculateStockStats() {
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
        BigDecimalStats stats = stockService.stocksStats(stocks);

        //then
        Assert.assertEquals(BigDecimal.valueOf(27.52), stats.getMin().get());
        Assert.assertEquals(BigDecimal.valueOf(364.25), stats.getMax().get());
        Assert.assertEquals(BigDecimal.valueOf(829.52), stats.getSum());
        Assert.assertEquals(BigInteger.valueOf(stocks.size()), stats.getCount());
        Assert.assertEquals(BigDecimal.valueOf(103.69), stats.getAvg());
    }

    @Test
    public void shouldReturnsNullsOnEmptyStockList() {
        //given
        List<Stock> stocks = Collections.emptyList();

        //when
        BigDecimalStats stats = stockService.stocksStats(stocks);

        //then
        Assert.assertEquals(Optional.empty(), stats.getMin());
        Assert.assertEquals(Optional.empty(), stats.getMax());
        Assert.assertEquals(BigInteger.ZERO, stats.getCount());
        Assert.assertEquals(BigDecimal.ZERO, stats.getSum());
        Assert.assertEquals(BigDecimal.ZERO, stats.getAvg());
    }

}

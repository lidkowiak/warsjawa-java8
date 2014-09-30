package pl.touk.wasjawa.java8.exercise.ex03;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import pl.touk.wasjawa.java8.exercise.common.stocks.Stock;
import pl.touk.wasjawa.java8.exercise.ex03.answer.StockService;

public class StockServiceTest {

    private final StockService stockService = new StockService();

    @Test
    public void shouldJoinCompanyNames() {
        //given
        List<Stock> stocks = Arrays.asList(
                new Stock("ALIOR", BigDecimal.valueOf(78)),
                new Stock("EUROCASH", BigDecimal.valueOf(34.8)),
                new Stock("JSW", BigDecimal.valueOf(31.9))
        );

        //when
        String companyNames = stockService.companyNames(stocks);

        //then
        assertEquals("[ALIOR, EUROCASH, JSW]", companyNames);
    }

    @Test
    public void shouldReturnNamesWithoutComaOnOneElementStockList() {
        //given
        List<Stock> stocks = Arrays.asList(new Stock("ALIOR", BigDecimal.valueOf(78)));

        //when
        String companyNames = stockService.companyNames(stocks);

        //then
        assertEquals("[ALIOR]", companyNames);
    }

    @Test
    public void shouldReturnEmptyBracketsOnEmptyStockList() {
        //given
        List<Stock> stocks = Collections.emptyList();

        //when
        String companyNames = stockService.companyNames(stocks);

        //then
        assertEquals("[]", companyNames);
    }

}
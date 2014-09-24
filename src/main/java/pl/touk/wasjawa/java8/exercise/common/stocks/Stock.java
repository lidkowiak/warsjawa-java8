package pl.touk.wasjawa.java8.exercise.common.stocks;

import java.math.BigDecimal;

public class Stock {
    private final String companyName;
    private final BigDecimal price;

    public Stock(String companyName, BigDecimal price) {
        this.companyName = companyName;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

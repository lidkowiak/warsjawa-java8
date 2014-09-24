package pl.touk.wasjawa.java8.exercise.ex13.clasicAnswer;

import pl.touk.wasjawa.java8.exercise.ex13.User;

import java.math.BigDecimal;

public class InvoiceItem {
    private String domainName;
    private BigDecimal netPrice;
    private BigDecimal taxPercent;
    private User buyer;
    private InvoiceItemAction invoiceItemAction;

    public InvoiceItem(String domainName, BigDecimal netPrice, BigDecimal taxPercent, User buyer, InvoiceItemAction invoiceItemAction) {
        this.domainName = domainName;
        this.netPrice = netPrice;
        this.taxPercent = taxPercent;
        this.buyer = buyer;
        this.invoiceItemAction = invoiceItemAction;
    }
}

package pl.touk.wasjawa.java8.exercise.ex13.classicAnswer;

import java.math.BigDecimal;

import pl.touk.wasjawa.java8.exercise.ex13.User;

public class InvoiceItem {
    private final String domainName;
    private final BigDecimal netPrice;
    private final BigDecimal taxPercent;
    private final User buyer;
    private final InvoiceItemAction invoiceItemAction;

    public InvoiceItem(String domainName, BigDecimal netPrice, BigDecimal taxPercent, User buyer, InvoiceItemAction invoiceItemAction) {
        this.domainName = domainName;
        this.netPrice = netPrice;
        this.taxPercent = taxPercent;
        this.buyer = buyer;
        this.invoiceItemAction = invoiceItemAction;
    }

    public void activate() {
	invoiceItemAction.activate();
    }
}

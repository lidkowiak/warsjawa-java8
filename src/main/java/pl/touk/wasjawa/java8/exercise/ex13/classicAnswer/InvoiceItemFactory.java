package pl.touk.wasjawa.java8.exercise.ex13.classicAnswer;

import java.math.BigDecimal;

import pl.touk.wasjawa.java8.exercise.ex13.DomainRegister;
import pl.touk.wasjawa.java8.exercise.ex13.User;

public class InvoiceItemFactory {

    private static final BigDecimal STANDARD_TAX_PERCENT = new BigDecimal("0.23");

    public static InvoiceItem domainRenewItem(String domainName, BigDecimal taxPercent, User buyer) {
        InvoiceItemAction action = new DomainRenewActionInvoiceItemAction(domainName, new DomainRegister());
        return new InvoiceItem(domainName, STANDARD_TAX_PERCENT, taxPercent, buyer, action);
    }

}

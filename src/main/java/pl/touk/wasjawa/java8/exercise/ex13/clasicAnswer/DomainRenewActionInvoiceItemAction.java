package pl.touk.wasjawa.java8.exercise.ex13.clasicAnswer;

import pl.touk.wasjawa.java8.exercise.ex13.DomainRegister;

public class DomainRenewActionInvoiceItemAction implements InvoiceItemAction {
    private final String domainName;
    private final DomainRegister domainRegister;

    public DomainRenewActionInvoiceItemAction(String domainName, DomainRegister domainRegister) {
        this.domainName = domainName;
        this.domainRegister = domainRegister;
    }

    @Override
    public void activate() {
        domainRegister.renew(domainName);
    }
}

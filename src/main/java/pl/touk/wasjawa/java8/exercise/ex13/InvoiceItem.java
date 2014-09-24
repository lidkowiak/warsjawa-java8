package pl.touk.wasjawa.java8.exercise.ex13;

import java.math.BigDecimal;

public class InvoiceItem {

    private DomainRegister domainRegister;
    private HostingApi hostingApi;

    private String domainName;
    private BigDecimal netPrice;
    private BigDecimal taxPercent;
    private OperationType operationType;
    private User buyer;

    public void activate() {
        if (operationType == OperationType.REGISTRY_Domain) {
            domainRegister.registry(domainName, buyer);
        }
        if (operationType == OperationType.RENEW_DOMAIN) {
            domainRegister.renew(domainName);
        }
        if (operationType == OperationType.REACTIVATE_DOMAIN) {
            domainRegister.reactivate(domainName);
        }
        if (operationType == OperationType.TERMINATION) {
            //Nothing to do
        }
        if (operationType == OperationType.REGISTRY_HOSTING) {
            hostingApi.newStandardSharedHosting(buyer);
        }
        throw new IllegalStateException();
    }

}

package pl.touk.wasjawa.java8.exercise.ex15.clasicAnswer;

import pl.touk.wasjawa.java8.exercise.ex15.User;

public class Invoice {

    private User user;
    private InvoiceNotification invoiceNotification;

    public Invoice(User user, InvoiceNotification invoiceNotification) {
        this.user = user;
        this.invoiceNotification = invoiceNotification;
    }

    public void sendInvoice() {
        invoiceNotification.sendInvoice(this);
    }

    public void sendPaymentReminder() {
        invoiceNotification.sendPaymentReminder(this);
    }
}

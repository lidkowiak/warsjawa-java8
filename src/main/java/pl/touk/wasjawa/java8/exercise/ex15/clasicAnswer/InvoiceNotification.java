package pl.touk.wasjawa.java8.exercise.ex15.clasicAnswer;

public interface InvoiceNotification {
    void sendInvoice(Invoice invoice);
    void sendPaymentReminder(Invoice invoice);
}

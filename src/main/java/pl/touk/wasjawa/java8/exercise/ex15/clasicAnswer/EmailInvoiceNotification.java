package pl.touk.wasjawa.java8.exercise.ex15.clasicAnswer;

public class EmailInvoiceNotification implements InvoiceNotification {
    @Override
    public void sendInvoice(Invoice invoice) {
        System.out.println("build and send email");
    }

    @Override
    public void sendPaymentReminder(Invoice invoice) {
        System.out.println("build and send email");
    }
}

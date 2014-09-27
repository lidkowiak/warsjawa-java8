package pl.touk.wasjawa.java8.exercise.ex15.answer;

import pl.touk.wasjawa.java8.exercise.ex15.User;

import java.util.function.Consumer;

public class Invoice {

    private User user;
    private Consumer<Invoice> sendInvoice;
    private Consumer<Invoice> sendPaymentReminder;

    public Invoice(User user, Consumer<Invoice> sendInvoice, Consumer<Invoice> sendPaymentReminder) {
        this.user = user;
        this.sendInvoice = sendInvoice;
        this.sendPaymentReminder = sendPaymentReminder;
    }

    public void sendInvoice() {
        sendInvoice.accept(this);
    }

    public void sendPaymentReminder() {
        sendPaymentReminder.accept(this);
    }
}

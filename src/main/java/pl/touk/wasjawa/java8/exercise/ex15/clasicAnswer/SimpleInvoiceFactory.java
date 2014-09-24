package pl.touk.wasjawa.java8.exercise.ex15.clasicAnswer;

import pl.touk.wasjawa.java8.exercise.ex15.User;

public class SimpleInvoiceFactory {

    public static Invoice invoice() {
        return new Invoice(new User("John Black"), new EmailInvoiceNotification());
    }

}

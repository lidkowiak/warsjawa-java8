package pl.touk.wasjawa.java8.exercise.ex15.answer;

import pl.touk.wasjawa.java8.exercise.ex15.User;

public class SimpleInvoiceFactory {

    public static Invoice invoice() {
        return new Invoice(
                new User("John Black"),
                invoice -> System.out.println("build and send email"),
                invoice -> System.out.println("send sms")
                );
    }

}

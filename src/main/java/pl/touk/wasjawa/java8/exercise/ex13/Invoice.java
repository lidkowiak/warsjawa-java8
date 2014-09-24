package pl.touk.wasjawa.java8.exercise.ex13;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private User buyer;
    private List<InvoiceItem> items;

    public Invoice(User buyer, List<InvoiceItem> items) {
        this.buyer = buyer;
        this.items = new ArrayList<>(items);
    }

    public void activate() {
        items.stream().forEach(InvoiceItem::activate);
    }
}

package com.kodilla.good.patterns.challenges.order;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String number;
    private User user;
    private List<InvoiceItem> items = new ArrayList();

    public Invoice(String number, User user) {
        this.number = number;
        this.user = user;
    }
    public User getUser() {

        return this.user;
    }
    public List<InvoiceItem> getItems() {

        return this.items;
    }
}

package com.kodilla.good.patterns.challenges.order;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "jan@gmail.com");
        Invoice invoice = new Invoice("1", user);
        OrderRequest orderRequest = new OrderRequest("1", invoice);
        invoice.getItems().add(new InvoiceItem(new Product("Concrete mixer", 100.0), 3));
        invoice.getItems().add(new InvoiceItem(new Product("Concrete", 5.0), 150));
        orderRequest.setInvoice(invoice);
        return orderRequest;
    }
}
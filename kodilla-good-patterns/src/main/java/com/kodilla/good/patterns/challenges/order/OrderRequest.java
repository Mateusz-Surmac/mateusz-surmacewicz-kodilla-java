package com.kodilla.good.patterns.challenges.order;

public class OrderRequest {
    private String number;
    private Invoice invoice;

    public OrderRequest(String number, Invoice invoice) {
        this.invoice = invoice;
        this.number = number;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}

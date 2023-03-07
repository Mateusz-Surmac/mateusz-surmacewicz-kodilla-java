package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.inovice.Invoice;
import com.kodilla.hibernate.inovice.Item;
import com.kodilla.hibernate.inovice.Product;
import com.kodilla.hibernate.inovice.dao.InvoiceDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testProductToItemToInvoice() {
        //Given
        Product soap = new Product("soap");

        Product cement = new Product("cement");
        Product oatmeal = new Product("oatmeal");

        Item item1 = new Item(soap, new BigDecimal(5),3,new BigDecimal(15));
        Item item2 = new Item(cement, new BigDecimal(60), 20, new BigDecimal(120));
        Item item3 = new Item(oatmeal,new BigDecimal(1), 122, new BigDecimal(122));

        Invoice invoice = new Invoice("467477466");
        invoice.getItemsList().add(item1);
        invoice.getItemsList().add(item2);
        invoice.getItemsList().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.deleteById(id);




    }


}

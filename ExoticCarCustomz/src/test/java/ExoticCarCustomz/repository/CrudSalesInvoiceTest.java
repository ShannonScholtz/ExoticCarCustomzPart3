package ExoticCarCustomz.repository;

import ExoticCarCustomz.App;
import ExoticCarCustomz.domain.SalesInvoice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CrudSalesInvoiceTest {

    private Long id;

    @Autowired
    SalesInvoiceRepository repository;
    @Test
    public void testCreate() throws Exception {
        List<SalesInvoice> inv = new ArrayList<SalesInvoice>();
        SalesInvoice invoice = new SalesInvoice.Builder(2345545)
                .date("5 May 2015").CarID(2576015).customerID(0505154544).totalPrice(12599.99).build();
        repository.save(invoice);
        id= invoice.getInvoiceID();
        Assert.assertNotNull(invoice.getInvoiceID());
    }

    @Test
    public void testRead() throws Exception {
        SalesInvoice salesin = repository.findOne(id);
        Assert.assertEquals("5 May 2015",salesin.getDate());
    }

    @Test
    public void testUpdate() throws Exception {

        SalesInvoice salesInvoice = repository.findOne(id);
        SalesInvoice sales = new SalesInvoice.Builder(345454).invoiceID(salesInvoice.getInvoiceID())
                .date("5 May 2015").CarID(4545453).customerID(0504554544).totalPrice(10000.00).build();
        repository.save(sales);
        Assert.assertEquals(345454, salesInvoice.getSalespersonID());
        Assert.assertEquals("5 May 2015", salesInvoice.getDate());
        Assert.assertEquals(4545453, salesInvoice.getCarID());
        Assert.assertEquals(0504554544, salesInvoice.getCustomerID());
        Assert.assertEquals(10000.00, salesInvoice.getTotalPrice(), 10000.00);


    }

    @Test
    public void testDelete() throws Exception {
        SalesInvoice salesInvoice = repository.findOne(id);
        repository.delete(salesInvoice);
        SalesInvoice sal = repository.findOne(id);
        Assert.assertNull(sal);


    }
}

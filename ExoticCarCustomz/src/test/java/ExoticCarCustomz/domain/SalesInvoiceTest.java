package ExoticCarCustomz.domain;

import ExoticCarCustomz.conf.factory.SalesInvoiceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class SalesInvoiceTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreateSalesInvoice() throws Exception {
        Map<String,String> values = new HashMap<String,String>();

        values.put("date","05/04/2015");

        SalesInvoice invoice = SalesInvoiceFactory
                .createSalesInvoice(201506077, 2015042910, 50910, 13500.00, values);

        Assert.assertEquals(201506077, invoice.getSalespersonID());
        Assert.assertEquals(2015042910, invoice.getCustomerID());
        Assert.assertEquals(50910, invoice.getCarID());
        Assert.assertEquals(13500.00, invoice.getTotalPrice(), 13500.00);
        Assert.assertEquals("05/04/2015", invoice.getDate());
    }

    @Test
    public void testUpdateSalesInvoice() throws Exception {
        Map<String,String> values = new HashMap<String,String>();

        values.put("date","05/04/2015");

        SalesInvoice invoice = SalesInvoiceFactory
                .createSalesInvoice(201506077, 2015042910, 50910, 13500.00, values);


        SalesInvoice newcustomer = new SalesInvoice
                .Builder(invoice.getSalespersonID())
                .copy(invoice)
                .customerID(2015063423)
                .CarID(60343)
                .totalPrice(7000.00)
                .date("06/06/2015")
                .build();

        Assert.assertEquals(201506077, newcustomer.getSalespersonID());

        Assert.assertEquals(2015042910, invoice.getCustomerID());
        Assert.assertEquals(2015063423, newcustomer.getCustomerID());

        Assert.assertEquals(50910, invoice.getCarID());
        Assert.assertEquals(60343, newcustomer.getCarID());

        Assert.assertEquals(13500.00, invoice.getTotalPrice(), 13500.00);
        Assert.assertEquals(7000.00, newcustomer.getTotalPrice(), 7000.00);

        Assert.assertEquals("05/04/2015", invoice.getDate());
        Assert.assertEquals("06/06/2015", newcustomer.getDate());

    }
}

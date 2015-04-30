package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.SalesInvoice;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class SalesInvoiceFactory {


    public static SalesInvoice createSalesInvoice(long salespersonID, long customerID,
                                                  long CarID, double totalPrice,
                                                  Map<String,String> values) {
        SalesInvoice invoice = new SalesInvoice
                .Builder(salespersonID)
                .customerID(customerID)
                .CarID(CarID)
                .totalPrice(totalPrice)
                .date(values.get("date"))
                .build();
        return invoice;
    }
}

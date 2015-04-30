package ExoticCarCustomz.services.impl;

import ExoticCarCustomz.domain.SalesInvoice;
import ExoticCarCustomz.repository.SalesInvoiceRepository;
import ExoticCarCustomz.services.SalesInvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/16.
 */
@Service
public class SalesInvoiceImpl implements SalesInvoiceServices {

    @Autowired
    SalesInvoiceRepository repository;
    public List<SalesInvoice> getSalesInvoice() {
        List<SalesInvoice> allsalesinvoice = new ArrayList<SalesInvoice>();

        Iterable<SalesInvoice> salesinvoice = repository.findAll();
        for (SalesInvoice invoice : salesinvoice) {
            allsalesinvoice.add(invoice);
        }
        return allsalesinvoice;
    }
}


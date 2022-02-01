package com.salildas.springbootassessmentwalton.service;

import com.salildas.springbootassessmentwalton.entity.SalesInvoice;
import com.salildas.springbootassessmentwalton.repository.SalesInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesInvoiceService {

    @Autowired
    private SalesInvoiceRepository repository;

    public SalesInvoice saveInvoice(SalesInvoice salesInvoice){return repository.save(salesInvoice);}

    public List<SalesInvoice> salesInvoices(List<SalesInvoice> salesInvoices) {return repository.saveAll(salesInvoices);}

    public List<SalesInvoice> getSalesInvoice() {
        return repository.findAll();
    }

    public SalesInvoice getSalesInvoiceById(int sid) { return repository.findById(sid).orElse(null);}

    public SalesInvoice getSalesInvoiceByName(String CustomerName) { return repository.findByCustomerName(CustomerName);}

    public String deleteSalesInvoice(int sid) {
        repository.deleteById(sid);
        return "Sales Invoice removed !! " + sid;
    }

    public SalesInvoice updateSalesInvoice(SalesInvoice salesInvoice) {
        SalesInvoice existingSalesInvoice = repository.findById(salesInvoice.getSid()).orElse(null);
        existingSalesInvoice.setInvoiceNumber(salesInvoice.getInvoiceNumber());
        existingSalesInvoice.setInvoiceDate(salesInvoice.getInvoiceDate());
        existingSalesInvoice.setCustomerName(salesInvoice.getCustomerName());
        existingSalesInvoice.setTotalAmount(salesInvoice.getTotalAmount());
        return repository.save(existingSalesInvoice);
    }


}

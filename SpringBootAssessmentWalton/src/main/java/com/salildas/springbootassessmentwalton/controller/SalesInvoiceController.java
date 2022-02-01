package com.salildas.springbootassessmentwalton.controller;

import com.salildas.springbootassessmentwalton.entity.SalesInvoice;
import com.salildas.springbootassessmentwalton.service.SalesInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesInvoiceController {

    @Autowired
    private SalesInvoiceService service;

    @PostMapping("/addSalesInvoice")
    public SalesInvoice addSalesInvoice(@RequestBody SalesInvoice salesInvoice) { return service.saveInvoice(salesInvoice);}

    @PostMapping("/addSalesInvoices")
    public List<SalesInvoice> addSalesInvoices(@RequestBody List<SalesInvoice> salesInvoices) {
        return service.salesInvoices(salesInvoices);
    }
    @GetMapping("/salesInvoices")
    public List<SalesInvoice> findAllSalesInvoices() {
        return service.getSalesInvoice();
    }

    @GetMapping("/salesInvoiceById/{sid}")
    public SalesInvoice findSalesInvoiceById(@PathVariable int sid) {
        return service.getSalesInvoiceById(sid);
    }

    @GetMapping("/salesInvoice/{customerName}")
    public SalesInvoice findSalesInvoiceByCustomerName(@PathVariable String customerName) {
        return service.getSalesInvoiceByName(customerName);
    }

    @PutMapping("/supdate")
    public SalesInvoice updateSalesInvoice(@RequestBody SalesInvoice salesInvoice) {
        return service.updateSalesInvoice(salesInvoice);
    }

    @DeleteMapping("/delete/{sid}")
    public String deleteSalesInvoice(@PathVariable int sid) {
        return service.deleteSalesInvoice(sid);
    }

}

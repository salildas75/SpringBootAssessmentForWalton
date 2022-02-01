package com.salildas.springbootassessmentwalton.repository;

import com.salildas.springbootassessmentwalton.entity.SalesInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesInvoiceRepository extends JpaRepository<SalesInvoice,Integer> {
    SalesInvoice findByCustomerName(String CustomerName);
}

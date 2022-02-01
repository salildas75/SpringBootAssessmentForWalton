package com.salildas.springbootassessmentwalton.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SALES_INVOICE_TBL")
public class SalesInvoice {

    @Id
    @GeneratedValue
    private int sid;
    private String invoiceNumber;
    private Date invoiceDate;
    private String customerName;
    private Double totalAmount;
}

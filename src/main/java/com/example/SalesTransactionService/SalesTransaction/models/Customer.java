package com.example.SalesTransactionService.SalesTransaction.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id", unique = true)
    private String customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "tin_no", nullable = false)
    private String tinNo;

    @Column(name = "vat_no" ,nullable = false)
    private String vatNo;

    @Column(name = "trade_name")
    private String tradeName;


    @Column(name = "trade_license_issued_date")
    private LocalDate tradeLicenseIssuedDate;

}

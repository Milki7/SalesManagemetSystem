package com.example.SalesTransactionService.SalesTransaction.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "proforma_invoices")
public class ProformaInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="proforma_id", unique = true)
    private String performaId;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @Column(name = "issued_date")
    private LocalDate issuedDate;

    @Column(name = "end_Date")
    private LocalDate endDate;

}

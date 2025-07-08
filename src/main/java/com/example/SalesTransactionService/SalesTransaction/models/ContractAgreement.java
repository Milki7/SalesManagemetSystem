package com.example.SalesTransactionService.SalesTransaction.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ContractAgreementRegistaration")
public class ContractAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




}

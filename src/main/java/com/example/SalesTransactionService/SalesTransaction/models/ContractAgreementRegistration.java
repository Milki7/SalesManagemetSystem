package com.example.SalesTransactionService.SalesTransaction.models;

import com.example.SalesTransactionService.SalesTransaction.enums.ContractAgreementStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "ContractAgreementRegistaration")
public class ContractAgreementRegistration{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "tenant_id", nullable = false)
    private UUID tenantId;

    @NotBlank
    @Column(name = "Agreement_Name")
    private String agreementName;

    @NotNull
    @Column(name = "agreement_date", nullable = false)
    private LocalDate agreementDate; // Mandatory

    @NotNull
    @Column(name = "from_date", nullable = false)
    private LocalDate fromDate; // Mandatory

    @NotNull
    @Column(name = "to_date", nullable = false)
    private LocalDate toDate; // Mandatory

    @Column(name = "agreement_doc_no")
    private String agreementDocNo;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name="status" , nullable = false)
    private ContractAgreementStatus status;


}

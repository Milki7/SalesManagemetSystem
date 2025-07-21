package com.example.SalesTransactionService.SalesTransaction.repositories;

import com.example.SalesTransactionService.SalesTransaction.models.AgreementRegistration.ContractAgreementRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractAgreementRepository extends JpaRepository<ContractAgreementRegistration, UUID> {
}

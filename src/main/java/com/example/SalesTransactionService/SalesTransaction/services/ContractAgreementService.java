package com.example.SalesTransactionService.SalesTransaction.services;

import com.example.SalesTransactionService.SalesTransaction.repositories.ContractAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractAgreementService {
    @Autowired
    private ContractAgreementRepository contractAgreementRepository;


}

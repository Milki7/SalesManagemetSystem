package com.example.SalesTransactionService.SalesTransaction.repositories;

import com.example.SalesTransactionService.SalesTransaction.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CutomerRepository extends JpaRepository<Customer, Long> {

}

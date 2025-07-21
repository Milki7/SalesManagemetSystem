package com.example.SalesTransactionService.SalesTransaction.repositories.Lookup;


import com.example.SalesTransactionService.SalesTransaction.models.Lookups.LookupType;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LookupTypeRepository extends JpaRepository<LookupType, String> {
    Optional<LookupType> findByTypeCode(String typeCode);
}
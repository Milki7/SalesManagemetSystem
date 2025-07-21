package com.example.SalesTransactionService.SalesTransaction.repositories.Lookup;


import com.example.SalesTransactionService.SalesTransaction.models.Lookups.LookupValue;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface LookupValueRepository extends JpaRepository<LookupValue, Long> {
    List<LookupValue> findByLookupType_TypeCodeAndIsActiveTrueOrderBySortOrderAsc(String typeCode);
    Optional<LookupValue> findByLookupType_TypeCodeAndValueCodeAndIsActiveTrue(String typeCode, String valueCode);
}
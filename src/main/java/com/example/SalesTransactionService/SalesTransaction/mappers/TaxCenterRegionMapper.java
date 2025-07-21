package com.example.SalesTransactionService.SalesTransaction.mappers;

import com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.LookupItemDto;
import com.example.SalesTransactionService.SalesTransaction.models.Lookups.TaxCenterLookup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TaxCenterRegionMapper {
    TaxCenterRegionMapper INSTANCE = Mappers.getMapper(TaxCenterRegionMapper.class);
    TaxCenterLookup toEntity(LookupItemDto dto); // If you allow creating new lookup items via API
    LookupItemDto toLookupItemDto(TaxCenterLookup entity);
}
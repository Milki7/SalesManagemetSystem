package com.example.SalesTransactionService.SalesTransaction.mappers;

import com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.LookupItemDto;
import com.example.SalesTransactionService.SalesTransaction.models.Lookups.ServiceCenterLookup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ServiceCenterMapper {
    ServiceCenterMapper INSTANCE = Mappers.getMapper(ServiceCenterMapper.class);
    ServiceCenterLookup toEntity(LookupItemDto dto); // If you allow creating new lookup items via API
    LookupItemDto toLookupItemDto(ServiceCenterLookup entity);
}
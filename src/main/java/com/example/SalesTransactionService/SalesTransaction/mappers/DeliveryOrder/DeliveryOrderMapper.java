package com.example.SalesTransactionService.SalesTransaction.mappers.DeliveryOrder;


import com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto.DeliveryOrder.DeliveryOrderRequestDto;
import com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.DeliveryOrder.DeliveryOrderResponseDto;
import com.example.SalesTransactionService.SalesTransaction.models.DeliveryOrder.DeliveryOrder;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.math.BigDecimal;

@Mapper(componentModel = "spring", uses = {DeliveryOrderLineItemMapper.class})
public interface DeliveryOrderMapper {

    // --- Request DTO to Entity Mapping ---
    @Mapping(target = "customerName", ignore = true) // Fetched from Proforma Invoice Service
    @Mapping(target = "grandTotal", ignore = true) // Calculated in service
    @Mapping(target = "totalAmountInWord", ignore = true) // Calculated in service
    @Mapping(target = "lineItems", source = "lineItems")
    DeliveryOrder toEntity(DeliveryOrderRequestDto request);

    // --- Entity to Response DTO Mapping ---
    // Calculated fields (grandTotal, totalAmountInWord) are passed as parameters
    @Mapping(target = "grandTotal", source = "grandTotal")
    @Mapping(target = "totalAmountInWord", source = "totalAmountInWord")
    @Mapping(target = "lineItems", source = "lineItems")
    DeliveryOrderResponseDto toResponseDto(
            DeliveryOrder entity,
            BigDecimal grandTotal,
            String totalAmountInWord
    );
}
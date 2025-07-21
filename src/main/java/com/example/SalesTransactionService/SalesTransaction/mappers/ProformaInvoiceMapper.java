package com.example.SalesTransactionService.SalesTransaction.mappers;

import com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto.ProformaInvoiceRequestDto;
import com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.ProformaInvoiceResponseDto;
import com.example.SalesTransactionService.SalesTransaction.models.Voucher.ProformaInvoice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.util.List;

@Mapper(componentModel = "spring", uses = {ItemPriceDetailMapper.class})
public interface ProformaInvoiceMapper {

    // --- Request DTO to Entity Mapping ---
    @Mapping(target = "customerName", ignore = true) // Fetched from Customer Service
    @Mapping(target = "customerTinNo", ignore = true) // Fetched from Customer Service
    @Mapping(target = "amountInWord", ignore = true) // Calculated in service
    @Mapping(target = "lineItems", source = "lineItems")
    ProformaInvoice toEntity(ProformaInvoiceRequestDto request);

    // --- Entity to Response DTO Mapping ---
    @Mapping(target = "subTotal", source = "subTotal") // Calculated in service
    @Mapping(target = "totalTax", source = "totalTax") // Calculated in service
    @Mapping(target = "grandTotal", source = "grandTotal") // Calculated in service
    @Mapping(target = "lineItems", source = "lineItems")
    ProformaInvoiceResponseDto toResponseDto(
            ProformaInvoice entity,
            BigDecimal subTotal,
            BigDecimal totalTax,
            BigDecimal grandTotal
    );
}
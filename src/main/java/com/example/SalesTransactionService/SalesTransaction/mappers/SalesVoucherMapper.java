package com.example.SalesTransactionService.SalesTransaction.mappers;


import com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto.SalesVoucherRequestDto;
import com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.SalesVoucherResponseDto;
import com.example.SalesTransactionService.SalesTransaction.models.SalesVoucher.SalesVoucher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named; // For custom mapping methods in the same mapper
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Mapper(componentModel = "spring", uses = {SalesVoucherItemMapper.class}) // 'spring' makes it a Spring bean. 'uses' tells it about nested mappers.
public interface SalesVoucherMapper {

    // Mapper instance (optional if using Spring, as you can @Autowired it)
    // SalesVoucherMapper INSTANCE = Mappers.getMapper(SalesVoucherMapper.class);

    // --- Request DTO to Entity Mapping ---
    // Note: Customer details, calculated totals are NOT mapped here as they come from service or calculation.
    // Line items will be mapped by SalesVoucherLineItemMapper
    @Mapping(target = "customerName", ignore = true) // Ignored as it comes from Customer Service
    @Mapping(target = "customerTinNo", ignore = true) // Ignored as it comes from Customer Service
    @Mapping(target = "amountInWord", ignore = true) // Ignored as it's calculated in service
    @Mapping(target = "lineItems", source = "lineItems") // Map collection of line item DTOs to entities
    SalesVoucher toEntity(SalesVoucherRequestDto request);

    // --- Entity to Response DTO Mapping ---
    // Calculated fields (subTotal, overallDiscount, vatAmount, withholdingAmount, grandTotal)
    // are not directly in the entity, so we'll add them as parameters to the mapping method.
    // Or, if they were stored in the entity (denormalized), they would be mapped directly.
    @Mapping(target = "subTotal", source = "subTotal")
    @Mapping(target = "overallDiscount", source = "overallDiscount")
    @Mapping(target = "vatAmount", source = "vatAmount")
    @Mapping(target = "withholdingAmount", source = "withholdingAmount")
    @Mapping(target = "grandTotal", source = "grandTotal")
    @Mapping(target = "lineItems", source = "lineItems") // Map collection of line item entities to DTOs
    SalesVoucherResponseDto toResponseDto(
            SalesVoucher entity,
            BigDecimal subTotal,
            BigDecimal overallDiscount,
            BigDecimal vatAmount,
            BigDecimal withholdingAmount,
            BigDecimal grandTotal
    );
}

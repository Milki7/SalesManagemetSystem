package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.Refund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public  class LineItemResponseDto {
    private UUID id; // Line item ID
    private Integer itemNo;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal discountRate;
    private BigDecimal itemDiscountAmount; // Calculated
    private BigDecimal taxRate;
    private BigDecimal itemTaxAmount; // Calculated
    private BigDecimal totalPrice; // Calculated
    private BigDecimal lineItemRefundAmount; // Calculated or user-specified
}
package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalesVoucherItemResponseDto {
    private Long id; // Line item ID
    private Integer itemNo;
    private String itemCode;
    private String itemName;
    private String uom;
    private String itemCategory;
    private Integer quantity;
    private BigDecimal unitPrice;
    private LocalDate expirationDate;
    private BigDecimal discountRate;
    private BigDecimal itemDiscountAmount; // Calculated
    private BigDecimal taxRate;
    private BigDecimal itemTaxAmount; // Calculated
    private BigDecimal totalPrice; // Calculated
}
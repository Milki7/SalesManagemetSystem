package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemPriceDetailResponseDto {
    private UUID id; // ID of the line item itself
    private Integer itemNo;
    private String itemCode;
    private String itemName;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal taxRate;
    private BigDecimal itemTaxAmount; // Calculated
    private BigDecimal totalPrice; // Calculated
}

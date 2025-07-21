package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.DeliveryOrder;

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
public class LineItemResponseDto {
    private UUID id; // Line item ID
    private Integer itemNo;
    private String itemName;
    private String itemCode;
    private String uom;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice; // Calculated
}
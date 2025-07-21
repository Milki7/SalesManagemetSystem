package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProformaInvoiceResponseDto {
    private String proformaNo;
    private UUID customerId;
    private String customerName; // Included in response after fetching from customer service
    private String customerTinNo; // Included in response after fetching from customer service
    private LocalDate issuedDate;
    private LocalDate endDate;
    private String amountInWord;
    private String termsAndCondition;
    private String preparedBy;

    // Calculated totals, derived from line items
    private BigDecimal subTotal;
    private BigDecimal totalTax;
    private BigDecimal grandTotal;
    private List<ItemPriceDetailResponseDto> lineItems;
}
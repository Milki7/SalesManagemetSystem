package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalesVoucherResponseDto {
    private String invoiceNo;
    private LocalDate salesDate;
    private Long customerId;
    private String customerName; // Included in response after fetching
    private String customerTinNo; // Included in response after fetching
    private String paymentType;
    private String paymentReference;
    private BigDecimal overallWithholdingRate;
    private String amountInWord; // Calculated
    private String memoNote;
    private String preparedBy;

    // Calculated totals for the entire voucher
    private BigDecimal subTotal;
    private BigDecimal overallDiscount; // Sum of all line item discounts
    private BigDecimal vatAmount; // Sum of all line item taxes
    private BigDecimal withholdingAmount; // Calculated based on overall withholding rate
    private BigDecimal grandTotal;

    private List<SalesVoucherItemResponseDto> lineItems;


}
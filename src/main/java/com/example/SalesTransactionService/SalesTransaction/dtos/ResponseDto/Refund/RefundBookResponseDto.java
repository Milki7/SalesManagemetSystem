package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.Refund;



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
public class RefundBookResponseDto {
    private UUID id;
    private String refNo;
    private LocalDate refundDate;
    private String refundReason;
    private String invoiceNo;
    private String customerName; // Populated from Sales Voucher
    private String customerTinNo; // Populated from Sales Voucher
    private String preparedBy;

    // Calculated totals for the entire refund
    private BigDecimal subTotal;
    private BigDecimal overallWithholdingAmount;
    private BigDecimal vatAmount;
    private BigDecimal overallDiscountAmount;
    private BigDecimal grandTotal;
    private BigDecimal finalRefundAmount; // The overall refund amount

    private List<LineItemResponseDto> lineItems;


}
package com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto.Refund;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundBookRequestDto {
    private UUID id;
    private String refNo;
    private LocalDate refundDate;
    private String refundReason;
    private String invoiceNo; // The Invoice No. from the Sales Voucher
    private String preparedBy;

    private List<LineItemRequestDto> lineItems;


}
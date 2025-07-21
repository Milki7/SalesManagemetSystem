package com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto.DeliveryOrder;


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
public class DeliveryOrderRequestDto {
    private String deliveryNo;
    private LocalDate deliveryDate;
    private String invoiceNo; // The Invoice No. from the Proforma Invoice
    private String storeLocation;
    private String memoNote;
    private String preparedBy;

    private List<LineItemRequestDto> lineItems;
}

package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto.DeliveryOrder;



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
public class DeliveryOrderResponseDto {
    private UUID id;
    private String deliveryNo;
    private LocalDate deliveryDate;
    private String invoiceNo;
    private String customerName; // Populated from Proforma Invoice
    private String storeLocation;
    private BigDecimal grandTotal; // Calculated
    private String totalAmountInWord; // Calculated
    private String memoNote;
    private String preparedBy;

    private List<LineItemResponseDto> lineItems;


}
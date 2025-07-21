package com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProformaInvoiceRequestDto {
    private String proformaNo;
    private Long customerId; // This is the ID passed from the client
    private LocalDate issuedDate;
    private LocalDate endDate;
    private String amountInWord;
    private String termsAndCondition;
    private String preparedBy;

    private List<ItemPriceDetailRequestDto> lineItems;

}

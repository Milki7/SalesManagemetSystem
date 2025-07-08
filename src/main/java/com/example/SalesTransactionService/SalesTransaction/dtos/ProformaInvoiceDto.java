package com.example.SalesTransactionService.SalesTransaction.dtos;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class ProformaInvoiceDto {
    @NotBlank
    private String customerId;

    @NotNull
    private LocalDate issuedDate;

    private String preparedBy;
    private String termsAndConditions;
    private String deliveryAddress;
    private BigDecimal taxAmount;
    private BigDecimal discountAmount;

    @NotEmpty
    private List<InvoiceItemDTO> items;

}

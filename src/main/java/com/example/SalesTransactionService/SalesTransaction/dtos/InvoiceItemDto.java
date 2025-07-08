package com.example.SalesTransactionService.SalesTransaction.dtos;

import lombok.Data;

@Data
public class InvoiceItemDto {

        @NotBlank
        private String itemCode;

        @NotBlank
        private String itemName;

        private String description;

        @NotNull
        @Min(1)
        private Integer quantity;

        @NotNull
        @DecimalMin("0.01")
        private BigDecimal unitPrice;

        @DecimalMin("0.00")
        @DecimalMax("1.00")
        private BigDecimal taxRate;

        @DecimalMin("0.00")
        @DecimalMax("1.00")
        private BigDecimal discountRate;

       
}

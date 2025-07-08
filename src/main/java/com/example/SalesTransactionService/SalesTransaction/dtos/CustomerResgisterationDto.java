package com.example.SalesTransactionService.SalesTransaction.dtos;

import lombok.Data;

@Data
public class CustomerResgisterationDto {
        @NotBlank
        private String customerName;

        @NotBlank
        private String tinNo;

        private String vatNo;

        @NotBlank
        private String customerType;

        private String tradeName;

        private String businessType;

        private LocalDate tradeLicenseIssuedDate;

        private String salesZone;

        private String contactPerson;

        @NotNull
        private LocalDate registrationDate;

        private AddressDTO customerAddress;
        private AddressDTO tradeLicenseAddress;
        private AddressDTO businessAddress;
        private List<CustomerAdditionalInfoDTO> additionalInfo;

        // Getters and setters
    }






    public class InvoiceItemDTO {
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

        // Getters and setters
    }
}

package com.example.SalesTransactionService.SalesTransaction.dtos.RequestDto;

import com.example.SalesTransactionService.SalesTransaction.enums.ContractAgreementStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ContractAgreementRequestDto {
    @NotNull(message = "Agreement Name is mandatory")
    private String agreementName;

    @NotNull(message = "Agreement Date is mandatory")
    @PastOrPresent(message = "Agreement Date cannot be in the future")
    private LocalDate agreementDate;

    @NotNull(message = "From Date is mandatory")
    private LocalDate fromDate;

    @NotNull(message = "To Date is mandatory")
    private LocalDate toDate;

    private String agreementDocNo;
    private String description;
    private String documentPath; // This would typically be a file upload, so the path is set after upload

    @NotNull(message = "Status is mandatory")
    private ContractAgreementStatus status;

    @NotNull(message = "Customer Name is mandatory")
    private String customerName;
}

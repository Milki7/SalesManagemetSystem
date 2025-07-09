package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;


import com.example.SalesTransactionService.SalesTransaction.enums.ContractAgreementStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractResponseDto {
    private Long id;
    private String agreementName;
    private LocalDate agreementDate;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String agreementDocNo;
    private String description;
    private String documentPath;
    private ContractAgreementStatus status;

}

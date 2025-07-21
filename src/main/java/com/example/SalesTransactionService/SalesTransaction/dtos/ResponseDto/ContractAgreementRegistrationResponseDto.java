package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;


import com.example.SalesTransactionService.SalesTransaction.enums.ContractAgreementStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContractAgreementRegistrationResponseDto {
    private Long id;
    private String agreementName;
    private LocalDate agreementDate;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String agreementDocNo;
    private String description;
    private ContractAgreementStatus status;

    byte[] documentContent;


     private Long customerId;
     private String customerFullName;

    private List<ItemDetailResponseDto> itemServiceDetails;
    private List<WitnessInformationResponseDto> witnessInformation;
}

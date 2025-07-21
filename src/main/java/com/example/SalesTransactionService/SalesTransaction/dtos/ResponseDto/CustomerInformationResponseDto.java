package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInformationResponseDto {

    private Long id; // Always include ID for response

    private String fullName;
    private String houseNo;
    private String address;
    private String email;
    private String telephone;


    // Nesting related collections for a full view
    private List<ContractAgreementRegistrationResponseDto> contracts;
}
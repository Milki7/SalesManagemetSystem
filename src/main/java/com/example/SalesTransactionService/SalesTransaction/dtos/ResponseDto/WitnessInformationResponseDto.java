package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WitnessInformationResponseDto {

    private Long id;

    private String fullName;
    private String address;
    private String houseNo;
    private String telephone;
    private String email;
}
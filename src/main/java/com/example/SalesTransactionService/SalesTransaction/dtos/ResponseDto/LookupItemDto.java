package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LookupItemDto {
    private Long id;
    private String name;
}
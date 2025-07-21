package com.example.SalesTransactionService.SalesTransaction.dtos.ResponseDto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDetailResponseDto{

    private Long id;

    private String itemName;
    private String uom;
    private Integer quantity;
    private LocalDate expirationDate;

    // Flattened lookup information for display
    private Long serviceCenterId;
    private String serviceCenterName;

    private Long taxCenterRegionId;
    private String taxCenterRegionName;

    private String itemCategory;
    private String itemCode;
    private Double unitPrice;
    private String brandModel;

}
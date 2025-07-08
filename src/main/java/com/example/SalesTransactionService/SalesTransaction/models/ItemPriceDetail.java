package com.example.SalesTransactionService.SalesTransaction.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemPriceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "Quantity")
    private Integer quantity;

}

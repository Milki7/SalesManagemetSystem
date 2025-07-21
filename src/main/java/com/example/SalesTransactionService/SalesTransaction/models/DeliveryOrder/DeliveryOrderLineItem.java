package com.example.SalesTransactionService.SalesTransaction.models.DeliveryOrder;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "delivery_order_line_items")
public class DeliveryOrderLineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id; // Primary key for the line item itself

    @Column(name = "item_no", nullable = false)
    private Integer itemNo; // "No." column from the screenshot

    @Column(name = "item_name", length = 255, nullable = false)
    private String itemName;

    @Column(name = "item_code", length = 50, nullable = false)
    private String itemCode;

    @Column(name = "uom", length = 20) // Unit of Measure
    private String uom;

    @Column(name = "quantity", nullable = false)
    private Integer quantity; // Or BigDecimal if fractional quantities

    @Column(name = "unit_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "total_price", precision = 10, scale = 2)
    private BigDecimal totalPrice; // Calculated: quantity * unitPrice

    // --- Relationship with DeliveryOrder ---
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_no", referencedColumnName = "delivery_no", nullable = false)
    private DeliveryOrder deliveryOrder;

    // Helper method for calculation
    public void calculateTotals() {
        if (quantity != null && unitPrice != null) {
            this.totalPrice = unitPrice.multiply(new BigDecimal(quantity));
        } else {
            this.totalPrice = BigDecimal.ZERO;
        }
    }
}
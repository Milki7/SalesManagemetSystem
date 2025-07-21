package com.example.SalesTransactionService.SalesTransaction.models.DeliveryOrder;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "delivery_orders")
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id ;

    private UUID tenantId;


    // "Delivery No." seems to be the unique identifier
    @Column(name = "delivery_no", unique = true, nullable = false, length = 50)
    private String deliveryNo;

    @Column(name = "delivery_date", nullable = false)
    private LocalDate deliveryDate;

    // Reference to Proforma Invoice
    @Column(name = "invoice_no", nullable = false, length = 50)
    private String invoiceNo; // This refers to the Proforma Invoice's primary key

    // Customer Name is typically pulled from the linked Invoice or Customer Service
    // We'll store it here for denormalization/convenience for display
    @Column(name = "customer_name", length = 255)
    private String customerName;

    @Column(name = "store_location", length = 255)
    private String storeLocation;

    @Column(name = "grand_total", precision = 10, scale = 2)
    private BigDecimal grandTotal; // This will be calculated from line items

    @Column(name = "total_amount_in_word", length = 500)
    private String totalAmountInWord; // Calculated based on Grand Total

    @Column(name = "memo_note", columnDefinition = "TEXT")
    private String memoNote;

    @Column(name = "prepared_by", length = 100)
    private String preparedBy;

    // --- Relationship with DeliveryOrderLineItem ---
    @OneToMany(mappedBy = "deliveryOrder", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    private List<DeliveryOrderLineItem> lineItems = new ArrayList<>();

    // Helper methods for bidirectional relationship
    public void addLineItem(DeliveryOrderLineItem lineItem) {
        lineItems.add(lineItem);
        lineItem.setDeliveryOrder(this);
    }

    public void removeLineItem(DeliveryOrderLineItem lineItem) {
        lineItems.remove(lineItem);
        lineItem.setDeliveryOrder(null);
    }
}
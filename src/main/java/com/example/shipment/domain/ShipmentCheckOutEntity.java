package com.example.shipment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "SHIPMENT_CHECKOUT_TABLE")
public class ShipmentCheckOutEntity {
    @Id @GeneratedValue
    private Long shipmentId;
    private Long checkOutId;
    private Long memberId;
    private Long productId;
    private long amount;
    private String shippingAddress;
    @CreationTimestamp
    private LocalDateTime createdAt;
}

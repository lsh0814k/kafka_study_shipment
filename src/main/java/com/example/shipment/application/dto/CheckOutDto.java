package com.example.shipment.application.dto;

import lombok.*;

import java.time.LocalDateTime;

import static lombok.AccessLevel.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class CheckOutDto {
    private Long checkOutId;
    private Long memberId;
    private Long productId;
    private long amount;
    private String shippingAddress;
    private LocalDateTime createdAt;
}

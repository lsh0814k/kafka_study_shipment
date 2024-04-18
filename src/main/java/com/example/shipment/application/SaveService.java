package com.example.shipment.application;

import com.example.shipment.application.dto.CheckOutDto;
import com.example.shipment.application.outputport.ShipmentCheckOutRepository;
import com.example.shipment.domain.ShipmentCheckOutEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveService {
    private final ShipmentCheckOutRepository repository;
    public Long saveCheckOutData(CheckOutDto checkOutDto) {
        ShipmentCheckOutEntity shipmentCheckOutEntity = saveShipCheckOutEntity(checkOutDto);

        return shipmentCheckOutEntity.getShipmentId();
    }

    private ShipmentCheckOutEntity saveShipCheckOutEntity(CheckOutDto checkOutDto) {
        ShipmentCheckOutEntity shipmentCheckOutEntity = ShipmentCheckOutEntity.builder()
                .checkOutId(checkOutDto.getCheckOutId())
                .memberId(checkOutDto.getMemberId())
                .productId(checkOutDto.getProductId())
                .amount(checkOutDto.getAmount())
                .shippingAddress(checkOutDto.getShippingAddress())
                .build();
        return repository.save(shipmentCheckOutEntity);
    }
}

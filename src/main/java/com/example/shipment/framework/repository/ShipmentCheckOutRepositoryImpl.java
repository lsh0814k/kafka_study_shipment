package com.example.shipment.framework.repository;

import com.example.shipment.application.outputport.ShipmentCheckOutRepository;
import com.example.shipment.domain.ShipmentCheckOutEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ShipmentCheckOutRepositoryImpl implements ShipmentCheckOutRepository {
    private final ShipmentCheckOutJpaRepository shipmentCheckOutJpaRepository;
    @Override
    public ShipmentCheckOutEntity save(ShipmentCheckOutEntity shipmentCheckOutEntity) {
        return shipmentCheckOutJpaRepository.save(shipmentCheckOutEntity);
    }
}

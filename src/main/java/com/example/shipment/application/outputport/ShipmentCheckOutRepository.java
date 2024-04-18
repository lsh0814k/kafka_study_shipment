package com.example.shipment.application.outputport;

import com.example.shipment.domain.ShipmentCheckOutEntity;

public interface ShipmentCheckOutRepository {
    ShipmentCheckOutEntity save(ShipmentCheckOutEntity shipmentCheckOutEntity);
}

package com.example.shipment.framework.repository;

import com.example.shipment.domain.ShipmentCheckOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentCheckOutJpaRepository extends JpaRepository<ShipmentCheckOutEntity, Long> {
}

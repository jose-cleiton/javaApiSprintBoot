package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import com.api.parkingcontrol.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
  
  
  boolean existsByLicensePlatCar(String licensePlateCar);

  boolean existsByParkingSpotNumber(String parkingSpotNumber);
  
  boolean existsByApartmentAndBlock(String apartment, String block);
}

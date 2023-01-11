package com.api.parkingcontrol.service;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {


  final ParkingSpotRepository parkingSpotRepository;

    ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
@Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
      return parkingSpotRepository.save(parkingSpotModel);
    }

    
  
}

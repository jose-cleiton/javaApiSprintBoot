package com.api.parkingcontrol.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  @Column(nullable = false, unique = true, length = 10)
  private String parkingSpotNumber;
  @Column(nullable = false, length = 7)
  private String license_plat_car;
  @Column(nullable = false, length = 70)
  private String brandCar;
  @Column(nullable = false, length = 70)
  private String modelCar;
  @Column(nullable = false, length = 70)
  private String colorCar;
  @Column(nullable = false)
  private LocalDateTime registrationData;
  @Column(nullable = false, length = 130)
  private String responsibleName;
  @Column(nullable = true, length = 30)
  private String apartament;
  @Column(nullable = false, length = 30)
  private String block;



  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getParkingSpotNumber() {
    return this.parkingSpotNumber;
  }

  public void setParkingSpotNumber(String parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public String getLicensePlatCar() {
    return this.license_plat_car;
  }

  public void setLicensePlatCar(String licensePlatCar) {
    this.license_plat_car = licensePlatCar;
  }

  public String getBrandCar() {
    return this.brandCar;
  }

  public void setBrandCar(String brandCar) {
    this.brandCar = brandCar;
  }

  public String getModelCar() {
    return this.modelCar;
  }

  public void setModelCar(String modelCar) {
    this.modelCar = modelCar;
  }

  public String getColorCar() {
    return this.colorCar;
  }

  public void setColorCar(String colorCar) {
    this.colorCar = colorCar;
  }

  public LocalDateTime getRegistrationData() {
    return this.registrationData;
  }

  public void setRegistrationData(LocalDateTime registrationData) {
    this.registrationData = registrationData;
  }

  public String getResponsibleName() {
    return this.responsibleName;
  }

  public void setResponsibleName(String responsableName) {
    this.responsibleName = responsableName;
  }

  public String getApartament() {
    return this.apartament;
  }

  public void setApartament(String apartament) {
    this.apartament = apartament;
  }

  public String getBlock() {
    return this.block;
  }

  public void setBlock(String block) {
    this.block = block;
  }











  

  
}

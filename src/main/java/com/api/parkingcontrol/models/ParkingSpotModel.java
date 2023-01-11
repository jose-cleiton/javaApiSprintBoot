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
  @Column(name = "\"parkingSpotNumber\"", nullable = false, unique = true, length = 10)
  private String parkingSpotNumber;
  @Column(name = "\"licensePlatCar\"", nullable = false, length = 7)
  private String licensePlatCar;
  @Column(name = "\"brandCar\"", nullable = false, length = 70)
  private String brandCar;
  @Column(name = "\"modelCar\"", nullable = false, length = 70)
  private String modelCar;
  @Column(name = "\"colorCar\"", nullable = false, length = 70)
  private String colorCar;
  @Column(name = "\"registrationData\"", nullable = false)
  private LocalDateTime registrationData;
  @Column(name = "\"responsibleName\"", nullable = false, length = 130)
  private String responsibleName;
  @Column(name = "\"apartment\"", nullable = true, length = 30)
  private String apartment;
  @Column(name = "\"block\"", nullable = false, length = 30)
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
    return this.licensePlatCar;
  }

  public void setLicensePlatCar(String licensePlatCar) {
    this.licensePlatCar = licensePlatCar;
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

  public String getApartment() {
    return this.apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public String getBlock() {
    return this.block;
  }

  public void setBlock(String block) {
    this.block = block;
  }











  

  
}

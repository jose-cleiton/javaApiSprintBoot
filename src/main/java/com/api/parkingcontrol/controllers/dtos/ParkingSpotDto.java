package com.api.parkingcontrol.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {

  @NotBlank
  private String parkingSpotNumber;

  @NotBlank
  @Size(max = 7)  
  private String license_plat_car;
  @NotBlank
  private String brandCar;
  @NotBlank
  private String modelCar;

  @NotBlank
  private String colorCar;
  @NotBlank
  private String responsibleName;
  @NotBlank
  private String apartament;

  @NotBlank
  private String block;


  public String getParkingSpotNumber() {
    return this.parkingSpotNumber;
  }

  public void setParkingSpotNumber(String parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public String getLicensePlateCar() {
    return this.license_plat_car;
  }

  public void setLicensePlateCar(String licensePlateCar) {
    this.license_plat_car = licensePlateCar;
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

  public String getResponsibleName() {
    return this.responsibleName;
  }

  public void setResponsibleName(String responsibleName) {
    this.responsibleName = responsibleName;
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

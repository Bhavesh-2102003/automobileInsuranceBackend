package com.hexaware.automobileInsurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class ClaimSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String claimType;

    @Column(nullable = false)
    private String incidentDate;

    @Column(nullable = false)
    private String incidentTime;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String pinCode;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String policeFIR;

    private String firNumber;

    @Column(nullable = false)
    private String anotherVehicle;

    private String thirdPartyReg;
    private String thirdPartyOwner;

    @Column(nullable = false)
    private String injuriesReported;

    @Column(nullable = false)
    private String vehicleDrivable;

    @Column(nullable = false)
    private String vehicleTowed;

    private String garageName;
    private String garageAddress;

    @Column(nullable = false)
    private String repairType;

    private String garage;
    private Double repairCost;
    private String repairEstimate;

    private String accountHolder;
    private String bankName;
    private String accountNumber;
    private String ifscCode;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getIncidentTime() {
        return incidentTime;
    }

    public void setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoliceFIR() {
        return policeFIR;
    }

    public void setPoliceFIR(String policeFIR) {
        this.policeFIR = policeFIR;
    }

    public String getFirNumber() {
        return firNumber;
    }

    public void setFirNumber(String firNumber) {
        this.firNumber = firNumber;
    }

    public String getAnotherVehicle() {
        return anotherVehicle;
    }

    public void setAnotherVehicle(String anotherVehicle) {
        this.anotherVehicle = anotherVehicle;
    }

    public String getThirdPartyReg() {
        return thirdPartyReg;
    }

    public void setThirdPartyReg(String thirdPartyReg) {
        this.thirdPartyReg = thirdPartyReg;
    }

    public String getThirdPartyOwner() {
        return thirdPartyOwner;
    }

    public void setThirdPartyOwner(String thirdPartyOwner) {
        this.thirdPartyOwner = thirdPartyOwner;
    }

    public String getInjuriesReported() {
        return injuriesReported;
    }

    public void setInjuriesReported(String injuriesReported) {
        this.injuriesReported = injuriesReported;
    }

    public String getVehicleDrivable() {
        return vehicleDrivable;
    }

    public void setVehicleDrivable(String vehicleDrivable) {
        this.vehicleDrivable = vehicleDrivable;
    }

    public String getVehicleTowed() {
        return vehicleTowed;
    }

    public void setVehicleTowed(String vehicleTowed) {
        this.vehicleTowed = vehicleTowed;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public String getGarageAddress() {
        return garageAddress;
    }

    public void setGarageAddress(String garageAddress) {
        this.garageAddress = garageAddress;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public Double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(Double repairCost) {
        this.repairCost = repairCost;
    }

    public String getRepairEstimate() {
        return repairEstimate;
    }

    public void setRepairEstimate(String repairEstimate) {
        this.repairEstimate = repairEstimate;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}
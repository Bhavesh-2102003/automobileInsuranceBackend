package com.hexaware.automobileInsurance.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BikeInsurance {

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBikeMakeModel() {
		return bikeMakeModel;
	}

	public void setBikeMakeModel(String bikeMakeModel) {
		this.bikeMakeModel = bikeMakeModel;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public LocalDateTime getPolicyExpiryDate() {
		return policyExpiryDate;
	}

	public void setPolicyExpiryDate(LocalDateTime policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}

	public String getMadeClaim() {
		return madeClaim;
	}

	public void setMadeClaim(String madeClaim) {
		this.madeClaim = madeClaim;
	}

	public String getPreviousPolicyImg() {
		return previousPolicyImg;
	}

	public void setPreviousPolicyImg(String previousPolicyImg) {
		this.previousPolicyImg = previousPolicyImg;
	}

	public String getCommercialBike() {
		return commercialBike;
	}

	public void setCommercialBike(String commercialBike) {
		this.commercialBike = commercialBike;
	}

	public int getKilometersDriven() {
		return kilometersDriven;
	}

	public void setKilometersDriven(int kilometersDriven) {
		this.kilometersDriven = kilometersDriven;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getPreviousInsuranceProvider() {
		return previousInsuranceProvider;
	}

	public void setPreviousInsuranceProvider(String previousInsuranceProvider) {
		this.previousInsuranceProvider = previousInsuranceProvider;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getRegistrationCertificateURL() {
		return registrationCertificateURL;
	}

	public void setRegistrationCertificateURL(String registrationCertificateURL) {
		this.registrationCertificateURL = registrationCertificateURL;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BikeMakeModel", length = 255)
    private String bikeMakeModel;

    @Column(name = "Variant", length = 45)
    private String variant;

    @Column(name = "RegistrationYear", length = 45)
    private String registrationYear;

    @Column(name = "FuelType", length = 45)
    private String fuelType;

    @Column(name = "PolicyExpiryDate")
    private LocalDateTime policyExpiryDate;

    @Column(name = "MadeClaim", length = 45)
    private String madeClaim;

    @Column(name = "PreviousPolicyImg", length = 45)
    private String previousPolicyImg;

    @Column(name = "CommercialBike", length = 45)
    private String commercialBike;

    @Column(name = "KilometersDriven")
    private int kilometersDriven;

    @Column(name = "OwnerType", length = 45)
    private String ownerType;

    @Column(name = "PreviousInsuranceProvider", length = 45)
    private String previousInsuranceProvider;

    @Column(name = "UserName", length = 45)
    private String userName;

    @Column(name = "Pincode", length = 45)
    private String pincode;

    @Column(name = "Contact", length = 45)
    private String contact;

    @Column(name = "Mail", columnDefinition = "TEXT")
    private String mail;

    @Column(name = "GSTNumber", length = 45)
    private String gstNumber;

    @Column(name = "RegistrationCertificateURL", length = 45)
    private String registrationCertificateURL;

    @Column(name = "DrivingLicense", length = 45)
    private String drivingLicense;
}

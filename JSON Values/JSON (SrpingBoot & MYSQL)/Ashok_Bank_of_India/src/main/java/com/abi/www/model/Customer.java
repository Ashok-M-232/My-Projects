package com.abi.www.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Account_number;
	
	@Column
	private String FirstName;
	
	@Column
	private String LastName;
	
	@Column (length = 10)
	private long MoblieNumber;
	
	@Column (length=4)
	private int password;
	@Column
	private String FatherFullName;
	
	@Column (length=12)
	private long AdharCard;
	
	@Column
	private String Married_or_single;
	
	@Column
	private String Country;
	
	@Column
	private String State;
	
	@Column
	private String District;
	
	@Column
	private String City;
	
	@Column
	private String Village;
	
	@Column
	private String HouseAddress;
	
	@Column (length=6)
	private int Pincode;
	
	@Column
	private String AccountType;
	
	@Column
	private String PanNumber;
	
	@Column
	private String Email; 
	
	@Column
	private long CurrentBalance;

	public int getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(int account_number) {
		Account_number = account_number;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public long getMoblieNumber() {
		return MoblieNumber;
	}

	public void setMoblieNumber(long moblieNumber) {
		MoblieNumber = moblieNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getFatherFullName() {
		return FatherFullName;
	}

	public void setFatherFullName(String fatherFullName) {
		FatherFullName = fatherFullName;
	}

	public long getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(long adharCard) {
		AdharCard = adharCard;
	}

	public String getMarried_or_single() {
		return Married_or_single;
	}

	public void setMarried_or_single(String married_or_single) {
		Married_or_single = married_or_single;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getVillage() {
		return Village;
	}

	public void setVillage(String village) {
		Village = village;
	}

	public String getHouseAddress() {
		return HouseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		HouseAddress = houseAddress;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getPanNumber() {
		return PanNumber;
	}

	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getCurrentBalance() {
		return CurrentBalance;
	}

	public void setCurrentBalance(long currentBalance) {
		CurrentBalance = currentBalance;
	}
}

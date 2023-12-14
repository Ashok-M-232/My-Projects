package com.bankDetails.www.model;

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
	private String FullName;
	
	@Column
	private int password;
	
	@Column (length = 10)
	private long MoblieNumber;
	
	@Column
	private int CurrentBalance;

	public int getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(int account_number) {
		Account_number = account_number;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getMoblieNumber() {
		return MoblieNumber;
	}

	public void setMoblieNumber(long moblieNumber) {
		MoblieNumber = moblieNumber;
	}

	public int getCurrentBalance() {
		return CurrentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		CurrentBalance = currentBalance;
	}
	

}

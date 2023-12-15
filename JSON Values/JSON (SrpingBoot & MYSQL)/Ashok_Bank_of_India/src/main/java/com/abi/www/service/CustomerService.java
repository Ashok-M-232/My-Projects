package com.abi.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.www.model.Customer;
import com.abi.www.repo.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired 
	CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	public List<Customer> getAllCustomer()
	{
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(int Account_number)
	{
		return customerRepository.findById(Account_number).get();
	}
	
	public String updateCustomer(Customer customer)
	{
	Customer cust=customerRepository.findById(customer.getAccount_number()).get();
			
	cust.setLastName(customer.getLastName());
	
	cust.setLastName(customer.getLastName());
	
	cust.setFatherFullName(customer.getFatherFullName());
	
	cust.setMoblieNumber(customer.getMoblieNumber());
	
	cust.setEmail(customer.getEmail());
	
	cust.setAdharCard(customer.getAdharCard());
	
	cust.setPanNumber(customer.getPanNumber());
	
	cust.setMarried_or_single(customer.getMarried_or_single());
	
	cust.setAccountType(customer.getAccountType());
	
	cust.setCountry(customer.getCountry());
	
	cust.setState(customer.getState());
	
	cust.setDistrict(customer.getDistrict());
	
	cust.setCity(customer.getCity());
	
	cust.setVillage(customer.getVillage());
	
	cust.setHouseAddress(customer.getHouseAddress());
	
	cust.setPincode(customer.getPincode());
	
	cust.setPassword(customer.getPassword());
	
	cust.setCurrentBalance(customer.getCurrentBalance());
		
			
	customerRepository.save(cust);
			
	return "Record is updated";
	}
	
	public String deleteCustomer(int Account_number)
	{
		customerRepository.deleteById(Account_number);
		return "Record is deleted";
	}
}
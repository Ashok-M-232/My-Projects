package com.bankDetails.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankDetails.www.model.Customer;
import com.bankDetails.www.repo.CustomerRepository;

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
	
	public Customer getCustomer(int Account_number)
	{
		return customerRepository.findById(Account_number).get();
	}
	
	public String updateCustomer(Customer customer)
	{
	Customer cust=customerRepository.findById(customer.getAccount_number()).get();
			
	cust.setFullName(customer.getFullName());
			
	cust.setPassword(customer.getPassword());
	
	cust.setMoblieNumber(customer.getMoblieNumber());
	
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
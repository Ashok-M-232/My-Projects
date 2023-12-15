package com.abi.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abi.www.model.Customer;
import com.abi.www.service.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/customer")
public class CustomerController 
{

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/fetch")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/fetch/{Account_number}")
	public Customer getCustomerById(@PathVariable int Account_number)
	{
		return customerService.getCustomerById(Account_number);
	}
	
	
	@PutMapping("/fetch/{Account_number}")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/delete/{Account_number}")
	public String deleteCustomerById(@PathVariable int Account_number)
	{
		return customerService.deleteCustomer(Account_number);
	}
}
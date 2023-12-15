package com.abi.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abi.www.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer>{

}

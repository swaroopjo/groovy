package com.lio.groovy.dao;

import java.util.List;

import com.lio.groovy.beans.Customer;

public interface CustomerDAO {

	public Customer findCustomerByID(int id);
	public List<Customer> findAllCustomers();
	public void insertCustomer(Customer customer);
	public void deleteCustomer(int id);
}

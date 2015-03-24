package com.lio.groovy.dao;

import groovy.sql.Sql
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement
import java.util.List;
import com.lio.groovy.beans.Customer;
import com.lio.groovy.test.DerbyDataLoader

public class CustomerDAOImpl extends AbstractDAO implements CustomerDAO{
	
	{
		if(!checkIfDBExists("Customers")){
			new DerbyDataLoader().loadDataFromFile(CustomerDAOImpl.class.getResource("/com/lio/data/Customers.txt").getFile())
		}
	}
	
	@Override
	public Customer findCustomerByID(int id) {
		Sql sql = getConnection();
		def row = sql.firstRow('select * from Customers where customerID=?',id);
		Customer customer = new Customer(row.collectEntries{k,v -> [k.toLowerCase(),v]})
		return customer;
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}
	static void main(def args){
		Customer customer = new CustomerDAOImpl().findCustomerByID(1);
		System.out.println(customer.toString())
	}

}

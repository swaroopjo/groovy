package com.lio.groovy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.lio.groovy.beans.Customer
import groovy.sql.Sql;
public abstract class AbstractDAO {
	
	String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	String dbName = "groovyDerbyDemoDB";
	String connectionURL = "jdbc:derby:" + dbName + ";create=true";

	public Sql getConnection(){
		
		Sql sql = Sql.newInstance(url:'jdbc:derby:SHOPPING_CART;create=true',
									driver:'org.apache.derby.jdbc.EmbeddedDriver');
		return sql
	}
	
	public boolean checkIfDBExists(String tableName){
		Sql sql = getConnection();
		List<Customer> list = sql.rows('select * from '+tableName).collect{row -> new Customer(row.collectEntries{k,v ->[k.toLowerCase(),v]})};
		if(list.size() > 0){
			
			return true;
		}
		
		return false;
	}
	
}

package com.lio.groovy.beans;


public class Customer {

	String customerid;
	String customername;
	String contactname;
	String address;
	String city;
	String postalcode;
	String country;
	
	public String toString(){
		return "$customerid"+"$customername"+"$country";
	}
}

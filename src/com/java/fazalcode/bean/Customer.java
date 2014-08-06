/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
package com.java.fazalcode.bean;

/**
 * @author Tatarao voleti
 * @date   14-Apr-2014
 *
 */
public class Customer {
	
	String customerid;
	String customername;
	String email;
	String phone;
	String city;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername="
				+ customername + ", email=" + email + ", phone=" + phone
				+ ", city=" + city + "]";
	}
	
}

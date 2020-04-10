package com.client.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Merchants")
public class Merchants {
	
	@Id
	   @Column(name="merchantsId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
      int merchantsId;
	
	@Column(name="name")
		String name;
		
	@Column(name="email")
		String email;
	
	@Column(name="password")
		String password;
	
	@Column(name="address")
		String address;
	
	@Column(name="phoneNumber")
		int phoneNumber;
	
	@Column(name="role")
	String role;
	
	@Column(name="paymentId")
	int paymentId;
		
public int getMerchantsId() {
	return merchantsId;
}
public void setMerchantsId(int merchantsId) {
	this.merchantsId = merchantsId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

}

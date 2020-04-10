package com.client.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
		int userId;
	
	@Column(name="paymentId")
	int paymentId;
	
	@Column(name="userName")
		String userName;
	
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
	
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
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

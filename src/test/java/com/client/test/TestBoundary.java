package com.client.test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;


import com.client.models.Merchants;
import com.client.models.User;



public class TestBoundary {
	@Test
	 public void validUserName()
	 {
		 User user=new User();
	     user.setAddress("manglore");
	     user.setEmail("example@gmail.com");
	     user.setPassword("hello1234");
	     user.setPhoneNumber(1234567890);
	     user.setRole("buyer");
	     user.setUserId(123);
	     user.setUserName("james");
	     String userNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(userNameRegex,user.getUserName());
	     assertEquals(true,check);
	 }
	@Test
	 public void validUserNameLength()
	 {
		 User user=new User();
	     user.setAddress("manglore");
	     user.setEmail("example@gmail.com");
	     user.setPassword("hello1234");
	     user.setPhoneNumber(1234567890);
	     user.setRole("buyer");
	     user.setUserId(123);
	     user.setUserName("james");
	     int min=2;
	      boolean namelengthfromdb=user.getUserName().length()>min;
	     assertEquals(true,namelengthfromdb);
	 }
	public void validMerchantName()
	 {
		 Merchants merchants=new Merchants();
		 merchants.setAddress("banglore");
		 merchants.setEmail("james@gmail.com");
		 merchants.setMerchantsId(1234);
		 merchants.setName("james");
		 merchants.setPassword("hello1234");
		 merchants.setPhoneNumber(1234567890);
		 merchants.setRole("seller");
	     String userNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(userNameRegex,merchants.getName());
	     assertEquals(true,check);
	 }
	public void validPasswordLength()
	 {
		User user=new User();
	     user.setAddress("manglore");
	     user.setEmail("example@gmail.com");
	     user.setPassword("hello1234");
	     user.setPhoneNumber(1234567890);
	     user.setRole("buyer");
	     user.setUserId(123);
	     user.setUserName("james");
	     int passwordLength=10;
	    boolean Length=user.getPassword().length()>passwordLength;
	     assertEquals(true,Length);
	 }
	
	 @Test
	 public void validUserEmail()
	 {
		 User user=new User();
	     user.setAddress("manglore");
	     user.setEmail("example@gmail.com");
	     user.setPassword("hello1234");
	     user.setPhoneNumber(1234567890);
	     user.setRole("buyer");
	     user.setUserId(123);
	     user.setUserName("james");
	     String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	     boolean check=Pattern.matches(emailRegex,user.getEmail());
	     assertEquals(true,check);
	 }
	 @Test
	 public void validMerchantEmail()
	 {
		 Merchants merchants=new Merchants();
		 merchants.setAddress("banglore");
		 merchants.setEmail("james@gmail.com");
		 merchants.setMerchantsId(1234);
		 merchants.setName("james");
		 merchants.setPassword("hello1234");
		 merchants.setPhoneNumber(1234567890);
		 merchants.setRole("seller");
	     String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	     boolean check=Pattern.matches(emailRegex,merchants.getEmail());
	     assertEquals(true,check);
	 }
	 @Test
	    public void validPhoneNumber()
	    {
		 Merchants merchants=new Merchants();
				 merchants.setName("james");
		 merchants.setPassword("hello1234");
		 merchants.setPhoneNumber(1234567890);
		 
		 User user=new User();
	    
	     user.setPhoneNumber(1234567890);
	     user.setRole("buyer");
	     user.setUserId(123);
	     user.setUserName("james");

	        int phoneNumberLength=10;
	        
	        int getLengthOfNumber=(Integer.toString(merchants.getPhoneNumber()).length());
	        int getNumber=(Integer.toString(user.getPhoneNumber()).length());
	        
	assertEquals( phoneNumberLength, getLengthOfNumber);
	assertEquals(phoneNumberLength,getNumber);
	    }
}

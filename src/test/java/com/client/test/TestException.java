package com.client.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.client.common.InvalidCredentials;
import com.client.common.UserAlreadyExistException;
import com.client.common.UserDoesNotExistException;
import com.client.models.Merchants;
import com.client.models.User;
import com.client.services.MerchantService;
import com.client.services.UserService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Client.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
        
     
     Merchants merchants=new Merchants();
	 merchants.setAddress("banglore");
	 merchants.setEmail("james@gmail.com");
	 merchants.setMerchantsId(1234);
	 merchants.setName("james");
	 merchants.setPassword("hello1234");
	 merchants.setPhoneNumber(1234567890);
	 merchants.setRole("seller");
	 
	 UserService userservice = (UserService) context.getBean("UserService");
	 userservice.signUp(user);
	 
	 MerchantService merchantservice = (MerchantService) context.getBean("MerchantService");
	 userservice.signUp(user);
	 
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Client.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
     
     Merchants merchants=new Merchants();
	 merchants.setAddress("banglore");
	 merchants.setEmail("james@gmail.com");
	 merchants.setMerchantsId(1234);
	 merchants.setName("james");
	 merchants.setPassword("hello1234");
	 merchants.setPhoneNumber(1234567890);
	 merchants.setRole("seller");
        
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.signIn(user.getUserName(),user.getPassword());
     
     MerchantService merchantservice = (MerchantService) context.getBean("MerchantService");
     merchantservice.signIn(merchants.getName(),merchants.getPassword()); 
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Client.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.signIn(user.getUserName(),user.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Client.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.signIn(user.getUserName(),user.getPassword());
    
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	
}





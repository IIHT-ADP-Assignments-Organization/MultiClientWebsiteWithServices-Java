package com.client.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.client.models.Goods;
import com.client.models.Merchants;
import com.client.models.Services;
import com.client.models.User;
import com.client.services.MerchantService;
import com.client.services.UserService;



public class TestFunctional {
	@Test
	public void testvalidUserRegistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	 User user=new User();
     user.setAddress("manglore");
     user.setEmail("example@gmail.com");
     user.setPassword("hello1234");
     user.setPhoneNumber(1234567890);
     user.setRole("buyer");
     user.setUserId(123);
     user.setUserName("james");
String isRegistered=(user.getUserName());
	

	UserService userservice=(UserService) context.getBean("UserService");
	User registration =userservice.signUp(user);
	assertEquals(isRegistered,registration);
}
	@Test
	public void tesForValidUserLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	User user=new User();
    user.setAddress("manglore");
    user.setEmail("example@gmail.com");
    user.setPassword("hello1234");
    user.setPhoneNumber(1234567890);
    user.setRole("buyer");
    user.setUserId(123);
    user.setUserName("james");
	    UserService userservice=(UserService) context.getBean("UserService");
	User userdetailsfromdb=userservice.signIn(user.getUserName(),user.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void testvalidMerchantRegistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	 User user=new User();
     user.setAddress("manglore");
     user.setEmail("example@gmail.com");
     user.setPassword("hello1234");
     user.setPhoneNumber(1234567890);
     user.setRole("buyer");
     user.setUserId(123);
     user.setUserName("james");
String isRegistered=(user.getUserName());
	

	UserService userservice=(UserService) context.getBean("UserService");
	User registration =userservice.signUp(user);
	assertEquals(isRegistered,registration);
}
	
	@Test
	public void tesForValidMerchantLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	 Merchants merchants=new Merchants();
	 merchants.setAddress("banglore");
	 merchants.setEmail("james@gmail.com");
	 merchants.setMerchantsId(1234);
	 merchants.setName("james");
	 merchants.setPassword("hello1234");
	 merchants.setPhoneNumber(1234567890);
	 merchants.setRole("seller");
	    MerchantService merchantservice=(MerchantService) context.getBean("MerchantService");
	Merchants userdetailsfromdb=merchantservice.signIn(merchants.getName(),merchants.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void tesForValidGoods() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	User user=new User();
    user.setAddress("manglore");
    user.setEmail("example@gmail.com");
    user.setPassword("hello1234");
    user.setPhoneNumber(1234567890);
    user.setRole("buyer");
    user.setUserId(123);
    user.setUserName("james");
    
    Goods goods=new Goods();
    goods.setGoodsId(12);
    
    UserService userservice=(UserService) context.getBean("UserService");
	Goods userdetailsfromdb=userservice.purchaseGoods(goods.getGoodsId());
	assertNotNull(userdetailsfromdb);
}
	@Test
	public void tesForValidServices() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	User user=new User();
    user.setAddress("manglore");
    user.setEmail("example@gmail.com");
    user.setPassword("hello1234");
    user.setPhoneNumber(1234567890);
    user.setRole("buyer");
    user.setUserId(123);
    user.setUserName("james");
    
    Services services=new Services();
    services.setServiceId(123);
    
    UserService userservice=(UserService) context.getBean("UserService");
	Services userdetailsfromdb=userservice.claimServices(services.getServiceId());
	assertNotNull(userdetailsfromdb);
}
	@Test
	public void tesForValidSearchGoods() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	Goods goods =new Goods();
	goods.setGoodsId(1234);
	goods.setGoodsName("electric pen");
    
    
    UserService userservice=(UserService) context.getBean("UserService");
	List<Goods> userdetailsfromdb=userservice.searchGoods(goods.getGoodsName());
	assertNotNull(userdetailsfromdb);
}
	
	@Test
	public void tesForValidSearchServices() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	Services services=new Services();
	services.setServiceName("electric service");
    
    
    UserService userservice=(UserService) context.getBean("UserService");
	List<Services> userdetailsfromdb=userservice.searchServices(services.getServiceName());
	assertNotNull(userdetailsfromdb);
}
	
	@Test
	public void tesForValidCancelledServices() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	Services services=new Services();
	services.setServiceName("electric service");
    
    
    UserService userservice=(UserService) context.getBean("UserService");
	Services userdetailsfromdb=userservice.cancelServices(services.getServiceName());
	assertNotNull(userdetailsfromdb);
}
	@Test
	public void tesForValidCancelGoods() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	Goods goods =new Goods();
	goods.setGoodsId(1234);
	goods.setGoodsName("electric pen");
    
    
    UserService userservice=(UserService) context.getBean("UserService");
	Goods userdetailsfromdb=userservice.cancelGoodsOrder(goods.getGoodsName());
	assertNotNull(userdetailsfromdb);
}
	
	@Test
	public void tesForValidAddGoods() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	
	Goods goods =new Goods();
	goods.setGoodsId(1234);
	goods.setGoodsName("electric pen");
goods.setGoodsBrand("India");
goods.setGoodsPrice(50.00);
goods.setQuantity(12);
goods.setMerchantId(123);
    
MerchantService merchantservice=(MerchantService) context.getBean("MerchantService");
	Goods detailsfromdb=merchantservice.addGoods(goods);
	assertNotNull(detailsfromdb);
	}
	
	@Test
	public void tesForValidAddServices() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	
	Services services=new Services();
	services.setServiceId(123);
	services.setServiceName("electric");
	services.setServicePrice(420);
	services.setServiceType("eletric service");
    
MerchantService merchantservice=(MerchantService) context.getBean("MerchantService");
	Services detailsfromdb=merchantservice.addServices(services);
	assertNotNull(detailsfromdb);
	}
	
	@Test
	public void tesForValidServicesDisplay() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	
	 Merchants merchants=new Merchants();
	 merchants.setAddress("banglore");
	 merchants.setEmail("james@gmail.com");
	 merchants.setMerchantsId(1234);
    
MerchantService merchantservice=(MerchantService) context.getBean("MerchantService");
	List<Services> detailsfromdb=merchantservice.displayServices(merchants.getMerchantsId());
	assertNotNull(detailsfromdb);
	}
	@Test
	public void tesForValidGoodsDisplay() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
	
	 Merchants merchants=new Merchants();
	 merchants.setAddress("banglore");
	 merchants.setEmail("james@gmail.com");
	 merchants.setMerchantsId(1234);
    
MerchantService merchantservice=(MerchantService) context.getBean("MerchantService");
	List<Goods> detailsfromdb=merchantservice.displayAllGoods(merchants.getMerchantsId());
	assertNotNull(detailsfromdb);
	}
	
	
	
}

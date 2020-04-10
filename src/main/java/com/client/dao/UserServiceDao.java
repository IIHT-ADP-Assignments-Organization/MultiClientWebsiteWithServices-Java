package com.client.dao;

import java.util.List;

import com.client.models.Goods;
import com.client.models.Merchants;
import com.client.models.Payment;
import com.client.models.Services;
import com.client.models.User;

public interface UserServiceDao {
	User signUp(User user);
	User signIn(String userName,String password);
	Goods purchaseGoods(int goodsId);
	Services claimServices(int serviceId);
	boolean makePayment(Merchants merchant,Payment payment);
	List<Goods> searchGoods(String goodsName);
	List<Services> searchServices(String serviceName);
	Services cancelServices(String serviceName);
	Goods cancelGoodsOrder(String goodsName);
	Goods getGoodsById(int goodsId);
	User getUsersById(int userId);
	Services getServicesById(int serviceId);
	
}

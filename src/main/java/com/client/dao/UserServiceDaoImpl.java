package com.client.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.client.models.Goods;
import com.client.models.Merchants;
import com.client.models.Payment;
import com.client.models.Services;
import com.client.models.User;
@Component
public class UserServiceDaoImpl implements UserServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public User signUp(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods purchaseGoods(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services claimServices(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean makePayment(Merchants merchant, Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Goods> searchGoods(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Services> searchServices(String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services cancelServices(String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods cancelGoodsOrder(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods getGoodsById(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUsersById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services getServicesById(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

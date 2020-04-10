package com.client.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.client.models.Goods;
import com.client.models.Merchants;
import com.client.models.Services;
@Component
public class MerchantserviceDaoImpl implements MerchantServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public Merchants signUp(Merchants merchant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merchants signIn(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createPage(Merchants merchant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goods addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services addServices(Services services) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Services> displayServices(int merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> displayAllGoods(int merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods getGoodsById(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merchants getMerchantsById(int merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services getServicesById(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

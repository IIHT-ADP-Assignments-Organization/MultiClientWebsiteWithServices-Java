package com.client.services;

import java.util.List;

import com.client.models.Goods;
import com.client.models.Merchants;
import com.client.models.Services;

public interface MerchantService {

	Merchants signUp(Merchants merchant);
	Merchants signIn(String name,String password);
	boolean createPage(Merchants merchant);
	Goods addGoods(Goods goods);
	Services addServices(Services services);
	List<Services> displayServices(int merchantId);
	List<Goods> displayAllGoods(int merchantId);
	Goods getGoodsById(int goodsId);
	Merchants getMerchantsById(int merchantId);
	Services getServicesById(int serviceId);
	
}

package com.mp.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.dao.TeacherDAO;
import com.mp.dao.impl.TeacherDAOImpl;
import com.mp.entity.Basket;
import com.mp.entity.Brand;
import com.mp.entity.Color;
import com.mp.entity.MemberInfo;
import com.mp.entity.Product;
import com.mp.entity.Teacher;
import com.mp.service.ShopService;
import com.mp.service.TeacherService;

@Service("shopService")
public class ShopServiceImpl implements ShopService{

	@Autowired
	private Product procudt;

	@Autowired
	private Color color;
	
	@Autowired
	private Brand brand;
	
	@Autowired
	private Basket basket;
}

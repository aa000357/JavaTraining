package com.mp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.dao.MemberInfoDAO;
import com.mp.entity.MemberInfo;
import com.mp.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Autowired
	private MemberInfoDAO memberInfoDAO;
	
	@Override
	public String show(Object obj) {
		System.out.println("Show : " + obj);
		MemberInfo info = new MemberInfo();
		info.setMemberNo("123");
		info.setAccount("xxx");
		info.setPassword("xxx");
		memberInfoDAO.save(info);
		
		return String.valueOf(obj);
	}

}

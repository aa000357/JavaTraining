package com.mp.dao;

import com.mp.entity.MemberInfo;



public interface MemberInfoDAO extends BaseDAO<MemberInfo>{
	
	public MemberInfo findByNo(String memberNo);
	
	public MemberInfo findByAcc(String account);

}

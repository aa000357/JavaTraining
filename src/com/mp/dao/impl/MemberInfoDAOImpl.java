package com.mp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mp.dao.MemberInfoDAO;
import com.mp.entity.MemberInfo;



@Repository("memberInfoDAO")
public class MemberInfoDAOImpl extends BaseDAOImpl<MemberInfo> implements MemberInfoDAO {

	@Override
	public MemberInfo findByNo(String memberNo) {
		StringBuffer hql = new StringBuffer("");
		// Hibernate sql = hql. from [table] where [column] = '?' 
		hql.append(" from MemberInfo where memberNo = :memberNo ");
		Query query = getQuery(hql.toString());
		
		query.setParameter("memberNo", memberNo);
		
		List<MemberInfo> list = query.list();
		if(list != null && list.size() > 0)
			return list.get(0);
		else 
			return null;
	}

	@Override
	public MemberInfo findByAcc(String account) {
		StringBuffer hql = new StringBuffer("");
		hql.append(" from MemberInfo where account = :account ");
		Query query = getQuery(hql.toString());
		
		query.setParameter("account", account);
		
		List<MemberInfo> list = query.list();
		if(list != null && list.size() > 0)
			return list.get(0);
		else 
			return null;
	}

	

}

package com.mp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mp.dao.TeacherDAO;
import com.mp.entity.MemberInfo;
import com.mp.entity.Teacher;



@Repository("teacherDAO")
public class TeacherDAOImpl extends BaseDAOImpl<Teacher> implements TeacherDAO {

	@Override
	public List getList() {
		StringBuffer hql = new StringBuffer("");//StringBuffer組字串
		// Hibernate sql = hql. from [table] where [column] = '?' 
		hql.append(" from Teacher ");
		Query query = getQuery(hql.toString());//取資料庫的資料，並轉成字串
		
		
		List<Teacher> list = query.list(); //<Teacher>是參考com.mp.entity.Teacher的資料型態
		return list;//回傳list
	}
	




}

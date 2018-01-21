package com.mp.dao;

import java.util.List;

import com.mp.entity.Teacher;



public interface TeacherDAO extends BaseDAO<Teacher>{

	public List getList();
	
}

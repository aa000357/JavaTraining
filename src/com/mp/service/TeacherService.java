package com.mp.service;

import java.util.List;

import com.mp.entity.Teacher;

public interface TeacherService {

	public List getList();

	public void saveList();
	
	public void deleteList(int id);

	public Teacher findByOne(int id);
	
	public void update(int id, String name, String gender);
	
}

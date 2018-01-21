package com.mp.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.dao.TeacherDAO;
import com.mp.dao.impl.TeacherDAOImpl;
import com.mp.entity.MemberInfo;
import com.mp.entity.Teacher;
import com.mp.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDAO teacherDAO;

	
	@Override
	public List getList() {
		List<Teacher> list = teacherDAO.getList() ;
		return list;
	}

	public void saveList() {
//		System.out.println("Show : " + obj);
		Teacher teacher = new Teacher();
		teacher.setTeacherGender("M");
		teacher.setTeacherName("GG");
		teacherDAO.save(teacher);
	}
	
	//到下一頁，更新表單資料
	public Teacher findByOne(int id) {
		List<Teacher> list = teacherDAO.getList() ;//從資料庫把資料抓出來
		Teacher teacher = null;
		
		for(int i=0;i<list.size();i++)//找索引
		{
			if(list.get(i).getTeacherId()==id)
			{
				teacher = list.get(i);
				return teacher;
			}
				
		}
		return teacher;

	}
	
	//刪除選取表單
	public void deleteList(int id) {
		List<Teacher> list = teacherDAO.getList() ;//從資料庫把資料抓出來
		Teacher teacher;
		
		for(int i=0;i<list.size();i++)//找索引
		{
			if(list.get(i).getTeacherId()==id)
				teacherDAO.delete(list.get(i));
		}
		
		
//		teacherDAO.delete();

	}
	
	//到下一頁，更新表單資料
		public void update(int id, String name, String gender) {
			List<Teacher> list = teacherDAO.getList() ;//從資料庫把資料抓出來
			Teacher teacher = null;
			
			
			for(int i=0;i<list.size();i++)//找索引
			{
				if(list.get(i).getTeacherId()==id)
				{
					teacher = list.get(i);
					teacher.setTeacherName(name);
					teacher.setTeacherGender(gender);
					teacherDAO.update(teacher);
				}
					
			}

		}


}

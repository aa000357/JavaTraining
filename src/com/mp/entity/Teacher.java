package com.mp.entity;
// Generated 2017/10/8 �U�� 10:36:56 by Hibernate Tools 5.2.5.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemberInfo generated by hbm2java
 */
@Entity
@Table(name = "teacher", catalog = "wendy")
public class Teacher extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  
	private Integer teacherId;
	private String teacherName;
	private String teacherGender;

	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherGender() {
		return teacherGender;
	}
	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}
	
	

	


}

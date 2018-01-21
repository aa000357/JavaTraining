package com.mp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mp.dao.TeacherDAO;
import com.mp.entity.Teacher;
import com.mp.service.TeacherService;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	
	@RequestMapping(value="/read")
	public ModelAndView read(HttpServletRequest req, Model model) {
		List<Teacher> list = teacherService.getList();
		model.addAttribute("readList", list);
		return new ModelAndView("/teacher", model.asMap());
	}
	
	@RequestMapping(value="/saveList")
	public ModelAndView saveList(HttpServletRequest req, Model model) {
		teacherService.saveList();
		List<Teacher> list = teacherService.getList();
		model.addAttribute("readList", list);
		return new ModelAndView("/teacher", model.asMap());
	}
	
	@RequestMapping(value="/modify")
	public ModelAndView modify(HttpServletRequest req, Model model) {
		String id = null;
		if(req.getParameter("update") != null) {//從前端取得參數=update
			Teacher teacher = null;
			id = req.getParameter("update");
			teacher = teacherService.findByOne(Integer.parseInt(id));//用teacher接updateList
			
			//將畫面帶到下一個畫面(teachetUpdate);String modelName(下一頁jsp的名稱);Object modelObject(object的名稱)
			return new ModelAndView("/teacherUpdate", "updateList" ,teacher);

		} 
		if(req.getParameter("delete") != null) {
			id = req.getParameter("delete");
			teacherService.deleteList(Integer.parseInt(id));
		}
		
		List<Teacher> list = teacherService.getList();
		model.addAttribute("readList", list);
		return new ModelAndView("/teacher", model.asMap());
	}
	
	//進入修改畫面的動作
	@RequestMapping(value="/update")
	public ModelAndView update(HttpServletRequest req, Model model) {
		String id = null;
		String name = null;
		String gender = null;
		
		
		//取一筆資料到下一頁修改
		if(req.getParameter("enter") != null) {//從前端取得參數=enter,
			Teacher teacher = null;
			id = req.getParameter("enter");
			name = req.getParameter("teacherName");
			gender = req.getParameter("teacherGender");
			
			teacherService.update(Integer.parseInt(id), name, gender);
		}
		
		List<Teacher> list = teacherService.getList();
		model.addAttribute("readList", list);
		return new ModelAndView("/teacher", model.asMap());
	}
	
}

package com.mp.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mp.service.TestService;


@Controller
@RequestMapping("/test")
public class TestAction {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/delete")
	public ModelAndView test() {
//		testService.show("HELLO");
		return new ModelAndView("/test");
	}
	
	@RequestMapping(value="/test5")
	public @ResponseBody String test5() {
		return "Hello, I'm Jimmy!!";
	}
	
	@RequestMapping(value="/update")
	public ModelAndView test(HttpServletRequest req) {
		String param = req.getParameter("ABC");
		System.out.println("param = " + param);
		
		String bcdPar = req.getParameter("boy");
		System.out.println("bcd = " + bcdPar);
		
		return new ModelAndView("/test");
	}
	
}

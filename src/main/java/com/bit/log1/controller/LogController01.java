package com.bit.log1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController01 {
	//Logger 생성 (Console)
//	private static final Log LOG
//		= LogFactory.getLog(LogController01.class);
	
	@RequestMapping("/login")
	public String login() {
		
		System.out.println("UserController login() Method Called...");
		System.out.println("---------------------------------------------------------------------------------------------");
		return "/WEB-INF/views/loginSuccess.jsp";
	}
}

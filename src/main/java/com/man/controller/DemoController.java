package com.man.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.man.bean.DemoBean;
import com.man.mapping.Test;
import com.man.service.TestService;

@RestController()
public class DemoController {

	@Autowired
	private TestService testService; 
	
	@RequestMapping(value = "/rest/test1")
	public DemoBean test1(){
		DemoBean demoBean = new DemoBean("Mayank", "Gupta");
		return demoBean;
	}
	
	@RequestMapping(value = "/rest/test1/*")
	public Test test1(HttpServletRequest httpServletRequest){
		String url = httpServletRequest.getRequestURI();
		String[] splitter = url.split("/");
		String acessId = splitter[splitter.length - 1];
		Test test = testService.getTestBean(Integer.parseInt(acessId));
		//DemoBean demoBean = new DemoBean("Mayank", "Gupta");
		return test;
	}
}

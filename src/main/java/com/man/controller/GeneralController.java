package com.man.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {
	
	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "index";
    }
	
	@RequestMapping(value = "/a")
	public String a(){
		return "index";
	}

	@RequestMapping(value = "/b")
	public String b(){
		return "index";
	}

	@RequestMapping(value = "/c")
	public String c(){
		return "index";
	}

	@RequestMapping(value = "/d")
	public String d(){
		return "index";
	}

	@RequestMapping(value = "/e")
	public String e(){
		return "index";
	}

	@RequestMapping(value = "/f")
	public String f(){
		return "index";
	}

	@RequestMapping(value = "/g")
	public String g(){
		return "index";
	}

	@RequestMapping(value = "/h")
	public String h(){
		return "index";
	}
	
}

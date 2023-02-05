package com.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

@RequestMapping("/test")	
@ResponseBody
	public String test() {
		int a=34,b=45;
		return "sum of a+b number is"+(a+b);
		
	}
}

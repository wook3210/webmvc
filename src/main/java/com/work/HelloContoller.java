package com.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContoller {

	@Autowired
	HelloService helloService;

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "MyContoller" + " " + helloService.getName();

	}

	@GetMapping("/store")
	public String sample() {
		return "/WEB-INF/sample.jsp";
	}

}

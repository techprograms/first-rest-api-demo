package com.srdt.springboot.firstrestapi.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldResource {

	@RequestMapping("/hello-world")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
	//create second resource
	//add
}

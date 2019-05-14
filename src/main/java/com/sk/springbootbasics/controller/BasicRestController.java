package com.sk.springbootbasics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BasicRestController {

	
	
	@RequestMapping(name="/test" ,method=RequestMethod.GET)
	public @ResponseBody String getEchoTest(){
		
		return "Application Started and working properly";
	}
	
	
}

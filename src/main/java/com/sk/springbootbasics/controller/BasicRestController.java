package com.sk.springbootbasics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BasicRestController {

	
	
	@RequestMapping(name="/getRequest" ,method=RequestMethod.GET)
	public @ResponseBody String getRequest(){
		
		return "Hi.. This is Get Request Response";
	}
	
	
	@RequestMapping(name="/postRequest" ,method=RequestMethod.POST)
	public @ResponseBody String PostRequest(){
		
		return "Hi.. This is Post Request Response";
	}
	
	
	@RequestMapping(name="/putRequest" ,method=RequestMethod.PUT)
	public @ResponseBody String putRequest(){
		
		return "Hi.. This is Put Request Response";
	}
	
	
	@RequestMapping(name="/deleteRequest" ,method=RequestMethod.DELETE)
	public @ResponseBody String deleteRequest(){
		
		return "Hi.. This is Delete Request Response";
	}
	
	
	
}

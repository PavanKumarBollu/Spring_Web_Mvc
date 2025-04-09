package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	@GetMapping
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping(value="report")
	public String showReport(Map<String, Object>)
	{
		return "display";
	}
	
	
	
}

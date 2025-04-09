package com.pavan.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping
	public String showHome()
	{
		return "home";
	}
	
	
	public String showReport(Map<String, Object> model)
	{
		return "report";
	}

}

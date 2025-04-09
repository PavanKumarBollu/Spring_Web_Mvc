package com.pavan.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping(value="/")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping(value="report")
	public String showReport(Map<String, Object> model)
	{
		model.put("name", "Pavan");
		model.put("age", 25);
		model.put("addr", "HYD");
		return "report";
	}

}

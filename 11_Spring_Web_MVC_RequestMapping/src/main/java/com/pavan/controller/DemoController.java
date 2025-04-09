package com.pavan.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

	
	@GetMapping
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping(value="report")
	public String showReport(Map<String, Object> model)
	{
		model.put("msg", "GetMapping of the report");
		return "display";
	}
	
	
	@PostMapping(value="report")
	public String showReport1(Map<String, Object> model)
	{
		model.put("msg", "PostMapping of the report");
		return "display1";
	}
	
	
	
}

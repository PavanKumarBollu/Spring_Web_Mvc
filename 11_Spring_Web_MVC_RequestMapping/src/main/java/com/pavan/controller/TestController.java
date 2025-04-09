package com.pavan.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@GetMapping
	public String showHome(Map<String, Object> model)
	{
		model.put("msg", "TestController Home Methods");
		return "display";
	}
	
	@GetMapping(value="/report")
	public String showReport(Map<String, Object> model)
	{
		model.put("msg", "GetMapping of the report");
		return "display";
	}
}

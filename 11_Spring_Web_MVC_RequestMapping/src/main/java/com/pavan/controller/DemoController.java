package com.pavan.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/demo")
public class DemoController {

	
	@GetMapping
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping(value="/report")
	public String showReport(Map<String, Object> model)
	{
		model.put("msg", "GetMapping of the report");
		return "display";
	}
	
	
	@PostMapping(value="/report")
	public String showReport1(Map<String, Object> model)
	{
		model.put("msg", "PostMapping of the report");
		return "display1";
	}
	
	@GetMapping(value= {"/report1","/allreport","/reports",})
	public String showReportsGeneral(Map<String, Object> model)
	{
		model.put("msg", "Genaral Handler of report for all the other request URI's");
		return "display";
	}
	
	
	
}

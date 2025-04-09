package com.pavan.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		String[] names = new String[]{"Pavan","Ravi","Kumar"};
		
		model.put("names", names);
		
		List<String> subjects = List.of("java","jee","spring", "springboot");
		model.put("subjects", subjects);
		
		Set<Long> mobileNo = Set.of(1234l, 2345l,3456l);
		model.put("mobileNo", mobileNo);
		
		Map<String, Number> ids = Map.of("aadhar", 123454321, "pan", 9879879l , "passport", 56789l);
		model.put("ids", ids);
		
		
		
		return "report";
	}

}

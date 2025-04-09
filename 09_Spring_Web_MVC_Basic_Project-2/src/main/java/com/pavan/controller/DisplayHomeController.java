package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayHomeController {

	@GetMapping(value = "/")
	public String showHomePage()
	{
		return "home";
	}
	
}

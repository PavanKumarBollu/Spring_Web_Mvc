package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowhomeController {

	@RequestMapping(value="/welcome",  method=RequestMethod.GET)
	public String showHome()
	{
		return "home";
	}
}

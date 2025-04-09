package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pavan.service.IWishMessageService;

@Controller
public class WishController {

	@Autowired
	private IWishMessageService service;
	
	
	@RequestMapping(value="/")
	public String showHome()
	{
		return "home";
	}
	
	
}

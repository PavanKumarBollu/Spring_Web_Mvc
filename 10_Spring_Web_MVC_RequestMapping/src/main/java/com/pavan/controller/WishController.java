package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	/*
	 * @RequestMapping(value="/wish") public ModelAndView generateMsg() {
	 * ModelAndView model = new ModelAndView(); String wishMsg =
	 * service.generateWishMsg(); model.addObject("msg", wishMsg);
	 * model.setViewName("display");
	 * 
	 * return model; }
	 */
	
}

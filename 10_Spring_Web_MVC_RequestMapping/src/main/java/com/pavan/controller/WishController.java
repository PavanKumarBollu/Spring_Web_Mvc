package com.pavan.controller;

import java.util.Map;

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
	
	/*
	 * @RequestMapping(value="/wish") public ModelAndView generateMsg() {
	 * ModelAndView model = new ModelAndView(); String wishMsg =
	 * service.generateWishMsg(); model.addObject("msg", wishMsg);
	 * model.setViewName("display");
	 * 
	 * return model; }
	 */
	

	
	/*
	 * @RequestMapping(value="/wish") public String generateMsg(Model model) {
	 * String wishMsg = service.generateWishMsg(); model.addAttribute("msg",
	 * wishMsg); return "display"; }
	 */
	
	
	public String generateMsg(Map<String, Object> model)
	{
		return "display";
	}
	
	
	
}

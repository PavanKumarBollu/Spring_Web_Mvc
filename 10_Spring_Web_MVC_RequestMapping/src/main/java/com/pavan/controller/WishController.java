package com.pavan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pavan.service.IWishMessageService;

import jakarta.servlet.http.HttpServletResponse;

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
	/*
	 * @RequestMapping(value="/wish") public String generateMsg(Map<String, Object>
	 * model) { model.put("msg", service.generateWishMsg()); return "display"; }
	 */
	
	/*
	 * @RequestMapping(value="/display") public void generateMsg1(Map<String,Object>
	 * model) { model.put("msg", service.generateWishMsg());
	 * 
	 * }
	 */
	
	
	/*
	 * @RequestMapping(value="/wish") public void generateMsg(HttpServletResponse
	 * response) throws IOException { response.setContentType("text/html");
	 * PrintWriter writer = response.getWriter();
	 * 
	 * writer.println("<b> Wish Message : " + service.generateWishMsg() +"</b> " );
	 * }
	 */
	
	
}

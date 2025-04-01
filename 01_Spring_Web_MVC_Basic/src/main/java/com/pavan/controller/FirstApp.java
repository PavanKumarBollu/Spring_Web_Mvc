package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstApp {

	@RequestMapping(value = "/welcome")
	public ModelAndView displayMassage()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Welcome to Spring Web MVC Model");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}

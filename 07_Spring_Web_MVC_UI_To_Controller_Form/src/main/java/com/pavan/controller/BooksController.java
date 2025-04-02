package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {
	@GetMapping("/register")
	public String bookRegistration(Model model)
	{
		
		return "index";
	}
}

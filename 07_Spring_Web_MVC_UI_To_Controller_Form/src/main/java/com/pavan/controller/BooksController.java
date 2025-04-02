package com.pavan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pavan.binding.Books;

@Controller
public class BooksController {
	@GetMapping("/register")
	public String bookRegistration(Model model) {

		return "index";
	}
	
	@GetMapping("/books")
	public String getBooks(Books book,Model model)
	{
		return "books";
	}
}

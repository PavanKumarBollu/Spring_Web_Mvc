package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParams {
	
	@GetMapping("/book/{bName}/{bAuthor}")
	public String getBookDetails(@PathVariable("bName")String bName, @PathVariable("bAuthor") String bAuthor, Model model)
	{
		
		model.addAttribute("query" , bName+" Book Was Designed By " + bAuthor + " To Make Learning Java Easy ");
		return "index";
	}
}

package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PathParams {
	
	public String getBookDetails(Model model)
	{
		return "index";
	}
}

package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	
	
	public String getData(Model model)
	{
		Student std = new Student();
		std.setfName("Pavan");
		std.setlName("Kumar");
		std.setSid(143);
		std.setDob("15-06-2001");
		std.setCity("hyderabad");
		model.addAttribute("std", std);
		return "student";
	}
	
	
	
	
}

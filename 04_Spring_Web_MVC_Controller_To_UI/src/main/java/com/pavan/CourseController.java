package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CourseController {

	public String course(Model model)
	{
		model.addAttribute("courseId" , "java123");
		model.addAttribute("courseName" , "CoreJava");
		model.addAttribute("duration" , "2Months");
		
		return "course";
	}
}

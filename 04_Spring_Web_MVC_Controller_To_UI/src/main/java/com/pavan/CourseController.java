package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

	@GetMapping("/course")
	public String course(Model model)
	{
		model.addAttribute("courseId" , "java123");
		model.addAttribute("courseName" , "CoreJava");
		model.addAttribute("duration" , "2Months");
		
		return "course";
	}
}

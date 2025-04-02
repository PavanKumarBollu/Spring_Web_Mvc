package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingleQueryController {

	@GetMapping("/std")
	public String course(@RequestParam("name") String name, Model model)
	{
		model.addAttribute("query" , name + " Welcome to Java Advance Course....");
		
		
		return "course";
	}
}

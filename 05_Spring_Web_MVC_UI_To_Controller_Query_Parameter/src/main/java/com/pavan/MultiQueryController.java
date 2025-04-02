package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiQueryController {

	@GetMapping("/stds")
	public String course(@RequestParam("name") String name, @RequestParam("city")String city, Model model)
	{
		model.addAttribute("query" , name + " Welcome to Java Advance Course Located In  " +city );
				
		return "course";
	}
}

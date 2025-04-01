package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerOne {
		
	@GetMapping("/controller1")
	public String wish(Model model)
	{
		model.addAttribute("msg", "Controller One");
		
		return "index";
	}
	
	
}

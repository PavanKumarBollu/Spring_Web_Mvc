package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTwo {
	
	@GetMapping("/controller2")
	public String wish(Model model)
	{
		model.addAttribute("msg", "Controller Two");
		return "index";
	}
}

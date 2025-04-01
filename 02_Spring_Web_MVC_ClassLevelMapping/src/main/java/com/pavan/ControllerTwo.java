package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class ControllerTwo {
	
	@GetMapping("/controller1")
	public String wish(Model model)
	{
		model.addAttribute("msg", "Specifice Wish of the Controller Two");
		return "index";
	}
}

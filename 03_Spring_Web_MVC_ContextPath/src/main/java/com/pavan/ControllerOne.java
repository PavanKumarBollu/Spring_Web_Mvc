package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/first")
@RequestMapping
public class ControllerOne {
		
	@GetMapping("/con")
	public String wish(Model model)
	{
		model.addAttribute("msg", "Specific wish of the Controller One");
		
		return "index";
	}
	@GetMapping
	public String genaralWish(Model model)
	{
		model.addAttribute("msg", "Genaral wish of the Controller one");
		return "index";
	}
	
	
	
}

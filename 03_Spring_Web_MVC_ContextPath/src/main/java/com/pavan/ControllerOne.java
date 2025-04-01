package com.pavan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
//@RequestMapping// if you specify this then the controller will come here for the default url request
// and this will call the general wish method because that is binded for default get mapping
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

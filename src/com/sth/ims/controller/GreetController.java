package com.sth.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * Author- Mohinesh Tayade
 **/
@Controller
@RequestMapping("/")
public class GreetController {

	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("msg","Welcome to Spring MVC world");
		return "index";
	}
	
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public String greet(ModelMap model)
	{
		System.out.println("Inside controller");
		model.addAttribute("msg","<h1>Hello Mohinesh! Welcome to Spring world</h1>");
		return "greet";
	}
}

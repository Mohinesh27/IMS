package com.sth.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sth.ims.model.User;

/*
 * Author- Mohinesh Tayade
 **/
@Controller
public class UserController {

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String user(ModelMap model)
	{
		List<User> users=new ArrayList<User>();//TODO- Add service call
		model.addAttribute("users",users);
		return "user";
	}
	
	@RequestMapping(value="/user/new",method=RequestMethod.POST)
	public String saveUser(ModelMap model)
	{
		User user=new User();//TODO- Add service call
		model.addAttribute("user",user);
		return "registraion";
	}
	
	@RequestMapping(value="/user/new",method=RequestMethod.GET)
	public String newUser(ModelMap model)
	{
		User user=new User();//TODO- Add service call
		model.addAttribute("user",user);
		return "registraion";
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.GET)
	public String editUser(@PathVariable String userId,ModelMap model)
	{
		List<User> users=new ArrayList<User>();//TODO- Add service call
		model.addAttribute("users",users);
		return "registraion";
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.POST)
	public String updateUser(@PathVariable String userId,ModelMap model)
	{
		List<User> users=new ArrayList<User>();//TODO- Add service call
		model.addAttribute("users",users);
		return "registraion";
	}
	
}

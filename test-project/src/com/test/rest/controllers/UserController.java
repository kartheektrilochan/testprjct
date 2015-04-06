package com.test.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/userroles")
public class UserController {

	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public String getDetails(@PathVariable String name,ModelMap model){

		System.out.println("Name is:"+name);
		model.addAttribute("name",name);
		return "test";
	}
	
}

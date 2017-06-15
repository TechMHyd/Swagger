package com.swiggy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swiggy.domain.MenuItem;
import com.swiggy.service.SwiggyMenuService;
import com.wordnik.swagger.annotations.Api;

@Api(value = "swiggy", description = "Food Store")
@Controller
@RequestMapping("/swiggy")
public class SwiggyMenuController {

	@Autowired
	SwiggyMenuService menuService;
	
	@ResponseBody
	@RequestMapping(value="/all" , method=RequestMethod.GET)
	public MenuItem[] getAllItems(){
		return menuService.getItems();
	}
	@ResponseBody
	@RequestMapping(value="/id/{id}",method=RequestMethod.GET )
	public MenuItem getMenuItem(@PathVariable("id") int id){
		return menuService.getItem(id);
	}
	
}

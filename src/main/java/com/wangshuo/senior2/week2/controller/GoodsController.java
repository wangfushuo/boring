package com.wangshuo.senior2.week2.controller;

import javax.xml.transform.Templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoodsController {
	
   @Autowired
     
   
   
	@RequestMapping("list")
	public String RedisList(Model model,@RequestParam(defaultValue="")Integer page,
			                @RequestParam(defaultValue="10")Integer pageSize) {
	
		return null;
		
	} 
	

}

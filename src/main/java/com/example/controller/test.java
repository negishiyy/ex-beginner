package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index1")
public class test {
	
	@RequestMapping("/index2")
	public String result() {
		return "result";
	}

}

package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam-03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/total")
	public String totalPrice(String num1, String num2, String num3, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("num3", num3);
		
		int extendTax =(int)(num1+num2)-((num1+num2)* 0.1);
		model.addAttribute("number1", extendTax);
		
		int includeTax =(int)(num1* 0.1) + (num2* 0.1);
		model.addAttribute("number2", includeTax);
		
		return "exam03-result";

	}
	

}

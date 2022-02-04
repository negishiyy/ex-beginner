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
	public String totalPrice(Integer num1, Integer num2, Integer num3, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("num3", num3);
		
		int extendTax =(int)((num1+num2+num3)-((num1+num2+num3) * 0.1));
		model.addAttribute("number1", extendTax);
		
		int includeTax =(int)((num1* 1.1) + (num2* 1.1)+ (num3* 1.1));
		model.addAttribute("number2", includeTax);
		
		return "exam03-result";

	}
	

}

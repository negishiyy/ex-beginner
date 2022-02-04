package com.example.controller;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex-04")
public class Exam04Controller {
	
	@RequestMapping("/user")
	public String index(@Validated UserForm form, 
			BindingResult result, 
			RedirectAttributes redirectAttributes, 
			Model model) {
		if(result.hasErrors()) {
			return index(model);
		}
		
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		
		
	}
	

}

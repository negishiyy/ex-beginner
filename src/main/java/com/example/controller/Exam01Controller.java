package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam-01")
public class Exam01Controller {
	
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/result")
		public String result(String name) {
		session.setAttribute("name", name);
			return "exam01-result";
		}
	}


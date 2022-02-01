package com.te.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.emp.bean.EmployeeDetails;
import com.te.emp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService Service;

	@GetMapping("/login")
	public String logIn() {
		return "loginform";

	}

	@PostMapping("/login")
	public String data(int id, String pass, ModelMap map) {
		EmployeeDetails details = Service.authenticate(id, pass);
		if (details != null) {
			map.addAttribute("name", details.getName());
			return "welcome";
		} else {
			map.addAttribute("errMsg", "Enter valid data");
			return "loginform";
		}

	}
}

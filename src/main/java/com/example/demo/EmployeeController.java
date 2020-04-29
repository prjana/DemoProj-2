package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(Employee employee) {
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}

	@RequestMapping("/displayAll")
	public ModelAndView displayAllEmployee(Employee employee) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("1111", "Prathibha", "prathibha@gmail.com", "Richmond"));
		empList.add(new Employee("2222", "Daniel", "daniel@gmail.com", "Plano"));
		empList.add(new Employee("3333", "John", "john@gmail.com", "Plano"));
		
		ModelAndView modelAndView = new ModelAndView("displayEmployee");
		modelAndView.addObject("employeeList", empList);
		return modelAndView;
	}
	
	@RequestMapping("/employee/{employeeName}")
	public ModelAndView displayEmployee(@PathVariable("employeeName") String employeeName,Employee employee) {
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}
}

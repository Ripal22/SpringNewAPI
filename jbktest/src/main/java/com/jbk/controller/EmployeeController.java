package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi")
public class EmployeeController {

	@RequestMapping("singlequestion")
	public Employee getEmployee() {
		System.out.println("API is called for questions");
		Employee employee = new Employee();
		employee.setQuestionText("is java platform independent?");
		employee.setOption1("yes");
		employee.setOption2("no");
		employee.setCorrectOption("1");
		employee.setExplanation("Due to its byte code..which is OS independent..!");
		return null;

	}

}

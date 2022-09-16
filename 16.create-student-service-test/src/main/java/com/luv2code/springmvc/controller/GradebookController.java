package com.luv2code.springmvc.controller;

import com.luv2code.springmvc.models.Gradebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GradebookController {

	private final Gradebook gradebook;

	@Autowired
	public GradebookController(Gradebook gradebook) {
		this.gradebook = gradebook;
	}


	@GetMapping("/")
	public String getStudents(Model m) {
		return "index";
	}


	@GetMapping("/studentInformation/{id}")
		public String studentInformation(@PathVariable int id, Model m) {
		return "studentInformation";
		}

}

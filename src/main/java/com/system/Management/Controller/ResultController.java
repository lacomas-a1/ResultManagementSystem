package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.system.Management.Model.Result;
import com.system.Management.Service.ResultService;

@Controller
public class ResultController {
	 //***********CRUD RESULTS********
		@Autowired
		private ResultService resultService;
		

		//Display list of Classes
		@GetMapping("/results")
		public String classHomePage(Model model) {
			model.addAttribute("listResults", resultService.getAllResults());
			return "/pages/results";
		}
		
//		@GetMapping("/showResultForm")
//		public String showResultForm(Model model) {
//			//create model attribute to bind form data
//			Result result = new Result();
//			model.addAttribute("result", result);
//			return "/pages/add/new_results";
//		}
		
		@PostMapping("/saveResult")
		public String saveResult(@ModelAttribute("result") Result result) {
			//save to database
			resultService.saveResult(result);
			return "redirect:/results";
		}
		
		@GetMapping("/resultUpdate/{id}")
		public String resultUpdate(@PathVariable(value="id") long id, Model model) {
			//get class form service
			Result result = resultService.getResultById(id);
			
			//set class as a model attribute to pre-populate the form
			model.addAttribute("result", result);
			return "/pages/edit/results-edit";
		}
		
		@GetMapping("/resultDelete/{id}")
		public String deleteResult(@PathVariable(value = "id") long id) {
			//call delete Method
			this.resultService.deleteResultById(id);
			return "redirect:/results";
		}
		

}

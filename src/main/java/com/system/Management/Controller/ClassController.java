package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.Management.Model.Class;
import com.system.Management.Service.ClassService;

@Controller
public class ClassController {
	 //***********CRUD CLASSES********
	@Autowired
	private ClassService classService;
	

	//Display list of Classes
	@GetMapping("/class")
	public String classHomePage(Model model) {
		model.addAttribute("listClasses", classService.getAllClasses());
		return "pages/class";
	}
	
	@GetMapping("/showClassForm")
	public String showClassForm(Model model) {
		//create model attribute to bind form data
		Class class1 = new Class();
		model.addAttribute("class1", class1);
		return "/pages/add/new_class";
	}
	
	@PostMapping("/saveClass")
	public String saveClass(@ModelAttribute("class1") Class class1) {
		//save to database
		classService.saveClass(class1);
		return "redirect:/class";
	}
	
	@GetMapping("/classUpdate/{id}")
	public String classUpdate(@PathVariable(value="id") long id, Model model) {
		//get class form service
		Class class1 = classService.getClassById(id);
		
		//set class as a model attribute to pre-populate the form
		model.addAttribute("class1", class1);
		return "/pages/edit/class-edit";
	}
	
	@GetMapping("/classDelete/{id}")
	public String deleteClass(@PathVariable(value = "id") long id) {
		//call delete Method
		this.classService.deleteClassById(id);
		return "redirect:/class";
	}
	


}

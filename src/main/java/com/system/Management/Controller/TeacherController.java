package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.Management.Model.Teacher;
import com.system.Management.Service.TeacherService;

@Controller
public class TeacherController {

	    //***********CRUD TEACHER********
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/teacher")
		public String teacherHomePage(Model model) {
		model.addAttribute("listTeacher", teacherService.getAllTeachers());
		return "/pages/teacher";
	}
	
	
//	@GetMapping("/showTeacherForm")
//	public String showTeacherForm(Model model) {
//		//create model attribute to bind form data
//		Teacher teacher = new Teacher();
//		model.addAttribute("teacher", teacher);
//		return "/pages/add/new_teacher";
//		
//	}
	
	@PostMapping("/saveTeacher")
		public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teacher";
	}
	
	@GetMapping("/teacherUpdate/{id}")
		public String teacherUpdate(@PathVariable(value="id") long id, Model model) {
		//get class form service
		Teacher teacher = teacherService.getTeacherById(id);
		//set class as a model attribute to pre-populate the form
		model.addAttribute("teacher", teacher);
		return "/pages/edit/teacher-edit";
	}
	
	@GetMapping("/teacherDelete/{id}")
		public String deleteTeacher(@PathVariable(value = "id") long id) {
		//call delete Method
		this.teacherService.deleteTeacherById(id);
		return "redirect:/teacher";
	}

}

package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.Management.Model.Student;
import com.system.Management.Service.StudentService;

@Controller
public class StudentController {
	//***********CRUD STUDENT********
			@Autowired
			private StudentService studentService;
			
			
			//Display list of Classes
			@GetMapping("/student")
			public String studentHomePage(Model model) {
				model.addAttribute("listStudents", studentService.getAllStudents());
				return "pages/student";
			}
			
//			@GetMapping("/showStudentForm")
//			public String showStudentForm(Model model) {
//				//create model attribute to bind form data
//				Student student = new Student();
//				model.addAttribute("student", student);
//				return "/pages/add/new_student";
//			}
			
			@PostMapping("/saveStudent")
			public String savaStudent(@ModelAttribute("student") Student student) {
				//save to db
				studentService.saveStudent(student);
				return "redirect:/student";
			}
			
			@GetMapping("/studentUpdate/{id}")
			public String studentUpdate(@PathVariable(value="id") long id, Model model) {
				//get class form service
				Student student = studentService.getStudentById(id);		
				//set class as a model attribute to pre-populate the form
				model.addAttribute("student", student);
				return "/pages/edit/student-edit";
			}
			
			@GetMapping("/studentDelete/{id}")
			public String deleteStudent(@PathVariable(value = "id") long id) {
				//call delete Method
				this.studentService.deleteStudentById(id);
				return "redirect:/student";
			}
			

}

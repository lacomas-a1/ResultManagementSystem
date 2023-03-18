package com.system.Management.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.Management.Model.Class;
import com.system.Management.Service.ClassService;


@Controller
public class ManagementController {
		@RequestMapping("/")
		public String loginPage() {
			return "index";
		}
		
		@RequestMapping("/home")
		public String homePage() {
			return "pages/dashboard";
		}
		
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
		
	
	
//	@RequestMapping("/class")
//	public String classPage() {
//		return "pages/class";
//	}
	
	@RequestMapping("/student")
	public String studentPage() {
		return "pages/student";
	}
	
	@RequestMapping("/download")
	public String downloadPage() {
		return "/pages/download";
	}
	
	@RequestMapping("/exams")
	public String examPage() {
		return "/pages/exams";
	}
	
	@RequestMapping("/results")
	public String resultPage() {
		return "/pages/results";
	}
	
//	@RequestMapping("/subject")
//	public String subjectPage() {
//		return "/pages/subject";
//	}
	
	@RequestMapping("/teacher")
	public String teacherPage() {
		return "/pages/teacher";
	}
	
	@RequestMapping("/changepass")
	public String changePassword() {
		return "/pages/more/changepassword";
	}
	
	@RequestMapping("/settings")
	public String settingPage() {
		return "/pages/more/setting";
	}
	
	@RequestMapping("/advsettings")
	public String advancedSetting() {
		return "/pages/more/advancesetting";
	}

}

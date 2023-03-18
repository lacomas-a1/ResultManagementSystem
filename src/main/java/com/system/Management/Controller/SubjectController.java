package com.system.Management.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.system.Management.Model.Subject;
import com.system.Management.Service.SubjectService;


@Controller
public class SubjectController {
	

		    //***********CRUD SUBJECTS********
		
		@Autowired
		private SubjectService subjectService;
		
		@GetMapping("/subject")
			public String subjectHomePage(Model model) {
			model.addAttribute("listSubject", subjectService.getAllSubjects());
			return "/pages/subject";
		}
		
		
		@GetMapping("/showSubjectForm")
		public String showSubjectForm(Model model) {
			//create model attribute to bind form data
			Subject subject = new Subject();
			model.addAttribute("subject", subject);
			return "/pages/add/new_subject";
			
		}
		
		@PostMapping("/saveSubject")
			public String saveSubject(@ModelAttribute("subject") Subject subject) {
			subjectService.saveSubject(subject);
			return "redirect:/subject";
		}
		
		@GetMapping("/subjectUpdate/{id}")
			public String subjectUpdate(@PathVariable(value="id") long id, Model model) {
			//get class form service
			Subject subject = subjectService.getSubjectById(id);
			//set class as a model attribute to pre-populate the form
			model.addAttribute("subject", subject);
			return "/pages/edit/subject-edit";
		}
		
		@GetMapping("/subjectDelete/{id}")
			public String deleteSubject(@PathVariable(value = "id") long id) {
			//call delete Method
			this.subjectService.deleteSubjectById(id);
			return "redirect:/subject";
		}
}

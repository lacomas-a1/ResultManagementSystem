package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.system.Management.Model.Exam;
import com.system.Management.Service.ExamService;


@Controller
public class ExamController {
	//***********CRUD EXAMS********
		@Autowired
		private ExamService examService;
		
		
		//Display list of Classes
		@GetMapping("/exams")
		public String examHomePage(Model model) {
			model.addAttribute("listExams", examService.getAllExams());
			return "/pages/exams";
		}
		
//		@GetMapping("/showExamForm")
//		public String showExamForm(Model model) {
//			//create model attribute to bind form data
//			Exam exam = new Exam();
//			model.addAttribute("exam", exam);
//			return "/pages/add/new_exams";
//		}
		
		@PostMapping("/saveExam")
		public String savaExam(@ModelAttribute("exam") Exam exam) {
			//save to db
			examService.saveExam(exam);
			return "redirect:/exams";
		}
		
		@GetMapping("/examUpdate/{id}")
		public String examUpdate(@PathVariable(value="id") long id, Model model) {
			//get class form service
			Exam exam = examService.getExamById(id);
			
			//set class as a model attribute to pre-populate the form
			model.addAttribute("exam", exam);
			return "/pages/edit/exams-edit";
		}
		
		@GetMapping("/examDelete/{id}")
		public String deleteExam(@PathVariable(value = "id") long id) {
			//call delete Method
			this.examService.deleteExamById(id);
			return "redirect:/exams";
		}
		


}

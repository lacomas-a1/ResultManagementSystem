package com.system.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.system.Management.Model.Class;
import com.system.Management.Model.Exam;
import com.system.Management.Model.Result;
import com.system.Management.Model.Student;
import com.system.Management.Model.Subject;
import com.system.Management.Model.Teacher;
import com.system.Management.Repository.ClassRepository;
import com.system.Management.Repository.ExamRepository;
import com.system.Management.Repository.StudentRepository;
import com.system.Management.Repository.SubjectRepository;
import com.system.Management.Repository.TeacherRepository;

@Controller
public class SelectOptionController {
	
	@Autowired
	ClassRepository classRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	ExamRepository examRepository;
	
	    @GetMapping("/showSubjectForm")
	    public String showSubjectForm(Model model) {
	        List<Class> classes = classRepository.findAll();
	        model.addAttribute("listClasses", classes);
	        model.addAttribute("subject", new Subject());
	        return "/pages/add/new_subject";
	    }
	  
	    @GetMapping("/showStudentForm")
		public String showStudentForm(Model model) {
		  List<Class> classes = classRepository.findAll();
		  model.addAttribute("listClasses", classes);
		  model.addAttribute("student", new Student());
		  return "/pages/add/new_student";
		}
	  
	    @GetMapping("/showTeacherForm")
		public String showTeacherForm(Model model) {
	    	List<Class> classes = classRepository.findAll();
			model.addAttribute("listClasses", classes);
			List<Subject> subjects = subjectRepository.findAll();
			model.addAttribute("listSubject", subjects);
			model.addAttribute("teacher", new Teacher());
			return "/pages/add/new_teacher";
			
		}
	    
	    @GetMapping("/showExamForm")
		public String showExamForm(Model model) {
	    	List<Class> classes = classRepository.findAll();
			model.addAttribute("listClasses", classes);
			List<Subject> subjects = subjectRepository.findAll();
			model.addAttribute("listSubject", subjects);
			model.addAttribute("exam", new Exam());
			return "/pages/add/new_exams";
		}
	    
	    @GetMapping("/showResultForm")
		public String showResultForm(Model model) {
	    	List<Class> classes = classRepository.findAll();
			model.addAttribute("listClasses", classes);
			List<Subject> subjects = subjectRepository.findAll();
			model.addAttribute("listSubject", subjects);
			List<Exam> exams = examRepository.findAll();
			model.addAttribute("listExams", exams);
			model.addAttribute("result", new Result());
			return "/pages/add/new_results";
		}

}

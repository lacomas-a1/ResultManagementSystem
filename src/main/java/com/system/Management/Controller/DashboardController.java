package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.system.Management.Repository.ClassRepository;
import com.system.Management.Repository.StudentRepository;
import com.system.Management.Repository.SubjectRepository;
import com.system.Management.Repository.TeacherRepository;

import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;

//
@Controller
public class DashboardController {
//	@Autowired
//    private SubjectRepository subjectRepository;
//	
//	@Autowired
//	private ClassRepository classRepository;
//	
//	@Autowired
//	private TeacherRepository teacherRepository;
//	
	@Autowired
	private StudentRepository studentRepository;
    
//	private final TeacherRepository teacherRepository;
//	private final StudentRepository studentRepository;
//	private final SubjectRepository subjectRepository;
//	private final ClassRepository classRepository;
//	
//	
//	public DashboardController(TeacherRepository teacherRepository, StudentRepository studentRepository,
//			SubjectRepository subjectRepository, ClassRepository classRepository) {
//		super();
//		this.teacherRepository = teacherRepository;
//		this.studentRepository = studentRepository;
//		this.subjectRepository = subjectRepository;
//		this.classRepository = classRepository;
//	}
	
//	 @GetMapping("")
//	    public ModelAndView dashboard(ModelAndView modelAndView) {
//	        modelAndView.setViewName("dashboard");
//
//	        Long classCount = classRepository.count();
//	        Long subjectCount = subjectRepository.count();
//	        Long teacherCount = teacherRepository.count();
//	        Long studentCount = studentRepository.count();
//
//	        modelAndView.addObject("count1", classCount);
//	        modelAndView.addObject("count", subjectCount);
//	        modelAndView.addObject("count2", teacherCount);
//	        modelAndView.addObject("count3", studentCount);
//
//	        return modelAndView;
//	    }
	
	
   
//    @GetMapping("/")
//    public String showSubjectCount(Model model) {
//        long count = subjectRepository.count();
//        System.out.println("Total number of subjects: " + count);
//        model.addAttribute("count", count);
//        return "/pages/dashboard";
//    }
////
//    @GetMapping("/count1")
//    public String showClassCount(Model model) {
//        long count = classRepository.count();
//        System.out.println("Total number of subjects: " + count);
//        model.addAttribute("count1", count);
//        return "/pages/dashboard";
//    }
//////    
//    @GetMapping("/count2")
//    public String showTeacherCount(Model model) {
//        long count = teacherRepository.count();
//        System.out.println("Total number of subjects: " + count);
//        model.addAttribute("count2", count);
//        return "/pages/dashboard";
//    }
////
    @GetMapping("/count3")
    public String showStudentCount(Model model) {
        long count = studentRepository.count();
        System.out.println("Total number of subjects: " + count);
        model.addAttribute("studentCount", count);
        return "/pages/dashboard";
    }
//
}

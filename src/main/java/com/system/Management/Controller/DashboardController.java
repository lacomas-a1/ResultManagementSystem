package com.system.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.Management.Repository.ClassRepository;
import com.system.Management.Repository.StudentRepository;
import com.system.Management.Repository.SubjectRepository;
import com.system.Management.Repository.TeacherRepository;


@Controller
public class DashboardController {
	@Autowired
    private SubjectRepository subjectRepository;
	
	@Autowired
	private ClassRepository classRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
    
	
    @PostMapping("/dashboard")
	public String dashboard(Model model) {
	Long studentCount = studentRepository.count();
	Long teacherCount = teacherRepository.count();
	Long subjectCount = subjectRepository.count();
	Long classCount = classRepository.count();

	model.addAttribute("studentCount", studentCount);
	model.addAttribute("teacherCount", teacherCount);
	model.addAttribute("subjectCount", subjectCount);
	model.addAttribute("classCount", classCount);

	 return "/pages/dashboard";
	}

}

package com.system.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.system.Management.Model.Class;
import com.system.Management.Model.Subject;
import com.system.Management.Repository.ClassRepository;
import com.system.Management.Repository.SubjectRepository;

@Controller
public class SelectOptionController {
	
	@Autowired
	ClassRepository classRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	  @GetMapping("/showSubjectForm")
	    public String showSubjectForm(Model model) {
	        List<Class> classes = classRepository.findAll();
	        model.addAttribute("listClasses", classes);
	        model.addAttribute("subject", new Subject());
	        return "/pages/add/new_subject";
	    }

}

package com.system.Management.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/class")
	public String classPage() {
		return "/pages/class";
	}

}

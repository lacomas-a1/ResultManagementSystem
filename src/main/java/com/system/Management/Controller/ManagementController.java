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
		
		                            
	
//	@RequestMapping("/class")
//	public String classPage() {
//		return "pages/class";
//	}
	
//	@RequestMapping("/student")
//	public String studentPage() {
//		return "pages/student";
//	}
//	
	@RequestMapping("/download")
	public String downloadPage() {
		return "/pages/download";
	}
	
//	@RequestMapping("/exams")
//	public String examPage() {
//		return "/pages/exams";
//	}
	
//	@RequestMapping("/results")
//	public String resultPage() {
//		return "/pages/results";
//	}
	
//	@RequestMapping("/subject")
//	public String subjectPage() {
//		return "/pages/subject";
//	}
	
//	@RequestMapping("/teacher")
//	public String teacherPage() {
//		return "/pages/teacher";
//	}
	
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

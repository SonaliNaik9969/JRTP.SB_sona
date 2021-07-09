package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class EmpController {
	@GetMapping("/emp")
	public ModelAndView loadEmployeeForm()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("Title", "Employee Regestration Form");
		mav.setViewName("student");
		
		return mav;
	}
	
		
}

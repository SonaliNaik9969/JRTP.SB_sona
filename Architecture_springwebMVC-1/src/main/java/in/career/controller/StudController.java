package in.career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudController {
	@GetMapping("/student")
	public ModelAndView getStudent()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Sonali");
		mav.addObject("lastname", "Naik");
		
		mav.setViewName("student");
		return mav;
	}

}

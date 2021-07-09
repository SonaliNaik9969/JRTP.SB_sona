package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@GetMapping("display")
	public String display()
	{
		String msg="Welcome";
		return msg;
	}

	

}

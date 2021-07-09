package in.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	
	
		@GetMapping("info")
		public String info()
		{
			String msg="Information about employee";
			return msg;
		}
	

}

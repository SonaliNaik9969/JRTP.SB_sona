package in.career.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import in.career.entity.Employee;
import in.career.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String loadIndex()
	{
		return "index";
	}
	@GetMapping("/delete/{id}")
	public String DeleteEmployeeByID(@PathVariable("id")Long id)
	{
		empService.deleteEmployeeByID(id);
		return "redirect:/employees";
	}
	@GetMapping("/register")
	public ModelAndView Registration()
	{
		ModelAndView mav = new ModelAndView();
		Employee emp = new Employee();
		mav.addObject("emp", emp);
		mav.setViewName("EmployeeRegestration");
		return mav;
	}
	@GetMapping("/employees")
	public ModelAndView getAllEmployees()
	{
		ModelAndView mav = new ModelAndView();
		List<Employee> allEmployee = empService.getAllEmployees();
		mav.addObject("allEmployee", allEmployee);
		mav.setViewName("ViewAllEmployees");
		System.out.println(allEmployee);
		return mav;
	}
	@GetMapping("/update/{id}")
	public ModelAndView updateEmployee(@PathVariable("id") Long id)
	{
		ModelAndView mav = new ModelAndView();
		Employee emp = empService.findEmployeeById(id);
		mav.addObject("emp", emp);
		mav.setViewName("EmployeeRegestration");
		return mav;
	}
	@GetMapping(value = {"/save","/update/save"})
	public String saveEmployee(Employee emp)
	{
		empService.saveEmployee(emp);
		System.out.println(emp);
		return "redirect:/employees";
	}
	
	@Autowired
	private EmployeeService empService;
	

}

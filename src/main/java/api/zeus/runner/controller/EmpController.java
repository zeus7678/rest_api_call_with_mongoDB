package api.zeus.runner.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.zeus.runner.model.Employee;
import api.zeus.runner.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService employeeService;
	
	@RequestMapping(method=RequestMethod.GET,value="/_all")
	public List<Employee> show_All_Employee()
	{
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/emp/{id}")
	public Employee get_One_Employee(@PathVariable("id") String id)
	{
		return employeeService.getEmpById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public String add_New_Employee(@RequestBody Employee new_employee )
	{
		Employee added_employee=employeeService.addNewEmployee(new_employee);
		return "Employee Created with Email id : "+added_employee.getEmail();
	}
	
	@RequestMapping("/{id}")
	public String HandleError(@PathVariable("id") String worngUrl)
	{
		return  "Page Not Found 404";
	}
	
	

}

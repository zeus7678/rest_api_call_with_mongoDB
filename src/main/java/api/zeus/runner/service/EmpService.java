package api.zeus.runner.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.zeus.runner.model.Employee;
import api.zeus.runner.repository.empRespository;


@Service
public class EmpService {

	@Autowired
	private empRespository empRepo;
	
	public List<Employee> getAllEmployee()
	{
		return empRepo.findAll();
	}
    
	public Employee getEmpById(String id) {
		Optional<Employee> option=empRepo.findById(id);
		Employee temp_employee=null;
		if(option.isPresent())
		{
			temp_employee=option.get();
		}
		else
		{
			throw new RuntimeException(" Employee Not Found!!!");
		}
		return temp_employee;
	}

	public Employee addNewEmployee(Employee new_employee) {
		 return empRepo.save(new_employee);
		
	}
}

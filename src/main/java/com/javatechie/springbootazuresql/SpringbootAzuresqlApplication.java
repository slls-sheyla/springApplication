package com.javatechie.springbootazuresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringbootAzuresqlApplication {

	@Autowired
	private EmployeeRepository repository;


	@Autowired
	private EmployeeRepository2 repository2;

	@Autowired
	private EmployeeRepository3 repository3;
 
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@PostMapping("/employee2")
	public Employee2 addEmployee2(@RequestBody Employee2 employee) {
		return repository2.save(employee);
	}

	@PostMapping("/employee3")
	public Employee3 addEmployee3(@RequestBody Employee3 employee) {
		return repository3.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	@GetMapping("/employees2")
	public List<Employee2> getEmployees2() {
		return repository2.findAll();
	}


	@GetMapping("/employees3")
	public List<Employee3> getEmployees3() {
		return repository3.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}

}

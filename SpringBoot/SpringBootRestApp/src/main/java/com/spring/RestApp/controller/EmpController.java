package com.spring.RestApp.controller;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.spring.RestApp.entity.Employee;
	import com.spring.RestApp.repository.EmployeeRepo;

	@RestController
	public class EmpController {
		@Autowired
		private EmployeeRepo repo;

	// @RequestMapping(value="/getemps",method = RequestMethod.GET)
	@GetMapping("/getemps")
	public List<Employee> getEmployees() {
			System.out.println("getemployees...");		
			return (List<Employee>) repo.findAll();
	}

	@GetMapping("/getempbyid/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
			System.out.println("getemployeebyid...");
			return  repo.findById(id);
    }

	@GetMapping("/getempbyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
			System.out.println("getemployeebyname...");
			return (List<Employee>) repo.findByName(name);
   }

   @PostMapping("/addemp")
   void addEmployee(@RequestBody Employee emp) {
			System.out.println("addemployee...");
			repo.save(emp);
   }

   @DeleteMapping("/deleteemp/{id}")
   void deleteEmployee(@PathVariable Integer id) {
			System.out.println("deleteById...");
			repo.deleteById(id);
   }

   @PutMapping("/updateemp/{id}")
   Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Integer id){
		  return repo.findById(id).map(employee -> {
			  		employee.setName(newEmployee.getName());
			  		employee.setSalary(newEmployee.getSalary());
			  		return repo.save(employee); })
		  .orElseGet(() -> { 
			  newEmployee.setId(id); 
		      return repo.save(newEmployee); }); 
		  }
}
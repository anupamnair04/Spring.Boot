package com.spring.RestApp.repository;

	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.spring.RestApp.entity.Employee;

	@Repository
	public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
		List<Employee> findByName(String name);
}
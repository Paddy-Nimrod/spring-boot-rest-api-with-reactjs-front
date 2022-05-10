package com.cicenicdesigns.springboot;

import com.cicenicdesigns.springboot.entity.Employee;
import com.cicenicdesigns.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder().
				firstName("Nimrod").
				lastName("Ambetsa").
				email("nimrod@protonmail.com").
				build();

		Employee employee2 = Employee.builder().
				firstName("Harold").
				lastName("Ambetsa").
				email("harold@gmail.com").
				build();

		Employee employee3 = Employee.builder().
				firstName("Jeremiah").
				lastName("Induswe").
				email("induswe@protonmail.com").
				build();

		Employee employee4 = Employee.builder().
				firstName("Euse").
				lastName("Nanzala").
				email("nanzala@yahoo.com").
				build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
	}
}

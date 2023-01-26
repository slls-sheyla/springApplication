package com.javatechie.springbootazuresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository2 extends JpaRepository<Employee2, Integer> {
    
}


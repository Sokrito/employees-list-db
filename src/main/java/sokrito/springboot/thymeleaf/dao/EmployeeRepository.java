package sokrito.springboot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sokrito.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

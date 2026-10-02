package code.logic.dhinu.ems_backend.repository;

import code.logic.dhinu.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

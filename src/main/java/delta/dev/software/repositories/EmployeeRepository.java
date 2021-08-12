package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.person.Employee;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  
}

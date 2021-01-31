
package springmvc.dao;

import java.util.List;
import springmvc.model.Employee;

public interface EmployeeDAO {
	Employee findById(int id);

	void saveEmployee(Employee employee);

	void deleteEmployeeBySsn(String ssn);

	List<Employee> findAllEmployees();

	Employee findEmployeeBySsn(String ssn);
}

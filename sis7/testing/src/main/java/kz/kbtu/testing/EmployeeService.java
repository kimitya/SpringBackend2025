package kz.kbtu.testing;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeByName(String name);
}

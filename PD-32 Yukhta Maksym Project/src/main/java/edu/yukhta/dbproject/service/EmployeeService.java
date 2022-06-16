package edu.yukhta.dbproject.service;

import edu.yukhta.dbproject.entity.Employee;

import java.util.List;

public interface EmployeeService  {

    public List<Employee> getAllEmployees();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}

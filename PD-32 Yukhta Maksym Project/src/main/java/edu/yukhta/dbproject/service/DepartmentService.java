package edu.yukhta.dbproject.service;

import edu.yukhta.dbproject.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllDepartments();

    public Department getDepartment(int id);

    public void saveDepartment(Department department);

    public void updateDepartment(Department department);

    public void deleteDepartment(int id);
}

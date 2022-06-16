package edu.yukhta.dbproject.service;

import edu.yukhta.dbproject.dao.DepartmentDAO;
import edu.yukhta.dbproject.dao.EmployeeDAO;
import edu.yukhta.dbproject.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override @Transactional
    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    @Override @Transactional
    public Department getDepartment(int id) {
        return departmentDAO.getDepartment(id);
    }

    @Override @Transactional
    public void saveDepartment(Department department) {
        departmentDAO.saveDepartment(department);
    }

    @Override @Transactional
    public void updateDepartment(Department department) {
        departmentDAO.saveDepartment(department);
    }

    @Override @Transactional
    public void deleteDepartment(int id) {
        departmentDAO.deleteDepartment(id);
    }
}

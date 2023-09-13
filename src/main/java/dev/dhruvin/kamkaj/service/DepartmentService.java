package dev.dhruvin.kamkaj.service;

import dev.dhruvin.kamkaj.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department findDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);
}

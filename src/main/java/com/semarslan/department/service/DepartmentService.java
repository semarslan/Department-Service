package com.semarslan.department.service;

import com.semarslan.department.entity.Department;

public interface DepartmentService {
    Department save(Department department);

    Department findDepartmentById(Long departmentId);
}

package com.semarslan.department.service.impl;

import com.semarslan.department.entity.Department;
import com.semarslan.department.repository.DepartmentRepository;
import com.semarslan.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    public final DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

}

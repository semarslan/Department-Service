package com.semarslan.department.controller;

import com.semarslan.department.entity.Department;
import com.semarslan.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.save(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id) {
        log.info("Inside findDepartmentById method of DepartmentController");

        return departmentService.findDepartmentById(id);
    }
}

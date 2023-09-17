package dev.dhruvin.kamkaj.controller;

import dev.dhruvin.kamkaj.entity.Department;
import dev.dhruvin.kamkaj.service.DepartmentService;
import dev.dhruvin.kamkaj.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Creating a new department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Fetch all the department from the database");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        LOGGER.info("fetch department " + departmentId + " from the database");
        return departmentService.findDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        LOGGER.info("Delete department ID : " + departmentId + " from the database");
        departmentService.deleteDepartmentById(departmentId);
        return "department is deleted";
    }


    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){
        LOGGER.info("Update the Deparment ID :" + departmentId + " . from the database");
        return departmentService.updateDepartmentById(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Fetch the Deparment :" + departmentName + " . from the database");
        return departmentService.fetchDepartmentByName(departmentName);
    }

    @GetMapping("/departments/name/ignoreCase/{name}")
    public Department fetchDepartmentByNameIgnoreCase(@PathVariable("name") String departmentName){
        LOGGER.info("Fetch the Deparment :" + departmentName + " . from the database");
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }
}

// src/main/java/com/example/demo/controller/EmployeeController.java

package com.springboot_docker_kubernetes.Springboot_Docker_Kubernetes.controller;

import com.springboot_docker_kubernetes.Springboot_Docker_Kubernetes.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
            new Employee(1L, "A", "Developer"),
            new Employee(2L, "B", "Manager"),
            new Employee(3L, "C", "Analyst"),
                new Employee(4L, "D", "Tester"),
                new Employee(5L, "E", "Designer"),
                new Employee(6L, "F", "Developer"),
                new Employee(7L, "G", "Manager"),
                new Employee(8L, "H", "Analyst")
        );
    }
}

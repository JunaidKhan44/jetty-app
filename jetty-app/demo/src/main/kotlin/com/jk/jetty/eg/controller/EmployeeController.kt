package com.jk.jetty.eg.controller


import com.jk.jetty.eg.model.Employee
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/employees")
class EmployeeController {


    private val employees = listOf(
        Employee(id = 1, name = "Alice", position = "Software Engineer", department = "Engineering"),
        Employee(id = 2, name = "Bob", position = "Project Manager", department = "Management"),
        Employee(id = 3, name = "Charlie", position = "UX Designer", department = "Design"),
        Employee(id = 4, name = "David", position = "Product Owner", department = "Product")
    )


    @GetMapping
    fun getAllEmployees(): List<Employee> {
        return employees
    }
}

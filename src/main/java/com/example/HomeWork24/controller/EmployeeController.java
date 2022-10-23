package com.example.HomeWork24.controller;

import com.example.HomeWork24.Exception.EmployeeAlreadyAddedException;
import com.example.HomeWork24.Exception.EmployeeNotFoundException;
import com.example.HomeWork24.Interface.EmployeeService;
import com.example.HomeWork24.JavaClass.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Object add(@RequestParam String firstName, @RequestParam String lastName){
        try {
            employeeService.add(firstName, lastName);
            return employeeService.get(firstName, lastName);
        } catch (EmployeeAlreadyAddedException e) {
            return "Ошибка пользователь уже есть";
        }
    }

    @GetMapping("/remove")
    public Object remove(@RequestParam String firstName, @RequestParam String lastName){
        try{
            return employeeService.remove(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            return "Ошибка пользователь не найден!";
        }
    }

    @GetMapping("/find")
    public Object get(@RequestParam String firstName, @RequestParam String lastName){
        try {
            return employeeService.get(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            return "Ошибка пользователь не найден!";
        }
    }
}

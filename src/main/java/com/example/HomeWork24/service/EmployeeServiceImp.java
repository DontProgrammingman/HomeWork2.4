package com.example.HomeWork24.service;

import com.example.HomeWork24.Exception.EmployeeAlreadyAddedException;
import com.example.HomeWork24.Exception.EmployeeNotFoundException;
import com.example.HomeWork24.Interface.EmployeeService;
import com.example.HomeWork24.JavaClass.Employee;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImp implements EmployeeService {

    @Override
    public Object add(String firstname, String lastName) throws EmployeeAlreadyAddedException {
        Employee employee = new Employee(firstname, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(employee)) {
                throw new EmployeeAlreadyAddedException("Пользователь уже есть");
            }
        }
        return employees.add(employee);
    }

    @Override
    public Object remove(String firstname, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstname, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(employee)) {
                return employees.remove(i);
            }
        }
        throw new EmployeeNotFoundException("пользователь не найден");
    }

    @Override
    public Employee get(String firstname, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstname, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(employee)) {
                return employees.get(i);
            }
        }
        throw new EmployeeNotFoundException("Пользователя нет");
    }
}

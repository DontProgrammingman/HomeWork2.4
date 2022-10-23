package com.example.HomeWork24.Interface;

import com.example.HomeWork24.JavaClass.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public Object add(String firstname, String lastName);

    public Object remove(String firstname, String lastName);

    public Employee get(String firstname, String lastName);
}

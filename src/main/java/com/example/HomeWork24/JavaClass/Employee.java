package com.example.HomeWork24.JavaClass;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Employee employee) {
        return this.lastName.equals(employee.lastName) && this.firstName.equals(employee.firstName);
    }
}


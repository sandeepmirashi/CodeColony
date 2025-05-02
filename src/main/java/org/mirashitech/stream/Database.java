package org.mirashitech.stream;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(751, "Roshan", "IT", 600000));
        employees.add(new Employee(345, "Ram", "Operations", 900000));
        employees.add(new Employee(121, "Shyam", "HR", 500000));
        employees.add(new Employee(131, "Laxman", "Finance", 400000));
        employees.add(new Employee(122, "Bhima", "Admin", 700000));
        employees.add(new Employee(111, "Sharukh", "IT", 1200000));
        return employees;
    }
}

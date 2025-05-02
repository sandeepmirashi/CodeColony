package org.mirashitech.stream;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public List<Employee> evaluateTaxableEmps(String input){
        return input.equalsIgnoreCase("taxable") ?
         Database.getEmployees().stream()
                        .filter(employee -> employee.getSalary() > 500000)
                .collect(Collectors.toList()):
                Database.getEmployees().stream()
                        .filter(employee -> employee.getSalary() <= 500000)
                        .collect(Collectors.toList());

    }
}

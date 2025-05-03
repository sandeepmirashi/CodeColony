package org.mirashitech.startups;

import org.mirashitech.stream.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        //Traditional method
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
                return o1.getValue() - o2.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

//        Comparator<Map.Entry<String, Integer>>  comparator = (o1, o2) ->o1.getKey().compareTo(o2.getKey());
//        Collections.sort(entries, comparator); //(o1, o2) -> o1.getKey().compareTo(o2.getKey())
//        entries.stream().forEach(System.out::println);
        System.out.println("*********************");
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).forEach(System.out::println);
        System.out.println("*********************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //No Custom object in Map
        System.out.println("*********************Map with Object sorting *********************");
//        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary()- o2.getSalary());
//            }
//        });
        Map<Employee, Integer> employeeMap = new TreeMap<>( (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

        employeeMap.put(new Employee(751, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(345, "Ram", "Operations", 900000), 90);
        employeeMap.put(new Employee(121, "Shyam", "HR", 500000), 50);
        employeeMap.put(new Employee(131, "Laxman", "Finance", 400000), 84);
        employeeMap.put(new Employee(122, "Bhima", "Admin", 700000), 45);
        employeeMap.put(new Employee(111, "Sharukh", "IT", 1200000), 65);

        System.out.println(employeeMap);
        System.out.println("----------------------------------------------------------------------");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println); //.reversed()
    }
}

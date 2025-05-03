package org.mirashitech.startups;

import org.mirashitech.stream.Database;
import org.mirashitech.stream.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void showmessage(){
        System.out.println("Just like that");
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(118);
        list.add(3);
        list.add(818);
        list.add(233);

        //traditional
        Collections.sort(list); //asc
        Collections.reverse(list); //dsc
        System.out.println(list);

        //java 8
        list.stream().sorted().forEach(s -> System.out.println(s));
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        List<Employee> employees = Database.getEmployees();

        //traditional
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });


//        Comparator<Employee> comparator = (o1, o2) -> (int) (o1.getSalary()-o2.getSalary());
        Collections.sort(employees, ((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())));
        System.out.println(employees);

//        employees.stream().sorted(((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);
        //method reference
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);



        //        Runnable runnable = SortListDemo::showmessage;
//        runnable.run();
    }
        //not needed inline used
      static class MyComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    }
}

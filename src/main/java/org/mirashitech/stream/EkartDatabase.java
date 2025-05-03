package org.mirashitech.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "Asif", "asig@gamify.com", Arrays.asList("1213132" , "46789797")),
                new Customer(102, "vikas", "vikas@gmail.com", Arrays.asList("1132132" , "79132103")),
                new Customer(103, "ronny", "ronny@yahoo.com", Arrays.asList("7894131" , "21246545")),
                new Customer(104, "john", "john@gmail.com", Arrays.asList("7412132" , "79876456"))
        ).collect(Collectors.toList());
    }
}

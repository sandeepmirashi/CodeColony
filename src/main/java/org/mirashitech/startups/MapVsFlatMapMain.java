package org.mirashitech.startups;

import org.mirashitech.stream.Customer;
import org.mirashitech.stream.EkartDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<Customer> customers = EkartDatabase.getAll();
        List<String> emaillist = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emaillist);

        //map has the list of phones (which is stream of stream) one to one mapping
        List<List<String>> phonenos = customers.stream().map(customer -> customer.getPhonenos()).collect(Collectors.toList());
        System.out.println(phonenos);

//        Object[] array = customers.stream().map(customer -> customer.getPhonenos().stream().map(phoneno -> phoneno.toString())
//                .collect(Collectors.toList())
//        ).collect(Collectors.toList()).toArray();
//
//        System.out.println(Arrays.deepToString(array));

        //one to many

        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhonenos().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

    }
}

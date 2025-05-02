package org.mirashitech.startups;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());

        Supplier<String> supplier = () -> "Icecream";
        System.out.println(supplier.get());


        List<String> shoplist = Arrays.asList("Mango", "Chocolate", "PaperBoat");
        //pp request
        System.out.println(shoplist.stream().findAny().orElseGet(supplier)); //will pring mango

        //sons request
        List<String> bazaarlist = Arrays.asList();
        System.out.println(bazaarlist.stream().findAny().orElseGet(()->"IceCream")); //will Icecream

    }
}

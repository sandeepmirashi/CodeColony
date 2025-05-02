package org.mirashitech.startups;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        //Predicate Example
//        Predicate<Integer> predicate = new PredicateDemo();
//        System.out.println(predicate.test(7));


        Predicate<Integer> predicate = t -> t%2==0;

//        {
//            if (t%2==0)
//                return true;
//            else
//                return  false;
//        };
//        System.out.println(predicate.test(1281));

        //Using filter and passing the predicate which evaluates the even
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(predicate).forEach(t-> System.out.println("Printing evens : " + t));

        list.stream().filter(predicate.negate()).forEach(t-> System.out.println("Printing odds : " + t));
    }
}

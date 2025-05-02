package org.mirashitech.startups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        //traditional
        for (String s : list)
            System.out.println(s);

        System.out.println("==============For Each using Stream");
        list.stream().forEach(t-> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((k,v)-> System.out.println(k + ":" + v));

        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        Consumer<String> consumer = (s) ->{
            s = s + ": adding tag , just for fun ";
            System.out.println(s);
        };
//        consumer.accept("Mirashi ");
//        for(String s : list){
//         consumer.accept(s);
//        }

        //filter example - tradition method .. example just get weekend
        for(String s: list){
            if(s.startsWith("S")){
                System.out.println(s);
            }
        }
//        Predicate<String> predicate = (s) -> true; just a dummy line testing something
        list.stream().filter((s)-> s.startsWith("S")).forEach(t-> System.out.println(t));

        map.entrySet().stream().filter(k-> k.getKey()%2==0).forEach(obj -> System.out.println(obj));
//        map.entrySet().stream().filter(Predicate.not(k-> k.getKey()%2==0)).forEach(obj -> System.out.println(obj));
    }
}

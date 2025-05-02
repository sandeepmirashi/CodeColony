package org.mirashitech.pre.function.demo;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Printing : " + t);
    }
}

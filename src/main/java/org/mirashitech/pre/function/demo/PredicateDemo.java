package org.mirashitech.pre.function.demo;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        if (t%2==0)
            return true;
        else
            return  false;
    }

}

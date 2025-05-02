package org.mirashitech.pre.function.demo;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Icecream";
    }
}

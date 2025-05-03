package org.mirashitech.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phonenos;
}

package com.poc.ibmmq.demo.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private UUID uuid;
    private String firstName;
}

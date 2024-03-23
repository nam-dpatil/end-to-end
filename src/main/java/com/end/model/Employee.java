package com.end.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Employee {
    private int id;
    private String name;
    private String permantAddress;
    private String currentAddress;
    private long phoneNumber;
}

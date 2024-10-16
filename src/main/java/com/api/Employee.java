package com.api;

public class Employee {
    private long id;

    private String name;
    private int sal;

    public Employee() {
    }

    //Setter
    public Employee(long id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;


    }

    public long getId() {
        return id;
    }

    public int getSal() {

        return sal;
    }

    public String getName() {
        return name;
    }

}

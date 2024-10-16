package com.api;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Z {
    public static void main(String[] args) {
        Employee e=new Employee();
        List<Employee> data= Arrays.asList(
        new Employee(1,"mike",5000),
        new Employee(2,"stallin",4000),
        new Employee(3,"adam",5000)
       );
//List<Employee>newData= data.stream().filter(e->e.getSal()>4000).collect(Collectors.toList());
       // List<Employee>newData= data.stream().filter(e->e.getName().startsWith("m")).collect(Collectors.toList());
       // for(Employee emp:newData){
          //  System.out.println(emp.getId());
          //  System.out.println(emp.getName());
        //    System.out.println(emp.getSal());
      // Map<Integer,List<Employee>> newData= data.stream().collect(Collectors.groupingBy(e->e.getSal()));
       // System.out.println(newData);
        data.stream().map(Employee::getSal).collect(Collectors.toList());

        }
    }


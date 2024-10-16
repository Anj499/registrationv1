package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
      List<Integer> data= Arrays.asList(100,10,35,2,15,500,700);
     List<Integer>newData= data.stream().filter(x->x>100).collect(Collectors.toList());
        System.out.println(newData);
    }
}

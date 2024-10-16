package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("mike","stallin","adam","mike","stallin");
        //List<Integer>newData=data.stream().map(x->x.length()).collect(Collectors.toList());
        //List<String>newData=data.stream().sorted().collect(Collectors.toList());
       // List<String>newData=data.stream().distinct().collect(Collectors.toList());
        List<String>newData=data.stream().filter(s->s.length()>4).collect(Collectors.toList());
        System.out.println(newData);
    }
}

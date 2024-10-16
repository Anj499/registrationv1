package com.api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P{
    public static void main(String[]args){
       // List<Integer>data= Arrays.asList(10,20,35,12,14);
       List<String>data= Arrays.asList("mike","stallin","adam","mike","stallin");
      //  List<String>newData=data.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        //List<Integer>newData=data.stream().map(x->x.length()).collect(Collectors.toList());
        //List<String>newData=data.stream().distinct().collect(Collectors.toList());
        List<String>newData=data.stream().filter(s->s.length()>4).collect(Collectors.toList());
      //  List<String>newData=data.stream().sorted().collect(Collectors.toList());
       // List<Integer>newData=data.stream().map(x->x*x).collect(Collectors.toList());
       // List<Integer>newData=data.stream().map(x->x+5).collect(Collectors.toList());
        System.out.println(newData);
    }


}
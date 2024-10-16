package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class W {
    public static void main(String[] args) {
        //Consumer Function interface
        //It takes one input & produces no output
       /// Consumer<String> x=s->System.out.println(s);
        ///x.accept("mike");
        List<String> names= Arrays.asList("Alice","Bob","Charlie");
        Consumer<String>val=s->System.out.println(s);
        names.forEach(val);
       // for(String n:names){
            //System.out.println(n);
        }
    }





package com.api;

import java.util.Arrays;
import  java.util.Map;
import java.util.List;

public class E {
    public static void main(String[] args) {

        List<Integer>data= Arrays.asList(10,20,13,15);
        int result=data.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);


    }
}

package com.api;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class D {

    public static void main(String[] args) {
        List<String>data=Arrays.asList("mike","adam","madam","bike","me");
        List<String>newData=data.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
        System.out.println(newData);
    }
}

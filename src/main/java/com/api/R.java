package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class R {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(3,5,7,2,8,10);
        //Optional<Integer> max=numbers.stream().max(Integer::compareTo);
        Optional<Integer> min=numbers.stream().min(Integer::compareTo);
        System.out.println(min.get());




    }
}

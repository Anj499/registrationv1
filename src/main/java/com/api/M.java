package com.api;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class M {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(10,11,13,14,16,19);
        List<Integer>newData=data.stream().filter(t ->t%2!=0).collect(Collectors.toList());
        System.out.println(newData);

    }
}

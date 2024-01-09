package com.myblog.myblog1;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Function;
public class TestClass1 {
    public static void main(String[] args) {

        //Examples of predicate

        //List<Integer> numbers = Arrays.asList(10, 20, 15, 45, 46, 16);
        //Predicate<Integer> val = Y->Y%2==0;
        //boolean result = val.test(10);
        //System.out.println(result);

        //Examples of predicate

        //Predicate<String> val = str->str.equals("mike");
        //boolean result = val.test("stallin");
        //System.out.println(result);

        // Filtering the Even numbers

        //List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20, 22);
        //List<Integer> evennumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //System.out.println(evennumbers);


        // Filtering the Odd numbers in list

        //List<Integer> numbers = Arrays.asList(10, 12, 1, 5, 16, 19, 20, 22);
        //List<Integer> oddnumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        //System.out.println(oddnumbers);


        // Filtering the name on the list

        //List<String> numbers = Arrays.asList("mike", "adam", "mike", "stallin");
        //List<String> data1 = numbers.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        //List<String> data2 = numbers.stream().filter(s -> s.equals("mike")).collect(Collectors.toList());
        //List<String> data3 = numbers.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());

        //System.out.println(data1);
        //System.out.println(data2);
        //System.out.println(data3);

        // Funtion FunctionalInterface

       // Function<String,Integer> result = str->str.length();
       // Integer val = result.apply("mike");
       // System.out.println(val);

        Function<Integer,Integer> result = i->i+10;
        Integer val = result.apply(30);
        System.out.println(val);


    }
}

package com.myblog.myblog1;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


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

        //Function<Integer,Integer> result = i->i+10;
        //Integer val = result.apply(30);
        //System.out.println(val);

        //List<Integer> data = Arrays.asList(10, 20, 30, 41);
        //List<Integer> newNumbers = data.stream().map(i -> i + 10).collect(Collectors.toList());
        //System.out.println(newNumbers);

        //Convert a name into UpperCase Letter

        //List<String> data = Arrays.asList("mike", "stallin", "adam");
        //List<String> newData = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        //System.out.println(newData);

        //Sorting the data

        //List<String> data = Arrays.asList("mike", "stallin", "adam");
        //List<String> newData = data.stream().sorted().collect(Collectors.toList());
        //System.out.println(newData);

        // Sorting the IntergerData

        //List<Integer> data = Arrays.asList(15, 4, 45, 78, 36);
        //List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
        //System.out.println(newData);

        // Sorting the and Removing the Depulicate  values

        //List<Integer> data = Arrays.asList(15, 3, 60, 100, 45, 3, 60, 78);
        //List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
        //System.out.println(newData);


        // Consumer FunctionalInterface it takes input but produces no output.

        //Consumer<Integer> result = number-> System.out.println(number);
        //result.accept(100);

        // Consumer(forEach) example

        //List<String> names = Arrays.asList("mike", "adam", "sam");
        //Consumer<String> val = name-> System.out.println(name);
        //names.forEach(val);

//        List<Employee> emplyees = Arrays.asList(
//                new Employee("mike", 30, "chennai"),
//                new Employee("stallin", 25, "chennai"),
//                new Employee("adam", 31, "pune"),
//                new Employee("sam", 32, "bengaluru")
//
//
//        );
//
//        List<Employee> emps = emplyees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//
//        for (Employee e:emps){
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getCity());
//        }



        //To filter out even numbers, square each of them, and find the sum of the squared

//        List<Integer> numbers = Arrays.asList(10,12,6,5,7,8,9);
//        List<Integer> data = numbers.stream().filter(n1->n1%2==0).map(n2->n2*n2).collect(Collectors.toList());
//        System.out.println(data);


        List<Employee> emplyees = Arrays.asList(
                new Employee("mike", 30, "chennai"),
                new Employee("stallin", 25, "chennai"),
                new Employee("adam", 30, "pune"),
                new Employee("sam", 32, "bengaluru")


        );

        Map<Integer, List<Employee>> collect = emplyees.stream().collect(Collectors.groupingBy(e -> e.getAge()));

        //System.out.println(collect);
        for(Map.Entry<Integer, List<Employee>> entry: collect.entrySet()){
            int age = entry.getKey();
            List<Employee> employeesWithAge = entry.getValue();
            System.out.println("age:"+age+"---");

            for (Employee e: employeesWithAge){
                System.out.println(e.getName());
                System.out.println(e.getAge());
                System.out.println(e.getCity());
            }

        }




    }
}

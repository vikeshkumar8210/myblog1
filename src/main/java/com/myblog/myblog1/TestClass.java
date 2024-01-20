package com.myblog.myblog1;

import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        int val = testClass.test();
//        System.out.println(val);
//    }
//    public int test(){
//        int otp = SampleTest.test1();
//
//        return otp;
        //Degugging in loop;
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//        }

        //Debugging in list;
//        List<Integer> data = Arrays.asList(10, 20, 45, 78, 45, 12, 78, 20, 30, 10);
//        List<Integer> val = data.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(val);
        
        //Debugging in list with distinc/ unique value
        List<Integer> data = Arrays.asList(10, 20, 45, 78, 45, 12, 78, 20, 30, 10);
        List<Integer> val = data.stream().distinct().collect(Collectors.toList());
        System.out.println(val);
    }
}

//How do put a break point
//how to run the application and debugg the code
//how to understand the code line by line program(step over(F8)) and every line how the values are getting by evaluate the code


//Step over(F8):- Execute the current line and move to the next line in the current method.
//Step into(F7):- move into the method call on the current line.
//Step Out(Shift+F8):- Finish the current method and return to the calling method.
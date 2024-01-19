package com.myblog.myblog1;

import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;

public class TestClass {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        int val = testClass.test();
        System.out.println(val);
    }
    public int test(){
        int otp = SampleTest.test1();

        return otp;
    }
}

//How do put a break point
//how to run the application and debugg the code
//how to understand the code line by line program(step over(F8)) and every line how the values are getting by evaluate the code


//Step over(F8):- Execute the current line and move to the next line in the current method.
//Step into(F7):- move into the method call on the current line.
//Step Out(Shift+F8):- Finish the current method and return to the calling method.
package com.practicejava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



@Target(ElementType.METHOD)
@interface Test{

}
class testcase{

    @Test
    public void test_case(){
        System.out.println("this is a test case");
    }
}

public class Assignment7Q1 {
    public static void main(String[] args) {
        testcase n=new testcase();
        n.test_case();

    }
}

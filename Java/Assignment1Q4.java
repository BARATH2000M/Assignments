package com.practicejava;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        String result = "failed";
        if ((subject1Marks>=60)&&(subject2Marks>=60)&&(subject3Marks>=60)){
             result="passed";
        }
        else if (((subject1Marks>=60)&&(subject2Marks>=60)) || ((subject2Marks>=60)&&(subject3Marks>=60)) || ((subject1Marks>=60)&&(subject3Marks>=60))){
            result="passed \npromoted";
        }
        else if ((subject1Marks+subject2Marks+subject3Marks)>60){
            result="failed";
        }
        return (result);

    }
}

public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of 3 subjects");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        ResultDeclaration obj1= new ResultDeclaration();
        System.out.println(obj1.declareResults(s1,s2,s3));
    }
}

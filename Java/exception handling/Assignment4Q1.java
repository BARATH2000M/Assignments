package com.practicejava;

import java.util.Scanner;

public class Assignment4Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number1:");
        int a=sc.nextInt();
        System.out.println("enter number2");
        int b= sc.nextInt();
        int c=0;
        try{
            c=a/b;
        }

        catch (UnsupportedOperationException e){
            System.out.println("Unsupported error");

        }
        System.out.println("Output of division:");
        System.out.println(c);
        System.out.println("Program ended");


    }
}

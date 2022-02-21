package com.practicejava;

import java.util.Scanner;

public class UnsupportedOperationException extends Throwable{
    public static void main(String[] args) throws ArithmeticException, UnsupportedOperationException {
        try {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your first Number");
            int a= scan.nextInt();
            System.out.println("Enter your Second number");
            int b= scan.nextInt();
            int c=a/b;
            System.out.println(c);
        } catch ( ArithmeticException e) {
            e.printStackTrace();
            System.out.println("invalid number entered");
        }


    }
}
package com.practicejava;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int da=num;
        int sum=0;

        while(num>0){
            int indi = num%10;
           int value= indi*indi*indi;
           sum+=value;
           num=num/10;

        }
        if(da==sum) {


            System.out.println("it is amstrong");
        }
        else{
            System.out.println("it is not amstrong");
        }

    }
}

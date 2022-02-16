package com.practicejava;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double intrestRate){
        double si=(principalAmount*time*intrestRate)/100;
                return (si);
    }
    public double compoundInterest(double principalAmount,int time,double intrestRate){
        double prod =(1+(intrestRate/100));
        double pow_val= Math.pow(prod, time);
        double ci= (principalAmount*pow_val) - principalAmount;
        return (ci);
    }
}

public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int principalAmount=sc.nextInt();
        int time=sc.nextInt();
        int intrestRate=sc.nextInt();
        SiCi obj1= new SiCi();
        double simplei=obj1.simpleInterest(principalAmount, time, intrestRate);
        double compundi=obj1.compoundInterest(principalAmount,time,intrestRate);
        System.out.println(simplei);
        System.out.println(compundi);



    }
}

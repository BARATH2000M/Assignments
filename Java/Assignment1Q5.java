package com.practicejava;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double val=0;
        double inc=ctc;

        if (ctc<180001){
            val =0;

        }
        else if((ctc>181000)&&(ctc<300001)){
             val=(inc*0.1);


        }
        else if((300000<ctc)&&(ctc<500001)){
              val=(inc*0.2);


        }
        else if ((500000<ctc)&&(ctc<1000001)) {
             val=(inc*0.3);

        }
        return (val);


    }
}


public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income= sc.nextInt();
        TaxAmount obj1= new TaxAmount();
        System.out.println(obj1.calculateTaxAmount(income));
    }
}

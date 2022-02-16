package com.practicejava;

import java.util.Scanner;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int []arr=new int [max];
        int k=0;
        int numm=min;
        while(numm<=max){
            int sum=0;
            int num=numm;
            while(num>0) {
                int indi = num % 10;
                int value = indi * indi * indi;
                sum += value;
                num = num / 10;
            }

            if (sum==numm){
                arr[k]=sum;
                k+=1;
                    }
            numm+=1;



        }
        return arr;
    }

}

public class Assignment1Q2 {
    public static void main(String[] args) {
        ArmstrongNumBetweenRange obj1= new ArmstrongNumBetweenRange();
        Scanner sc =new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int []arrra =obj1.armstrongNumbersInRange(min, max);
        for(int i=0; i<arrra.length;i++){
            System.out.println(arrra[i]);
        }




    }
}

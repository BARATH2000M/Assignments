package com.practicejava;

import java.util.Scanner;

public class Assignment4Q3 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter withdrawal amount:");
        double withdrawl=sc.nextInt();
        SavingAccount user1=new SavingAccount(44, 2000);
        user1.WithdrawlProcess(withdrawl);

        System.out.println("Transaction ended");

    }


}
class SavingAccount{
    long id;
    double balence;

    SavingAccount(long id,double balence){
        this.id=id;
        this.balence=balence;

    }
    public void WithdrawlProcess(double withdrawl){
        try{
            if ((balence-withdrawl)<0){
                throw new InsufficientBalenceException();

            }
            else if(withdrawl<1){
                throw new IllegalBankTransactionException();
            }
        }
        catch (InsufficientBalenceException e){
            System.out.println("balence Not enough");

        }
        catch (IllegalBankTransactionException e){
            System.out.println("Negative withdrawal can't be processed");
        }

    }

}

class  InsufficientBalenceException extends Exception{

}
class IllegalBankTransactionException extends Exception{
}

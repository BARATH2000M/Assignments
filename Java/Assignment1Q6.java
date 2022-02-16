package com.practicejava;

import java.util.Objects;
import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        String disp;
        if ((Objects.equals(user, userId))&&(Objects.equals(pass, password))){
             disp="Welcome"+ userId ;



        }
        else{
            disp="You have entered wrong credentials ,please enter the right credentials.";
        }
        return (disp);
    }

}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int count=0;
        Login obj1 = new Login();
        String stat;
        while(count<3){
            System.out.println("enter username:");
            String user_name= sc.nextLine();
            System.out.println("enter password");
            String pass_word= sc.nextLine();
            stat=obj1.loginUser(user_name,pass_word);
            if(stat!= "You have entered wrong credentials ,please enter the right credentials."){
                System.out.println(stat);
                break;
            }
            else{
                System.out.println(stat);
                count+=1;
            }


        }
        if (count==3){
            System.out.println("Contact Admin");
        }



    }
}
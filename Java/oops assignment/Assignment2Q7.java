package com.practicejava;

import java.util.Scanner;


public class Assignment2Q7 {
    Scanner sc=new Scanner(System.in);
    String role;
    Candy candy=new Candy();
    Cookie cookies= new Cookie();
    IceCream icecream=new IceCream();
    public static void main(String[] args) {


        Assignment2Q7 obj=new Assignment2Q7();
        obj.selectRoles();

    }
    private void selectRoles(){
        System.out.println("Enter your role (owner/customer):");

        role=sc.nextLine();
        roles(role);
    }
    private void roles(String role){
        if (role.toLowerCase().equals("owner")){
            addItems();
        }
        else if (role.toLowerCase().equals("customer")){
            placeOrder();
        }
    }
    private void addItems() {
        System.out.println("choose the item to be added:\n1.CANDY\n2.COOCKIE\n3.ICE CREAM\nEnter your choice:");
        int choice=sc.nextInt();
        addItemsOperation(choice);
    }
    private void addItemsOperation(int choice) {
        System.out.println("how much to add:");
        int quantity= sc.nextInt();
        switch (choice){
            case 1:


                candy.addCandies(quantity);
                break;
            case 2:


                cookies.addCookies(quantity);
                break;
            case 3:


                icecream.addIceCreams(quantity);
                break;
        }
        System.out.println("total stock of "+choice+": "+quantity);

    }
    private void placeOrder() {
        System.out.println("choose the item to placeorder:\n1.CANDY\n2.COOCKIE\n3.ICE CREAM\nEnter your choice:");
        int choice=sc.nextInt();
        placeOrderOperation(choice);

    }
    private void placeOrderOperation(int choice) {
        System.out.println("how much:");
        int quantity= sc.nextInt();
        int i = 0;

        switch (choice){
            case 1:

                i = candy.getCost() * quantity;
                break;

            case 2:

                i = cookies.getCost()*quantity;
                break;
            case 3:
                i=icecream.getCost()*quantity;

        }
        System.out.println("the total price:Rs."+i);


    }
}

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    Scanner sc=new Scanner(System.in);
    int totalcandies=0;
    int DollarToRupee=60;
    public int addCandies(int candies){
        totalcandies+=candies;
        return totalcandies;

    }

    @Override
    public int getCost() {

        return DollarToRupee;
    }
}
class Cookie extends DesertItem {
    Scanner sc=new Scanner(System.in);

    int totalcandies=0;
    int EuroToRupee=70;
    public int addCookies(int candies){

        totalcandies+=candies;
        return totalcandies;
    }

    @Override
    public int getCost() {

        return EuroToRupee;
    }
}
class IceCream extends DesertItem {
    Scanner sc=new Scanner(System.in);
    int totalcandies=0;
    public int addIceCreams(int candies){
        totalcandies+=candies;
        return totalcandies;

    }

    @Override
    public int getCost() {

        return 1;
    }
}
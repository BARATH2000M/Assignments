package com.practicejava;

import java.util.Scanner;

public class Java11Assignment5 {
    public static void main(String[] args) {
        Selectyour obj = new Selectyour();
    }
}


    class Selectyour {
        private Integer InsertnewPrice;
        private Integer ViewPurchaseTotal;
        private String Exit;

        public Integer getInsertnewPrice() {
            return InsertnewPrice;
        }

        public void setInsertnewPrice(Integer insertnewPrice) {
            System.out.println("Added price is " + insertnewPrice);
            InsertnewPrice = insertnewPrice;
        }

        public Integer getViewPurchaseTotal() {
            return ViewPurchaseTotal;
        }

        public void setViewPurchaseTotal(Integer viewPurchaseTotal) {
            ViewPurchaseTotal = viewPurchaseTotal;
        }

        public void SelectyourOption() {
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("insert price");


                    break;
                case 2:
                    System.out.println("your purchase total");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
            }

        }
    }



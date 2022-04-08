package com.practicejava;

import java.util.ArrayList;
import java.util.Arrays;


class orders {
    private int totalPrice;
    private String status;

    public orders(int totalPrice, String status) {
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "orders{" +
                "totalPrice=" + totalPrice +
                ", status='" + status  +
                "'}";
    }
}
public class Assignment8Q2 {

    public static void main(String[] args) {
        ArrayList<orders> Orders1 = new ArrayList<>(Arrays.asList(
                new orders(105000, "COMPLETED"),
                new orders(850000, "COMPLETED"),
                new orders(4000, "ACCEPTED"),
                new orders(20000, "ACCEPTED"),
                new orders(410000, "NOT ACCEPTED")));
        String k = "ACCEPTED";
        String h = "COMPLETED";
        pc(Orders1,j ->((j.getTotalPrice()) > 10000) && ((j.getStatus()).equals(k) || (j.getStatus()).equals(h)));
    }

    public static void pc(ArrayList<orders> orders, Assignment8Q2.Condition condition1) {
        for ( orders j : orders){
            if(condition1.test(j)){
                System.out.println(j);
            }
        }
    }

    interface Condition {
        boolean test(orders j);
    }
}
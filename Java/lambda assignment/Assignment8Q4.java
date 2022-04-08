package com.practicejava;

import java.util.ArrayList;
import java.util.Arrays;



public class  Assignment8Q4{
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<> (Arrays.asList("Paddy OFurniture","laya", "Olive Yew", "Aida Bugg", "Maureen Biologist"));
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        System.out.println(employeeList);
    }
}
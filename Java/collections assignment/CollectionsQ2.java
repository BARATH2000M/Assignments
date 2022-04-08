package com.practicejava;


import java.util.ArrayList;
        import java.util.HashSet;

public class CollectionsQ2 {
    public static void main(String[]arg){
        HashSet hs = new HashSet();
        for(int i=1;i<=10;i++){
            int k =1;
            k = i * 2;

            hs.add(k);
        }
        hs.add(1*2);
        System.out.println(hs);
    }
}
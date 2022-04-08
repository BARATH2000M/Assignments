package com.practicejava;


import java.util.Map;
        import java.util.Scanner;
        import java.util.Set;
        import java.util.TreeMap;

public class CollectionsQ1 {
    public static void main(String[]arg){
        TreeMap<Long,Contact> tm = new TreeMap<Long,Contact>();

        Contact c1 = new Contact();
        Contact c2 = new Contact();
        Contact c3 = new Contact();
        Contact c4 = new Contact();




        tm.put(c1.phno,c1);
        tm.put(c2.phno,c2);
        tm.put(c3.phno,c3);
        tm.put(c4.phno,c4);
        Set s = tm.keySet();
        Set <Map.Entry<Long,Contact>>em = tm.entrySet();

        for(Map.Entry<Long,Contact> entry : em){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(tm);

    }
}
class Contact{
    public long phno;
    public String name;
    public String email;

    public String toString(){
        return this.name;
    }
    enum Gender {
        male, female;

    }
    Gender gender ;


    Contact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phn no");
        String phn = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter the email id: ");
        String mail = sc.nextLine();
        System.out.println("Enter the gender: ");
        String g = sc.nextLine();
        if(g == "male")
        {
            this.gender= Gender.male;
        }
        else{
            this.gender=Gender.female;
        }
        this.phno = Long.parseLong(phn);
        this.name = name;
        this.email = mail;
    }
}
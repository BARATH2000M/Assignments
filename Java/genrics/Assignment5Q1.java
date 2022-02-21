package com.practicejava;





import java.util.HashSet;
        import java.util.Scanner;
        class Employee1 {
    public static int id;
    public static String name;
    public static int salary;
    public static String dept;

    Employee1(int id, String name, int sal, String dept) {
        this.id = id;
        this.name = name;
        this.salary = sal;
        this.dept = dept;
    }




    HashSet hs = new HashSet();



    public void display () {
        hs.add(id);
        hs.add(name);
        hs.add(salary);
        hs.add(dept);
        System.out.println(hs);
    }


}

class Assignment5Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the details of the employee");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int sal = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();



        Employee1 e1 = new Employee1(id,name,sal,dept);

        HashSet hs = new HashSet();

        e1.display();
    }
}
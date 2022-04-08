package com.practicejava;


import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.TreeMap;
        import java.util.TreeSet;

public class CollectionsQ3 {
    public static void main(String[]arg){
        TreeMap<Integer,Employee> tm = new TreeMap();

        ArrayList<Employee> al = new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(new Employee());
        }
        TreeSet ts = new TreeSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice =sc.nextInt();
        if(choice == 1){
            for (int i = 0; i <10 ; i++) {
                int id = al.get(i).id;
                ts.add(id);
            }
        }
        else if(choice == 2){
            for(int i=0;i<10;i++){
                String name = al.get(i).name;
                ts.add(name);
            }
        }
        else if(choice == 3){
            for(int i=0;i<10;i++) {
                int dept = al.get(i).dept;

                ts.add(dept);
            }
        }
        else if (choice == 4){
            for(int i=0;i<10;i++) {
                int salary = al.get(i).salary;
                ts.add(salary);
            }
        }
        System.out.println(ts);
    }
}
class Employee{
    public int id;
    public String name;
    public int dept;
    public int salary;
    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employer id: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employer name: ");
        this.name=sc.nextLine();
        System.out.println("Enter the dept");
        this.dept=sc.nextInt();
        System.out.println("Enter the salary: ");
        this.salary = sc.nextInt();
    }

}
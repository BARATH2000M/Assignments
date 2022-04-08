package com.practicejava;


public class Assignment2Q4 {
    public static void main(String[] args) {
        p3 point3 = new p3();
        point3.absMethod();
        point3.nonAbsMethod();
        //abstract class cannot be instantiated
        // p1 objjj=new p1();


    }
}

abstract class p1 {
    //point4- making abstract class private will give you error
    //this is  abstract class as one of its method is abstract
    abstract void absMethod();

    void nonAbsMethod() {
        System.out.println("point 1-this is a non abstract method of abstract class");
    }
}

class p3 extends p1 {

    @Override
    void absMethod() {
        System.out.println("point 3-the abstract method of p1 is override and implemented in the sub clas p3, so this p3 class is not a abstract class");
    }
}

abstract class p6 {
    public void displ() {
        System.out.println("point 6-this is a abstract class without abstract methods ");
    }

    class p61 extends p6 {
        //empty class inherited from p6 abstract class

    }
}


//abstract class cannot be finall to run the code without error i made it as comment, you can remmove commentor symbol and check the error
//final abstract class p5{}


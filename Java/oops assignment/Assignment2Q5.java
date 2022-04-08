package com.practicejava;


public class Assignment2Q5 {
    public static void main(String[] args) {
        Rectangle5 rec=new Rectangle5();
        Line5 Li=new Line5();
        Cube5 cu=new Cube5();
        System.out.println(rec.draw());
        System.out.println(Li.draw());
        System.out.println(cu.draw());

    }
}
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return("this is rectangle:[]");
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return ("this line:____________");
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {

        return ("this is cube:[[ ]");
    }
}
abstract class Shape5 {
    abstract public String draw();
}
package com.practicejava;

public class stringassignment {
    public static void main(String[] args) {
        stringassignment ob= new stringassignment();
        ob.stringfuntion();
        ob.stringbufferfunction();
        ob.string_builderfunc();

    }

    public void stringfuntion(){
        String st = "Hello World";
        System.out.println("1. String length:"+st.length());
        String sis="Hello,", sa="How are you?";
        System.out.println("2. join two string:"+sis.concat(sa));
        String sente="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("qn3(a):"+sente.toLowerCase());
        System.out.println("qn3(b):"+sente.toUpperCase());
        System.out.println("qn3(c) replace a with $:"+sente.replace("a","$"));
        System.out.println("qn3(d) contains collection:"+sente.contains("collection"));
        String newsente = "java string pool refers to collection of strings which are stored in heap memory";
        System.out.println("qn3(e) same are not:"+sente.equalsIgnoreCase(newsente));

    }

    public void stringbufferfunction(){
        StringBuffer buf=new StringBuffer();
        System.out.println("string buffer:"+buf);
        buf.append("StringBuffer");
        System.out.println("string buffer:"+buf);
        buf.append("is a peer class of String");
        System.out.println("string buffer:"+buf);
        buf.append("that provides much of");
        System.out.println("string buffer:"+buf);
        buf.append("the functionality of strings");
        System.out.println("string buffer:"+buf);
        StringBuffer buff=new StringBuffer("It is used to _ at the specified index position");


        buff.insert(15, "insert text");
        System.out.println("string buffer 2nd qn:"+buff);
        StringBuffer buffreve=new StringBuffer("This method returns the reversed object on which it was called");
        buffreve.reverse();
        System.out.println(buffreve);


    }

    public void string_builderfunc(){
        StringBuilder buf1=new StringBuilder();
        StringBuilder buff1=new StringBuilder("It is used to _ at the specified index position");
        StringBuilder buffreve1=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("string builder:"+buf1);
        buf1.append("StringBuilder");
        System.out.println("string builder:"+buf1);
        buf1.append("is a peer class of String");
        System.out.println("string builder:"+buf1);
        buf1.append("that provides much of");
        System.out.println("string builder:"+buf1);
        buf1.append("the functionality of strings");
        System.out.println("string builder:"+buf1);
        buff1.insert(15, "insert text");
        System.out.println("string builder 2nd qn:"+buff1);
        buffreve1.reverse();
        System.out.println(buffreve1);
    }
}

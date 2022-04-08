package com.practicejava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;
        import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})

@interface Info{
    int AuthorID();
    String Author() default "Sourav";
    String Supervisor() default "Kuila";
    String Date();
    String Time();
    int version();
    String description() default "Displaying Method";
}

class Devloper{
    int AuthorID;
    String Author ;
    String Supervisor ;
    String Date;
    String Time;
    float Version;
    String Description;
    public Devloper(int AuthorID, String Date, String Time, float Version) {
        this.AuthorID = AuthorID;
        this.Date = Date;
        this.Time = Time;
        this.Version = Version;
    }
    String dev() {
        return  "HI";
    }
}
public class Assignment7Q2 {
    public static void main(String[] args)throws Exception{
        Devloper devloper = new Devloper(1,"01-12-2021","6.40",20);
        Method m=devloper.getClass().getMethod("displayMethod");

        Info d1 = m.getAnnotation(Info.class);
        System.out.println("Author ID is: "+d1.AuthorID());
        System.out.println("Author Name is: "+d1.Author());
        System.out.println("Supervisor is: "+d1.Supervisor());
    }

}
package com.hughwang.shade;

import com.hughwang.shade.pojos.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student = new Student();
        student.setId(1024);
        student.setName("hugh two");
        System.out.println( "Hello World!" + student.toString());
    }
}

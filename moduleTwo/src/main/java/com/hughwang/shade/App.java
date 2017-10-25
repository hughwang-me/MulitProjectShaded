package com.hughwang.shade;

import com.hughwang.shade.pojos.Student;
import com.hughwang.shade.utils.L;

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
        L.e("Hello World!" + student.toString());
    }
}

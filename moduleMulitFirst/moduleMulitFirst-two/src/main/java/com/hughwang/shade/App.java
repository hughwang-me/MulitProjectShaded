package com.hughwang.shade;

import com.hughwang.shade.utils.L;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        L.info("moduleMulitFirst-two App Start !!!");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"contextConfiguration.xml"}
        );
        applicationContext.start();
        L.info("dubbo-redis-service Application Started !!!");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        L.info("dubbo-redis-service Application Over !!!");
    }
}

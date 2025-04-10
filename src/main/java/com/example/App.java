package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       Dev obj =context.getBean(Dev.class);
    //    Dev obj =(Dev) context.getBean("dev1");//by id 
       obj.build();
      
    }
}

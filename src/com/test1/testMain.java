package com.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    public static void main(String[] args){
        ApplicationContext acx=new ClassPathXmlApplicationContext("Bean.xml");
        IntroduceDemo id=acx.getBean("IntroducDemo",IntroduceDemo.class);
        System.out.println("Name:"+id.getName());
        System.out.println("Age:"+id.getAge());
        id.intrduce();
    }
}

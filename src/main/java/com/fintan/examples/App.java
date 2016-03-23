package com.fintan.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "foo.xml"});
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");
        System.out.println(helloWorld);
    }
}

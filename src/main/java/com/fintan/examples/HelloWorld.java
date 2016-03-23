package com.fintan.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloWorldBean")
public class HelloWorld {


    @Autowired
    private Foo foo;

    @Autowired
    private Bar bar;

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public String toString(){
        return " HelloWorld! \n " + foo + "\n and " + bar;
    }
}
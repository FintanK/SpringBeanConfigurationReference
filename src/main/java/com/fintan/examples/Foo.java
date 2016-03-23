package com.fintan.examples;

import org.springframework.stereotype.Service;

@Service("fooBean")
public class Foo {

    public Foo(){
    }

    public String toString(){
        return "I am foo " ;
    }
}
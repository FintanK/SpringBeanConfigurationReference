package com.fintan.examples;

import org.springframework.stereotype.Service;

@Service("barBean")
public class Bar {

    public Bar(){
    }

    public String toString(){
        return "I am bar " ;
    }
}
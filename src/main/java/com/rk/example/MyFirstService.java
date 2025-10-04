package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    @Autowired
    //field injection
    @Qualifier("mySecondBean")
    private MyFirstClass myFirstClass;

    public String tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }
}

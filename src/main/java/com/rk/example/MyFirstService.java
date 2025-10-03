package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    //Injecting Bean
    private final MyFirstClass myFirstClass;


    public MyFirstService(     MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }
}

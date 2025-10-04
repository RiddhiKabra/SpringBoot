package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private  MyFirstClass  myFirstClass;
    //method injection

    @Autowired
    public void setMyFirstClass(
            @Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    public String tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }
}

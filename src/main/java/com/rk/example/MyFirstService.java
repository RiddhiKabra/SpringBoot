package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    //field injection
    @Autowired
    @Qualifier("mySecondBean")
    private MyFirstClass myFirstClass;
    private Environment environment;


    public String  tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }
    public String getJavaEnv(){
        return  environment.getProperty("java.version");
    }
    public String getOsName(){
        return  environment.getProperty("os.name");
    }



    //Environment bean
    @Autowired
    public void setEnvironment (Environment environment){
        this.environment = environment;
    }

}

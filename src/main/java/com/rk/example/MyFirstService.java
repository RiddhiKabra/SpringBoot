package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//adding another custom properties instead od application.properties this annotation will help our application to access our custom properties
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    //field injection
    @Autowired
    @Qualifier("mySecondBean")
    private final MyFirstClass myFirstClass;
    @Value("RK")
    private String customProperty;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;
    @Value("123")
    private  Integer customPropertyInt;

    public MyFirstService(
            @Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String  tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }


    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }
}

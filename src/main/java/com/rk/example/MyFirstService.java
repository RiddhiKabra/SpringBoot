package com.rk.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//admding ultiple custom properties instead od application.properties this annotation will help our application to access our custom properties
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties"),
})
public class MyFirstService {
    //field injection
    @Autowired
    @Qualifier("bean1")
    private final MyFirstClass myFirstClass;
    @Value("${my.custom.property}")
    private String customProperty;
    @Value("${my.custom.property.int}")
    private Integer customPropertyInt;


    public MyFirstService(
            @Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String  tellStory(){
        return  "The dependency is saying: " + myFirstClass.sayHello();
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }


    public String getCustomProperty() {
        return customProperty;
    }
}

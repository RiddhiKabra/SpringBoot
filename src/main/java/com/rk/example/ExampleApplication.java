package com.rk.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

        var app = new SpringApplication(ExampleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "test"));
        var ctx = app.run(args);
//        MyFirstClass myFirstClass = new MyFirstClass();
        MyFirstClass myFirstClass = ctx.getBean("myFirstBean",MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellStory());
        System.out.println(myFirstService.getCustomPropertyInt());
        System.out.println(myFirstService.getCustomProperty());

    }
}

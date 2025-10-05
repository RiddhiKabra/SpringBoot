package com.rk.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);
//        MyFirstClass myFirstClass = new MyFirstClass();
        MyFirstClass myFirstClass = ctx.getBean("myFirstBean",MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellStory());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());

    }
}

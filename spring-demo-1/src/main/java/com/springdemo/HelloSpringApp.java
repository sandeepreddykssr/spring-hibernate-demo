package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sandeepreddy on 25/12/18.
 */
public class HelloSpringApp {

    public static void main(String[] args) {

        //Load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}

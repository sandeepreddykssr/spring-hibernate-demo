package com.udemy.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sandeepreddy on 26/12/18.
 */
public class AnnotationApp {
    public static void main(String[] args) {
        System.out.println("Before Context");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Before Init");

        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getEmail());
        System.out.println(baseballCoach.getTeam());


        Coach myCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}

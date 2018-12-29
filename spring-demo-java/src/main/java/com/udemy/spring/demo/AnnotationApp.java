package com.udemy.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sandeepreddy on 26/12/18.
 */
public class AnnotationApp {
    public static void main(String[] args) {
        System.out.println("Before Context");
        System.out.println();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println();
        System.out.println("Before Init");
        System.out.println();

        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println();
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getEmail());
        System.out.println(baseballCoach.getTeam());
        System.out.println();

        Coach myCoach = context.getBean("trackCoach", Coach.class);

        System.out.println();
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println();

        myCoach = context.getBean("swimCoach", Coach.class);

        System.out.println();
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}

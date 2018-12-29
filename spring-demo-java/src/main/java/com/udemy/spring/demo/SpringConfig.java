package com.udemy.spring.demo;

import org.springframework.context.annotation.*;

/**
 * Created by sandeepreddy on 26/12/18.
 */
@Configuration
@PropertySource("classpath:application.properties")
@PropertySource("classpath:sport.properties")
@ComponentScan
public class SpringConfig {

    @Bean
    public SwimCoach swimCoach() {
        SwimCoach swimCoach = new SwimCoach();

        return swimCoach;
    }

}

package com.udemy.spring.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Today it's up to you to create the peacefulness you long for.",
			"A friend asks only for your time not your money.",
			"If you refuse to accept anything but the best, you very often get it.",
			"A smile is your passport into the hearts of others.",
			"A good way to keep healthy is to eat more Chinese food.",
			"Your high-minded principles spell success.",
			"Hard work pays off in the future, laziness pays off now."};

	private Random random = new Random();

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}

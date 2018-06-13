package com.cybertek;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class Batch8 {
	public static void main(String[] args) {
		System.out.println("First Automation project");
		
		Faker facer = new Faker();
		String creditCard =facer.finance().creditCard();
		System.out.println(creditCard);
		System.out.println(facer.chuckNorris().fact());
		
		WebDriver driver;
		
		
	}
}

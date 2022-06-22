package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		driver.navigate().to("https://www.selenium.dev/documentation/"); // longer
		Thread.sleep(10000);
		//driver.get("https://www.selenium.dev/documentation/");
		driver.navigate().back(); // javascript window:back()
		Thread.sleep(10000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}

package com.demo.alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		driver.get("https://demoqa.com/alerts"); // page load or opened or displayed
		driver.quit();
	}

}

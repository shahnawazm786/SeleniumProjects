package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("selenium")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}

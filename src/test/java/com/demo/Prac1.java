package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();// maximize the window
		Thread.sleep(5000);
		driver.manage().window().minimize();
		//driver.close();
		Thread.sleep(5000);
		driver.manage().window().maximize();// maximize the window
		Thread.sleep(5000);
		driver.quit();
		
	}

}

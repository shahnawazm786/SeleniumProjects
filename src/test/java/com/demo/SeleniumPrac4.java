package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		// Paragraph tag <p> 
		// Anchor <a>
		
		// Source
//		String source=driver.getPageSource();
//		System.out.println(source);
//		int len=source.length();
//		System.out.println("Total Length ->"+len);
//		int count=source.length() - source.replaceAll("href", "").length();
//		System.out.println("A link " + count);
//		
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.google.com/")) {
			System.out.println("Given right url");
		}
		else
		{
			System.out.println("Wrong url testing");
		}
	}

}

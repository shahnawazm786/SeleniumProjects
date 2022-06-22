package com.demo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		
		Cookie cookie=new Cookie("username","ShahnawazM");
		System.out.println(cookie.getName());
		System.out.println(cookie.getValue());
		
		driver.manage().addCookie(cookie);
		driver.manage().deleteCookieNamed("username");
		cookie=driver.manage().getCookieNamed("username");
		if(cookie!=null) {
			System.out.println(cookie.getValue());
		}
		

	}

}

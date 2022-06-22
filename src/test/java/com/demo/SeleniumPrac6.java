package com.demo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
public class SeleniumPrac6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		Cookie cookie1=new Cookie("username","ShahnawazM");
		Cookie cookie2=new Cookie("Password","ShahnawazM123456");
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie(cookie2);
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(driver.manage().getCookies());
		System.out.println(cookies);
		driver.manage().deleteAllCookies();
	}

}

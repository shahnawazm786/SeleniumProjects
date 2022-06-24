package com.demo.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TagAttributesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.tagName("html"));
		String att=ele.getAttribute("lang");
		System.out.println(att);
		
		System.out.println("Find the text of style");
		ele=driver.findElement(By.xpath("(//style)[3]"));
		String innerText=ele.getText();
		System.out.println(innerText);
	}

}

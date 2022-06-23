package com.demo.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class ElementsExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://getbootstrap.com/docs/4.0/components/progress/"); // page load or opened or displayed
		Thread.sleep(10000);
		//WebElement element=driver.findElement(By.xpath("(//a1)[5]"));
		//WebElement element=driver.findElement(By.xpath("(//a)[5]"));
		//List<WebElement> elements=driver.findElements(By.tagName("a1"));
		List<WebElement> elements=driver.findElements(By.tagName("div"));
		//String text=element.getText();
		System.out.println(elements.size());
	}

}

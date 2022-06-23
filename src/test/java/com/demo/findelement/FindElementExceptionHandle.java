package com.demo.findelement;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExceptionHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://getbootstrap.com/docs/4.0/components/progress/"); // page load or opened or displayed
		Thread.sleep(10000);
		WebElement element;
		try {
			element=driver.findElement(By.xpath("(//a1)[5]"));
			String text=element.getText();
			System.out.println(text);
		}catch(NoSuchElementException nse) {
			System.out.println("Element not found");
		}
		//WebElement element=driver.findElement(By.xpath("(//a)[5]"));
		finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}

}

package com.demo.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionStale {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com"); // page load or opened or displayed
		Thread.sleep(10000);
		//WebElement element=driver.findElement(By.xpath("(//a1)[5]"));
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("KAZ - IT training hub" + Keys.ENTER);
		//element=driver.findElement(By.name("q"));
		try {
		element.sendKeys("Talabat.com");
		element.sendKeys(Keys.ENTER);
		}catch(org.openqa.selenium.StaleElementReferenceException st) {
			System.out.println("Stale Element");
		}
		
	}

}

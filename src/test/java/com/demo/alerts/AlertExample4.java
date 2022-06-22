package com.demo.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://demoqa.com/alerts"); // page load or opened or displayed
		Thread.sleep(10000);
		//Button click action perform
		driver.findElement(By.id("timerAlertButton")).click();
		// Alert handle
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert=null;
		try {
		
			alert=wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		}catch(TimeoutException te) {
			System.out.println("Handle in catch block -- Time out exception");
			wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			alert=wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		}
			Thread.sleep(10000);
		driver.quit();
	}

}

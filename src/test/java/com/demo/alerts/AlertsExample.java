package com.demo.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// navigation
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://demoqa.com/alerts"); // page load or opened or displayed
		Thread.sleep(10000);
		//Button click action perform
		driver.findElement(By.id("alertButton")).click();
		// Alert handle
		Thread.sleep(10000); // static wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(10000);
	}

}

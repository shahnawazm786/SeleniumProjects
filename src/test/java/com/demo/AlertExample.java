package com.demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.linkText("See an example alert"));
		element.click();
		Thread.sleep(5000);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		// confirm
		Thread.sleep(5000);
		element=driver.findElement(By.linkText("See a sample confirm"));
		element.click();
		Thread.sleep(5000);
		alert=wait.until(ExpectedConditions.alertIsPresent());
		text=alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		// Accept
		//See a sample prompt.
		Thread.sleep(5000);
		element=driver.findElement(By.linkText("See a sample prompt"));
		element.click();
		Thread.sleep(5000);
		alert=wait.until(ExpectedConditions.alertIsPresent());
		//text=alert.getText();
		Thread.sleep(5000);
		alert.sendKeys("Selenium");
		Thread.sleep(5000);
		//System.out.println(text);
		//alert.dismiss();
		alert.accept();

	}

}

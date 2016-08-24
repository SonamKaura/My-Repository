package com.gspann.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@Test
	public void setup() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in/");
		String parentwindow=driver.getWindowHandle();
		WebElement tickets=driver.findElement(By.xpath("//a[text()='Flight Tickets']"));
		tickets.click();
		Set<String>allwin=driver.getWindowHandles();
		for(String eachwindow:allwin)
		{
			if(!eachwindow.equals(parentwindow)){
				driver.switchTo().window(eachwindow);
				break;
			}
			
			
		}
		
		WebElement origin=driver.findElement(By.xpath("//input[@id='origin']"));
		origin.click();
		origin.sendKeys("Delhi");
		Thread.sleep(10000);
		origin.sendKeys("\t");

		WebElement destination=driver.findElement(By.xpath("//input[@id='destination']"));
		destination.click();
		destination.sendKeys("Goa");
		Thread.sleep(10000);
		origin.sendKeys("\t");
		
	}

}

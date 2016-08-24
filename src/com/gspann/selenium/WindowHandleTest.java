package com.gspann.selenium;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WindowHandleTest {
	
	public static WebDriver driver;
	
	@Test
	public void Window()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	String parentWindow = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//a[text()='Flight Tickets']")).click();
		Set<String> handles =  driver.getWindowHandles();
	   for(String windowHandle  : handles)
	       {
	       if(!windowHandle.equals(parentWindow))
	          {
	          driver.switchTo().window(windowHandle);
	          System.out.println("Window switched");
	        // <!--Perform your operation here for new window-->
	         driver.close(); //closing child window
	         driver.switchTo().window(parentWindow); //cntrl to parent window
	          }
	       
	       }
	}
}
	       



package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	
	//Here the method getElement is the method name whose return type is "WebElement" since we want webelement to be returned.Also we created 
	//this method as static so that we can directly call this method without the object.
	
	// Also here in the method below public static WebElemnt getElemet() in this return type is : WebElement since
	//we want to return the WebElement
	
	public static WebElement getElement(WebDriver driver, String xPath){
		
		try{
			WebElement element = driver.findElement(By.xpath(xPath));
			return element;
		}
		catch(NoSuchElementException e){
			System.out.println("Error in WebElement() of Utility class :: " + e.getMessage());
			return null;
		}
		catch (Exception e) {
			System.out.println("Error in WebElement() of Utility class :: " + e.getMessage());
			return null;
		}
		
				
		}
	
	//In this the return type is void since we want that and static we have used so that we can call this method
	//without the object.
	public static void sortdropdown(WebDriver driver,String xpath, int index)
	{
		System.out.println("xpath : "+xpath);
		System.out.println("index : "+index);
		System.out.println("driver : "+driver.getCurrentUrl());
		try{
			Select made1 = new Select(driver.findElement(By.xpath(xpath)));
			made1.selectByIndex(index);
			}
			catch (Exception e) {
				System.out.println("dropdown : Exception : "+e);
				System.out.println("dropdown : Exception : "+e.getMessage());
			}
	}
	
	public static void  show( WebDriver driver,String xpath,int index)
	{
		System.out.println("xpath : "+xpath);
		System.out.println("index : "+index);
		System.out.println("driver : "+driver.getCurrentUrl());
		try
		{
			Select show1=new Select (driver.findElement(By.xpath(xpath)));
			show1.selectByIndex(index);
				
		}
		catch(Exception e)
		{
			System.out.println("show dropdown exception:"+e);
			System.out.println("show dropdown exception:"+e.getMessage());
		}
	}
	
	public static void sign_in(WebDriver driver) throws InterruptedException
	{
		//Sign In
		driver.findElement(By.id("globalMastheadSignIn"));
        WebElement signin = driver.findElement(By.id("globalMastheadSignIn"));
        signin.click();
        Thread.sleep(5000);
        WebElement emailclear=driver.findElement(By.xpath("//input[@id='email']"));
    	emailclear.clear();
    	Thread.sleep(5000);
    	System.out.println("Email field clear");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("binakalia@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aryanbhola");
        WebElement singnin=driver.findElement(By.id("signInBtn"));
        singnin.click();
        System.out.println("SignIn done");
	}
	}
	


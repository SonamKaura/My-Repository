package com.testing; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; // All the methods of selenium is defined in this webdriver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClassTest {

	/**
	 * @param args
	 */
	public static FirefoxDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //String url = "www.";
		//driver.findElement(By.id(""));
	
		
		driver.get("https://www.gmail.com");
		String str=driver.getTitle(); // It will give the title of the page
		String astr=driver.getCurrentUrl();// It will give the url of the page
		System.out.println("This is the title" +astr);
		//driver.findElement(By.id("Email"));
		
		driver.findElement(By.name("Email")).sendKeys("sonamkaura@gmail.com");
		//( By.name will find the element by name and through sendkeys it will type email id "sonam51284@gmail.com"
			driver.findElement(By.name("Passwd")).sendKeys("gspannwhisk");
		// By sendKeys (password is entered)
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.id("errormsg_0_Passwd"));
		
		
		
		
		
		driver.quit(); // to close the browser
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	//private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	

}



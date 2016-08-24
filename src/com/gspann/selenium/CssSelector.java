package com.gspann.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CssSelector {
	
	public static WebDriver driver;
	
	@BeforeTest
    public void browser() {

		System.setProperty("webdriver.chrome.driver",
				"E://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
            driver.manage().window().maximize();
            System.out.println("Browser invoked and navigating to the AEM site");
             
    }
	
	@Test
	public void start()
	{

        System.out.println("Before Test");
        
        WebElement username= driver.findElement(By.cssSelector("input[id='username']"));
        username.sendKeys("skalia");
        WebElement password= driver.findElement(By.cssSelector("input[id='password']"));
        password.sendKeys("test123");
        driver.findElement(By.id("submit-button")).click();
        System.out.println("User Logged In");
                }
	}


package com.gspann.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	public static WebDriver driver;
	@Test
	public void test1() throws IOException
	{
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"E://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement e =driver.findElement(By.xpath("//input[@id='lst-ib']"));
		e.sendKeys("Selenium");
		WebElement seleniumhq=driver.findElement(By.xpath("//a[contains(text(),'Selenium - Web Browser Automation')]"));
		seleniumhq.click();
		driver.manage().window().maximize();
		WebElement download=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		download.click();
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("Url is "+url);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:/sonam/s1.png"));
		driver.quit();	
		
		
		
			}

}

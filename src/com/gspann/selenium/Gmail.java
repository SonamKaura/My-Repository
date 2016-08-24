package com.gspann.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail 
{
	
	public static WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",
				"E://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		/*WebElement singnin =driver.findElement(By.xpath("//a[@id='gmail-sign-in']"));
		singnin.click();*/
		WebElement username =driver.findElement(By.xpath("//input[@id='Email']"));
		username.click();
		username.sendKeys("sonam51284@gmail.com");
		WebElement next =driver.findElement(By.xpath("//input[@id='next']"));
		next.click();
		WebElement password =driver.findElement(By.xpath("//input[@id='Passwd']"));
	
		password.sendKeys("");
		WebElement singnin=driver.findElement(By.xpath("//input[@id='signIn']"));
		singnin.click();
		driver.manage().window().maximize();
		
		WebElement compose=driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]"));
		compose.click();
		WebElement To=driver.findElement(By.xpath("//div[@class='wO nr l1']/textarea"));
		To.sendKeys("shubham.mathur@gspann.com");
		
		WebElement Subject=driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		Subject.sendKeys("Selenium Training");
		WebElement Body=driver.findElement(By.xpath("//td[@class='Ap']/div[2]/div"));
		Body.sendKeys("Thanks for giving us the traning");
		WebElement Send=driver.findElement(By.xpath("//td[@class='gU Up']/div/div[2]"));
		Send.click();
		
			
	}

}

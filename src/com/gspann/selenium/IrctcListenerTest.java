package com.gspann.selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(com.gspann.selenium.MyListener.class)
public class IrctcListenerTest {
	WebDriver driver = new FirefoxDriver();


	@Test
	public void setup(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
				String title=driver.getTitle();
				System.out.println("Title is "+title);
				Assert.assertTrue(title.equals("xyz"));
				break;
			}
		}
	}

	@Test
	public void DomesticTravel() throws InterruptedException
	{

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

		WebElement datepicker=driver.findElement(By.xpath("//div[@id='showdometic']/div[3]/div[4]/img"));
		datepicker.click();

		WebElement departuredate=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody//a[text()='29']"));
		departuredate.click();

		Select adults=new Select(driver.findElement(By.xpath("//select[@id='noOfAdult']")));
		adults.selectByIndex(1);

		Select travelClass=new Select(driver.findElement(By.xpath("//select[@id='classType']")));
		travelClass.selectByIndex(0);
		//travelClass.selectByValue("Economy");

		Select airlines=new Select(driver.findElement(By.xpath("//select[@name='airlinePreference']")));
		airlines.selectByVisibleText("All Airlines");

		WebElement search=driver.findElement(By.xpath("//div[@id='showdometic']/div[6]"));
		search.click();

		List <WebElement> flightResult=driver.findElements(By.xpath("//div[@id='flightListResult']/div"));
		int totalcount=flightResult.size();
		System.out.println("size of the List is "+totalcount);
		Assert.assertEquals(totalcount, "69");
		Assert.assertTrue(flightResult.equals(totalcount), "Mismatch" );

	}

	public WebDriver getDriver(){
		return driver;
	}
}



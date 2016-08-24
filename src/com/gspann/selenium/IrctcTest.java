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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IrctcTest {

	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void setup(@Optional String browser) throws InterruptedException
	{
		//		if(browser.equalsIgnoreCase("firefox")){
		//			driver = new FirefoxDriver();
		//		}
		//		else{
		System.setProperty("webdriver.chrome.driver",
		"D://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		//		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in/");
		String parentwindow=driver.getWindowHandle();
		WebElement tickets=driver.findElement(By.xpath("//a[text()='Flight Tickets']"));
		tickets.click();
		Thread.sleep(2000);
		Set<String>allwin=driver.getWindowHandles();
		for(String eachwindow:allwin)
		{
			if(!eachwindow.equals(parentwindow)){
				driver.switchTo().window(eachwindow);
				break;
			}

		}
		System.out.println("*********** "+driver.getCurrentUrl());
		System.out.println("*********** "+driver.getTitle());
		//Assert.assertTrue(title.contains("sonam"), "Title mismatch");
	}

	@Parameters({"Originname", "Destinationname"})
	@Test
	public void DomesticTravel(@Optional String Oname, @Optional String Dname) throws InterruptedException
	{
		Oname = "delhi";
		Dname="jaipur";
		System.out.println("Oname "+Oname);
		System.out.println("Oname "+Dname);

		WebElement origin=driver.findElement(By.xpath("//input[@id='origin']"));
		origin.click();
		origin.sendKeys(Oname);
		Thread.sleep(2000);
		origin.sendKeys("\t");

		WebElement destination=driver.findElement(By.xpath("//input[@id='destination']"));
		destination.click();
		destination.sendKeys(Dname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[contains(@style,'display: block;')]/li[@class='ui-menu-item']")).click();

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
}

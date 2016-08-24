package com.gspann.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipcartTest {
	
	
	WebDriver driver;
	 

	 @BeforeTest
	 public void setup(){
	  /*if(browser.equals("chrome")){
	   System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/Chrome2.23/chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
	  }*/
	//  if(browser.equals("firefox")){
	   driver = new FirefoxDriver();
	//  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.flipkart.com/#");
	 }

	 @Test
	 public void countNoOfFlightTest() throws InterruptedException{
	//  int i = 0;
	  List<String> getJeansList = new ArrayList<String>();
	  driver.findElement(By.xpath("//input[@placeholder='Search for Product, Brands and More']")).sendKeys("jeans");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  List<WebElement> jeansSearchList=driver.findElements(By.xpath("//div[@id='container']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]//a[2]"));
	  for(WebElement getJeans : jeansSearchList){
	   getJeansList.add(getJeans.getText());
	//   System.out.println(i+" <==> "+getJeansList);
	//   i++;
	  }
	  
	//div[@class='_2xw3j-']/div[3]/div[1]/div
	  int size=getJeansList.size();
	  Random random = new Random();
	  int randomValue = random.nextInt(size);
	  String getJeansName = getJeansList.get(randomValue);
	  System.out.println("Xpath ==> "+"//div[@id='container']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]//a[2][text()=\""+getJeansName+"\"]");
	  driver.findElement(By.xpath("//div[@id='container']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]//a[2][text()=\""+getJeansName+"\"]")).click();
	  
	 }

	 @AfterTest
	 public void quit(){
	  driver.quit();
	 }

}

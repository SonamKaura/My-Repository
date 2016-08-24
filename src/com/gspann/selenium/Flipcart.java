package com.gspann.selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipcart {

	//public static
	WebDriver driver;
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver",
		"D://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
		 */
		driver=new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
			
	}
	
	@BeforeClass
	public void Singin()
	{
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
		login.click();
		WebElement email=driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
		email.sendKeys("sonam51284@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
		password.sendKeys("");
	
	}
	
	@BeforeMethod
	public void Startup() throws InterruptedException
	{
		System.out.println("before Method");
		WebElement search=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		search.sendKeys("Jeans");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		System.out.println("Submit done");
		Thread.sleep(10000);	
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		//To click on 1st element of the list we do by:
		List <WebElement> products = driver.findElements(By.xpath("//div[@class='_2xw3j-']/div[3]/div[1]/div"));
		int size=products.size();
		System.out.println("Size is "+size);
		WebElement firstproduct=products.get(0);//by this 1st product will get clicked
		firstproduct.click();
		System.out.println("First product is clicked");
		driver.navigate().back();
		System.out.println("Navigated back");
		
		//Clicking on Random product
		
		WebElement search=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		search.sendKeys("Jeans");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		System.out.println("Submit done");
		Thread.sleep(10000);
		//Clicking on random product
		Random r = new Random();
		int randomValue=r.nextInt(size);
		System.out.println("Random Value"+randomValue);
		products.get(randomValue).click(); 
		System.out.println("product is clicked");
		
		WebElement jeanssize=driver.findElement(By.xpath("//ul[@class='eaKBCI']/li[1]/a"));
		jeanssize.click();
		WebElement buy=driver.findElement(By.xpath("//button[@type='button']"));
		buy.click();
		WebElement deliver=driver.findElement(By.xpath("//div[@class='carousel-inner']/div/div[1]/a/p[4]"));
		deliver.click();
		WebElement cart=driver.findElement(By.xpath("//button[@class='_3zLR9i _3Plo8Q _19RW-r']"));
		cart.click();
		WebElement removeitem=driver.findElement(By.xpath("//a[@title='Remove Item']"));
		removeitem.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='cartpage-cart-tab-content']/div[2]"));
		String text=message.getText();
		System.out.println("Message after removing"+text);
		//Assert.assertTrue(text.equals(arg0), message);
		
	}
}

		


// In Junior Category taking the count of elements under "Junior Clothing" and putting them in a list and 
// using assertions to validate



package signup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class Random {
	
	public static final int index=0;
	public static RemoteControlConfiguration rc;
	public static FirefoxDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void before()throws InterruptedException {
		
		driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		

		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
	
	
	}
	
	@Test
	
	public void test() throws InterruptedException
	{
		
		WebElement juniors=driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']/ul/li[5]/a"));
		
		juniors.click();
		Thread.sleep(8000);
		System.out.println("juniors clicked");
		
		//for setting the focus
	  	new Actions(driver).moveToElement(driver.findElement(By.id("globalMastheadSignIn"))).perform(); // for setting the focus
	  	Thread.sleep(8000);
		
		// Counting the no of things coming under "Juniors Clothing"
	  	 	
	  	
	  	 int rowCount = driver.findElements(By.xpath("//div[@id='localNavigationContainer']/ul/li[2]/ul/li")).size();
	  	 System.out.println("Row Count is "+rowCount);
	  	 
	  	 
	  	 //Items are stored in a list and printed one by one
	  	 
  	
	  	List<WebElement> text = driver.findElements(By.xpath("//div[@id='localNavigationContainer']/ul/li[2]/ul/li"));
	  	for (WebElement element: text) 
	  	
	  	{
	  	     System.out.println(element.getText());
	  	     System.out.println("done");
	  	      
	  	 }
	  	
	  	assertEquals(16, text.size());
	  	System.out.println("assert size is good");
	  	  	
	}

	private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}
}
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	
	  	 
	  	
	  	
	  	 
	  	
	  	 
	  	 
	  			
		
		
		
	  	
	    
	    
	    
	    
	        		
		
	
	
	
	

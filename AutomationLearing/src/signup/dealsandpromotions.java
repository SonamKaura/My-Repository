package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class dealsandpromotions {
	
	private static final int index = 0;

	public static RemoteControlConfiguration rc;

	//public static FirefoxDriver driver = new FirefoxDriver();
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void testSetUp() throws InterruptedException
	{
		
		 // code to run on Chrome
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("http://www.macys.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
			

		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
	
	}
	
@Test
	
	public void deals(WebDriver driver) throws InterruptedException
	
	{
	System.out.println("Inside deals and Promotions");
	WebElement dealprom=driver.findElement(By.xpath("//div[@id='featureNav']/ul/li[3]/a"));
	dealprom.click();
	System.out.println("deals and promo clicked");
	
	// Shop Now
	Thread.sleep(8000);
	//WebElement shopnow=driver.findElement(By.xpath("//h2[text()='Free shipping at $50']//..//..//a"));
	WebElement shopnow=driver.findElement(By.xpath("//ul[@class='offers']/li[8]/div[2]/a"));
	shopnow.click();
	System.out.println("Shop Now Clicked");
	Thread.sleep(8000);
	// We want to use the method of the class BeautyandQuickView
	try{
	BeautyandQuickView obj=new BeautyandQuickView();// creating the object of beautyand quick view  
	obj.M1(driver); // using  the object of beautyand quick view class
	System.out.println("Beauty Class Clicked");
	}

   catch (InterruptedException e)
   
   {
	
	   System.out.println("Exception is :"+e);
				
	}

	}
}
	


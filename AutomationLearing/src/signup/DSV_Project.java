package signup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
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

public class DSV_Project {
	
	private static final int index = 0;

	public static RemoteControlConfiguration rc;
	static WebDriver driver;
	
	@BeforeTest
	
	public void before()throws  InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
	driver = new ChromeDriver();
	/*driver = new FirefoxDriver();*/
	driver.manage().deleteAllCookies();
	driver.get("https://www.macys.com");
	driver.manage().window().maximize();

	}
	@Test	
	public void execute()throws InterruptedException
	{
		// To run in Chrome
		
		Sign_Up ob1=new Sign_Up();
		System.out.println("Singn Up proceeding");
		Thread.sleep(8000);
		ob1.singnup(driver);
		System.out.println("singn up is clicked");
		Thread.sleep(8000);
		/*WebElement facebook=driver.findElement(By.xpath("//div[@class='social facebook']"));
		facebook.click();
		System.out.println("Facebook is clicked");
		Thread.sleep(5000);
		driver.get("https://www.macys.com");
		Thread.sleep(4000);
		WebElement twitter=driver.findElement(By.xpath("//div[@class='social twitter']"));
		twitter.click();
		System.out.println("Twitter is clicked");
		Thread.sleep(8000);
		driver.get("https://www.macys.com");
		Thread.sleep(9000);
		WebElement mblog=driver.findElement(By.xpath("//div[@class='social mblog']"));
		mblog.click();
		Thread.sleep(8000);
		driver.get("https://www.macys.com");
		Thread.sleep(8000);
		WebElement footerlink1=driver.findElement(By.xpath("//a[@id='orderTrackingFooterHref']"));
		footerlink1.click();
		Thread.sleep(10000);
		WebElement footerlink2=driver.findElement(By.xpath("//a[@id='shippingInformation']"));
		footerlink2.click();
		Thread.sleep(8000);
		System.out.println("Footer links clicked");*/
	
		System.out.println("Beauty started");
		BeautyandQuickView ob3=new BeautyandQuickView ();
		driver=ob3.testBeautyCheckout(driver);
		System.out.println("beauty done");
		Thread.sleep(8000);
				
		// Adding the product to bag by using Search functionality
		
		WebElement macyslogo1=driver.findElement(By.xpath("//*[@id='href_macysLogo']"));
		macyslogo1.click();
		System.out.println("MacysLogo Clicked");
		Thread.sleep(4000);
		System.out.println("Add to bag started");
		Addtobag ob4=new Addtobag();
		ob4.testSearch(driver);
		System.out.println("Add to bag done");
		Thread.sleep(5000);
			
		System.out.println("Find a Store Started");
		Find_A_Store ob5=new Find_A_Store();
		ob5.storesearch(driver);
		System.out.println("Find a Store done");	
		Thread.sleep(8000);
		
		System.out.println("Deals and Promotion Started");
		dealsandpromotions ob6=new dealsandpromotions();
		/*WebElement bagclear=driver.findElement((By.xpath("//a[@id='checkoutLink']/span[2]")));
		bagclear.clear();*/
		Thread.sleep(5000);
		ob6.deals(driver);
		System.out.println("Deals and Promotions done");
			
		System.out.println("GiftCards Started");
		Thread.sleep(3000);
		WebElement macyslogo2=driver.findElement(By.xpath("//*[@id='macysHomePageLogo']"));
		macyslogo2.click();
		System.out.println("Macys logo clicked");
		giftcards ob7=new giftcards();
		ob7.giftcards_addtobag(driver);
		System.out.println("Giftcards done");
		Thread.sleep(10000);
		
		// To be run in FF
		System.out.println("Merge Back started");
		WebElement macyslogo3=driver.findElement(By.xpath(".//*[@id='macysHomePageLogo']"));
		macyslogo3.click();
		System.out.println("MacysLogo Clicked");
		Thread.sleep(5000);
		mergeback ob8=new mergeback();
		ob8.merge(driver);
				
		
	
	}

}

package signup;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utils.Utility;
public class mergeback {
	//public static RemoteControlConfiguration rc;
	//Common_method obj1=new  Common_method(); // local object of the class: Common_method

//	private static FirefoxDriver driver = new FirefoxDriver();
		//we have commented the above line as we are calling the "Common_Method class" methods so in that
	//the above line is described and 2 browsers are openening so to avoid that we are commenting
	//this.
	private static final int index = 0;
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();	
		//obj1.startup(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Test
	public void merge(WebDriver driver) throws InterruptedException
	{
	// Sign Out
	WebElement signout =driver.findElement((By.xpath("//a[@id='globalMastheadSignIn']")));
	signout.click();
	System.out.println("Signout done");
	Thread.sleep(8000);
	Utility.sign_in(driver);
	/*Thread.sleep(3000);
		// Singn In 
		System.out.println("HHHHHHH");
		try
		{
			SingnIn  signinobj=new SingnIn();
			signinobj.sign_in(driver);
		}
		catch( Exception e)
		{
			System.out.println("Exception is "+e);
			System.out.println("Exception message is "+e.getMessage());
		}*/
		 // Clicking on Shoes Menu
		Thread.sleep(9000);
		WebElement shoes=driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']/ul/li[8]/a"));
		Thread.sleep(10000);
		//Setting the focus on Shoes
		new Actions(driver).moveToElement(driver.findElement(By.id("globalMastheadSignIn"))).build().perform(); // for setting the focus
		shoes.click();
		System.out.println("shoes clicked");
		/*//For setting the focus on COACH
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'COACH')][1]"))).perform(); // for setting the focus
*/		Thread.sleep(3000);
		System.out.println("Outside Try");
		try
		{
		System.out.println("Inside Try");	
		//setting the focus	on coach 
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//ul[@id='firstNavSubCat']/li[6]/ul/li[1]/a")));
		//clicking on coach link
		WebElement coach=driver.findElement(By.xpath("//ul[@id='firstNavSubCat']/li[6]/ul/li[1]/a"));
		//WebElement coach=driver.findElementByXPath("//a[contains(text(),'COACH')][1]");
		Thread.sleep(7000);
		coach.click();
		Thread.sleep(8000);
			}
		catch(Exception e)
		{
			System.out.println("Exception is "+e);
			System.out.println("Exception message is "+e.getMessage());
		}
		//Clicking on firstoption(container)
		WebElement firstoption=driver.findElement(By.xpath("//div[@id='macysGlobalLayout']/div[1]/ul/li[1]/div[1]/div[2]/a"));
		firstoption.click();
		System.out.println("first option clicked");
		Thread.sleep(9000);
		WebElement size=driver.findElement(By.xpath("//div[@id='pdpAttributes']/div[2]/div/ul/li[1]"));
		size.click();
		WebElement addtobag=driver.findElement(By.xpath("//div[@id='pdpButtons']/img"));
		addtobag.click();
		System.out.println("Add to bag clicked");
		Thread.sleep(8000);
		//Singout  
		WebElement singout=driver.findElement(By.id("globalMastheadSignIn"));
		singout.click();
		Thread.sleep(5000);
		System.out.println("Singout Clicked");
		driver.manage().deleteAllCookies();
		System.out.println("cookies deleted");
		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
		WebElement Ship=driver.findElement(By.xpath("//input[@id='shipToUS']"));
		Ship.click();
		Thread.sleep(5000);
		Utility.sign_in(driver);
		Thread.sleep(6000);
		// Adding another product
		//Search
		WebElement search=driver.findElement(By.id("globalSearchInputField"));
		search.click();
		search.sendKeys("guess");
		search.submit();
		//xpath of the first option in guess search
		WebElement Firstoptionmerge=driver.findElement(By.xpath("//div[@id='search_landing_product']/ul/li[1]/div[1]/div[2]"));
		Firstoptionmerge.click();
		System.out.println("First Option Merge Click");
		Thread.sleep(6000);
		WebElement Addtobagmerge=driver.findElement(By.xpath("//div[@id='pdpButtons']/img"));
		Addtobagmerge.click();
		System.out.println("Add to Bag Merge Click");
		Thread.sleep(6000);
		WebElement CheckoutMerge=driver.findElement(By.xpath("//img[@id='btnCheckout']"));
		CheckoutMerge.click();
		System.out.println("Checkout Merge Click");
		Thread.sleep(9000);
		WebElement Addtocurrentbag=driver.findElement(By.xpath("//input[@id='addToCurrentBag']"));
		Addtocurrentbag.click();
		System.out.println("Add to current bag clicked::Merge Bag done");
		Thread.sleep(9000);
		
		//div[@id='pdpButtons']/img
		
		
			}
	
}

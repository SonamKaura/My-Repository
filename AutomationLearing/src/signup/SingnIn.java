package signup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class SingnIn {
	
	private static final int index = 0;

	public static RemoteControlConfiguration rc;

	//public static FirefoxDriver driver = new FirefoxDriver();
	WebDriver driver =null;
	
	
	@BeforeTest
	public void testSetUp()
	{
		
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		
	/*	driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		

		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
		*/
	}
	
	/*@AfterTest
	public void testClose()
	{
		//WebElement close=driver.findElement(By.id("closeButton"));
		//close.click();
		driver.close();
	}
	*/
	
	
	@Test
	public void sign_in(WebDriver driver ) throws InterruptedException
	
	{	
		//Sign In
		driver.findElement(By.id("globalMastheadSignIn"));
        //a[@id='globalMastheadSignIn']
       WebElement signin = driver.findElement(By.id("globalMastheadSignIn"));
       signin.click();
       WebElement email = driver.findElement(By.id("email"));
       email.sendKeys("binakalia@gmail.com");
       
       WebElement password = driver.findElement(By.id("password"));
       password.sendKeys("aryanbhola");
       
       WebElement singnin=driver.findElement(By.id("signInBtn"));
       singnin.click();
       
		/*
		WebElement women=driver.findElementByXPath("//div[@id = 'globalMastheadCategoryMenu']/ul/li[3]/a");
		Thread.sleep(2000);
	    women.click();
	  	System.out.println("Done----------");
		
		new Actions(driver).moveToElement(driver.findElement(By.id("globalMastheadSignIn"))).perform(); // for setting the focus
					
		Thread.sleep(2000);
	    WebElement coat=driver.findElement(By.xpath("(//a[contains(text(),'Coats')])[5]"));
		coat.click();
		System.out.println("Clicked on Coats");
	                           //div[@id='localNavigationContainer']//ul[@id = 'firstNavSubCat']/li[1]/ul/li[2]
	
		
		WebElement message = driver.findElement(By.id("href_myAccountHeader"));
		String messageText = message.getText();
		System.out.println(messageText);
		
		WebElement check=driver.findElementByXPath("//span[@id='count_FABRIC_Cotton']");
		check.click();
		System.out.println("check clicked");
		
		//assertEquals("my aacount",messageText);
		
		    //System.out.println(driver.getTitle());
		
		
		System.out.println("Executing");
		
		// Mouse Over
		
		Actions actions = new Actions(driver);
		WebElement mk=driver.findElementByXPath("[@id='swatch606860#2_0']");
		System.out.println("***************"+mk.getText());
		actions.moveToElement(mk).build().perform();
		actions.click();
		
		//mk.click();
		
		System.out.println("Executed");
		
		
		// Add to bag
		
		WebElement addtobag=driver.findElementByXPath("//img[@id='addToBagButton606860']");
		addtobag.click();
		
		
	
		  
	
			
		
		 //calling dropdown method 
		  
		try{
		dropdown("//select[@id='sortBy']",1);
		}
		
		catch (Exception e) {
			System.out.println("Exception : "+e);
			System.out.println("Exception : "+e.getMessage());
		}
		
		
		// calling show drop down 
		
		//showdrop("ppp",1);
		
		
		//dropdowns
		
		Select show= new Select (driver.findElement(By.id("ppp")));
		
		System.out.println("Size is------>"+show.getOptions().size());
	
     
		Select made1 = new Select(driver.findElementByXPath("//select[@id='sortBy']"));
		
    
		made1.selectByIndex(1);
		
		   System.out.println("Size is-one----->"+made1.getOptions().size());
		   
		   show= new Select (driver.findElement(By.id("ppp")));
		 
		 System.out.println("Size is fgfdg------>"+show.getOptions().size());
		 
				 	
		//show.selectByIndex(show.getOptions().size()-1);
		
		show.selectByIndex(0);
		
			
		System.out.println("Done-------------------");
		
		
		
		
		
		WebElement drop=driver.findElementById("sortBy");
		drop.click();
		
		Select fill = new Select(driver.findElementByXPath("//select[@ id='sortBy']//option[@value='BEST_SELLERS']"));
		fill.getAllSelectedOptions();
		
		
		
		// Whislist
		
		WebElement whishlist=driver.findElementById("wishListHref");
		whishlist.click();
		
		//deals and Promotions
		
		WebElement deals=driver.findElementById("dealsPromotionHref");
		deals.click();
		
		//free shipping at $50 purchase
		System.out.println("this is deals and promotions");
		WebElement shop=driver.findElementByClassName("shop-now primaryBtnL");
		shop.click();
		
		
				
	}
	
	
	
	 private void assertEquals(String string, String messageText) {
		// TODO Auto-generated method stub
		
	}

	// methods for  For dropdown
	
	public void dropdown(String xpath,int index)
	 { 
	  		
		System.out.println("xpath : "+xpath+"\n index : "+index);
		
		try{
		Select made1 = new Select(driver.findElementByXPath(xpath));
		
		made1.selectByIndex(index);
		}
		
		catch (Exception e) {
			System.out.println("dropdown : Exception : "+e);
			System.out.println("dropdown : Exception : "+e.getMessage());
		}
	 }
	
	//method for show dropdown
	
	public void showdrop(String id, int index)
	{
		System.out.println("id of the element is : "+id+"\n idex is :"+index);
		try{
		Select show= new Select (driver.findElement(By.id(id)));
		
		System.out.println("The id is "+id);
		
		show.selectByIndex(index);
		}
		
		catch (Exception e) {
			System.out.println("dropdown : Exception : "+e);
			System.out.println("dropdown : Exception : "+e.getMessage());
		}
		*/
	}
}



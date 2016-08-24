package signup;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//import com.sun.java.util.jar.pack.Package.File;

public class Catpage {
	
public static RemoteControlConfiguration rc;

//public static FirefoxDriver driver = new FirefoxDriver();

WebDriver driver;
	
	
	

	
@BeforeTest
public void testSetUp()
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");*/
	}
	

	@Test
	public void testSearch(WebDriver driver) throws InterruptedException
	{
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKK");
		Thread.sleep(2000);
		WebElement women=driver.findElement(By.xpath("//div[@id = 'globalMastheadCategoryMenu']/ul/li[3]/a"));
		
		Thread.sleep(2000);
	    women.click();
	  	System.out.println("Women is Clicked");
	  	
		//for setting the focus
	  //	new Actions(driver).moveToElement(driver.findElement(By.id("globalMastheadSignIn"))).build().perform(); // for setting the focus
	  //	Thread.sleep(50000);
//	  	driver.findElement(By.id("globalMastheadSignIn")).click();
	  	
		//WebElement coat=driver.findElement(By.xpath("(//a[contains(text(),'Coats')])[5]"));
	  	
	  	WebElement coat=driver.findElement(By.xpath("//div[@id='localNavigationContainer']/ul[@id='firstNavSubCat']//li//a[text()='Coats']"));
	  	
	  	//WebElement dresses=driver.findElement(By.xpath("(//div[@id='localNavigationContainer']/ul[@id='firstNavSubCat']/li[3]/ul/li[3]/a"));
	  	  	
	  	Thread.sleep(4000);
		
	  	//dresses.click();
		coat.click();
		System.out.println("Clicked on Coats");
			
		Thread.sleep(5000);
			
			/*WebElement check=driver.findElementByXPath("//span[@id='count_FABRIC_Cotton']");
			check.click();
			System.out.println("check clicked");*/
			

			 //calling dropdown method 
			  
			try{
			//dropdown("//select[@id='sortBy']",1);
			dropdown(driver, "//select[@id='sortBy']",2);
			
			}			
			catch (Exception e) {
				System.out.println("Exception : "+e);
				System.out.println("Exception : "+e.getMessage());
			}
						
			// calling show drop down 
			try {
				
				showdrop("ppp",1); //here ppp is the id when did inspect element 
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("showdrop exception : "+e.getMessage());
			}
			
			
			
			/*dropdowns
			
			Select show= new Select (driver.findElement(By.id("ppp")));
			System.out.println("Size is------>"+show.getOptions().size());
    		
			
			Select made1 = new Select(driver.findElementByXPath("//select[@id='sortBy']"));
			made1.selectByIndex(1);
			System.out.println("Size of Sortby dropdown is:"+made1.getOptions().size());
			   
			show= new Select (driver.findElement(By.id("ppp")));
			System.out.println("Size is show dropdown is :"+show.getOptions().size());
			show.selectByIndex(0);
					 	
			//show.selectByIndex(show.getOptions().size()-1);
				
			System.out.println(" sort by and show dropdowns are done");*/
			
			
			
			/*WebElement drop=driver.findElementById("sortBy");
			drop.click();
			
			Select fill = new Select(driver.findElementByXPath("//select[@ id='sortBy']//option[@value='BEST_SELLERS']"));
			fill.getAllSelectedOptions();
			*/
					
		}
		
		
		 private void assertEquals(String string, String messageText) {
			// TODO Auto-generated method stub
			
		}

		// methods for  For dropdown
		
		public void dropdown(WebDriver driver, String xpath,int index)
		 { 
		  		
			System.out.println("dropdown : : : : \n xpath : "+xpath+"\n index : "+index);
			
			try{
			Select made1 = new Select(driver.findElement(By.xpath(xpath)));
			Thread.sleep(3000);
			made1.selectByIndex(index);
			Thread.sleep(4000);
			
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
			Thread.sleep(3000);
			System.out.println("The id is "+id);
			show.selectByIndex(index);
			Thread.sleep(4000);
			
			}
			
			catch (Exception e) {
				System.out.println("showdrop : Exception : "+e);
				System.out.println("showdrop : Exception : "+e.getMessage());
			}
	}
	

}

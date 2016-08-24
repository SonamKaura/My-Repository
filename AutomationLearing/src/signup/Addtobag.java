	package signup;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public class Addtobag {
	private static final int index = 0;
	public static RemoteControlConfiguration rc;
	//public static FirefoxDriver driver = new FirefoxDriver();
	WebDriver driver;
	@BeforeTest
	public void testSetUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		*/
		/*WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
		 */
	}
	@Test
	public void testSearch(WebDriver driver) throws InterruptedException
	{
	//Search
		WebElement search=driver.findElement(By.id("globalSearchInputField"));
		search.click();
		//search.sendKeys("606860");
		search.sendKeys("1489446");
		search.submit();
		Thread.sleep(5000);
		//Mouse Over
		System.out.println("Executing");
		//Actions actions = new Actions(driver);
		//selecting the color
		//WebElement mk=driver.findElement(By.xpath("//li[@title='Vanilla Logo/Gold']/img"));
		//System.out.println("***************"+mk.getText());
		//actions.moveToElement(mk).build().perform();
		//actions.click();
		WebElement quantity = driver.findElement(By.xpath("//div[@id='productDescription']/div[5]/div[1]/div[1]/select[@id='productQuantity']"));		
		System.out.println("quantity of add to bag is "+quantity);
		Select sel1 = new Select(quantity);
		sel1.selectByIndex(2);
		Thread.sleep(3000);
		/*Select qty=new Select(driver.findElement(By.id("productQuantity")));
		qty.selectByVisibleText("2");
		System.out.println("Quantity Selected");*/
		// Add to bag
		WebElement addtobag=driver.findElement(By.xpath("//div[@id='pdpButtons']/img[@class='addToBagButton']"));
		addtobag.click();
		System.out.println("Add to bag clicked");
		Thread.sleep(9000);
		// checkout
		WebElement checkout = driver.findElement(By.xpath("//div[@class='ftButtons']/a[2]/img"));
		checkout.click();
		System.out.println("Checkout done");
		Thread.sleep(5000);
			try
			{
				//updating the quantity on my bag page of the any 1st Product
				Select qtynew1=new Select(driver.findElement(By.xpath("//div[@id='itemsContainer']/div[2]/div[@class='colQty']/select")));
				qtynew1.selectByIndex(4);
			System.out.println("Quantity updated");
			Thread.sleep(9000);
			}
			catch (Exception e) {
				System.out.println("Exception : "+e);
				System.out.println("Exception : "+e.getMessage());
			}
		// Moving the product to Wish List on "My Bag Page"
		WebElement moveToWishlist=driver.findElement(By.xpath("//div[@id='itemsContainer']/div[2]/div[12]/div[2]/div[1]"));
		moveToWishlist.click();
		System.out.println("Moved to Wish List");
		Thread.sleep(3000);
		WebElement myaccount=driver.findElement(By.id("href_myAccountHeader"));
	    myaccount.click();
	    System.out.println("My Account clicked");
	    Thread.sleep(10000);
	    WebElement myWishList=driver.findElement(By.xpath("//div[@id='globalContentContainer']/div/aside/ul/li[6]/a"));
	    myWishList.click();
	    System.out.println("My Wishlist clicked");
	    Thread.sleep(8000);
	    //Add to Bag
	    WebElement addtobagwishlist=driver.findElement(By.xpath("//input[@alt='Add to Bag']"));
	    addtobagwishlist.click();
	    System.out.println("Add to Bag whishlist_Clicked");
	    Thread.sleep(3000);
	    //checkout
	    WebElement checkoutwishlist=driver.findElement(By.xpath("//div[@class='ftButtons']/img[2]"));
	    checkoutwishlist.click();
	    System.out.println("Wishlist checkout clicked");
	    Thread.sleep(4000);
	   	//Removing the Element on "My Bag Page"
	    WebElement remove=driver.findElement(By.xpath("//div[@id='itemsContainer']/div[2]/descendant::div[text()='Remove']"));
	    remove.click();
	    System.out.println("Element Removed");
			}
	   		private Select Select(WebElement findElementById) 
      		{
   			// TODO Auto-generated method stub
   			return null;
      		}
				}

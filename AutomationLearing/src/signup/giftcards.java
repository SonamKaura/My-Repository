package signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.Utility;


public class giftcards {
	
	public static RemoteControlConfiguration rc;
	WebDriver driver;

	//public static FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeTest
	
	public void testSetUp()
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("Country Changed");
			
	
	}
	
	@Test
	
	public void giftcards_addtobag(WebDriver driver1) throws InterruptedException
	{
	/*//Login
		System.out.println("Login Started");
		WebElement singnin=driver.findElement(By.id("globalMastheadSignIn"));
		singnin.click();
		
		WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("binakalia@gmail.com");
	       
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("aryanbhola");
	       
	    WebElement singnin2=driver.findElement(By.id("signInBtn"));
	    singnin2.click();*/
	       
	     //Giftcards
		//*[@id='row3_column1']/map/area[3]
		WebElement giftcards=driver1.findElement(By.id("giftCards"));
		giftcards.click();
		System.out.println("giftscards clicked");
		Thread.sleep(8000);
		//driver.navigate().refresh();
		Thread.sleep(10000);
		try
		{
		System.out.println("Giftcards started");
		//WebElement egifts=driver1.findElement(By.xpath("//*[@id='row4_column1']/map/area[3]"));
		//WebElement birthdaygiftcards=driver.findElement((By.xpath("//ul[@id='firstNavSubCat']/li[2]/ul/li/a[contains (text(),'Birthday')]")));
		WebElement egifts=driver1.findElement(By.xpath("//div[@id='localNavigationContainer']/ul/li[1]/ul/li/a"));
		egifts.click();
		System.out.println("egifts is clicked");
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is :" +e);
			}
		WebElement gifts=driver1.findElement(By.xpath("//span[@class='yui-carousel-button yui-carousel-next-button']"));
		gifts.click();
		System.out.println("Next button is clicked");
		Thread.sleep(8000);
			//checking the mothers day checkbox
				WebElement check=driver1.findElement(By.xpath("//ul[@class='defaultFacet']/descendant::li[9]/span[1]"));
				check.click();
				System.out.println("Mothers days checkbox clicked");
				Thread.sleep(8000);
				System.out.println("Executed");
				System.out.println("sortby dropdown started");
				try{
				//since we have defined the method in the Utility class so here when we are calling it we will call by
				//Utility.methodname() ie Utility.sortdropdown()
				// we are passing driver 1 here coz we are passing driver in utitily class and in this class we are using driver1 so "driver1" is  passed	
				Utility.sortdropdown(driver1,"//select[@id='sortBy']",4);	
				}catch (Exception e) {
					System.out.println("========="+e.getMessage());
				}
				System.out.println("sort by drop down completed");
				Thread.sleep(10000);
				System.out.println("show dropdown started");
				//since we have defined the method in the Utility class so here when we are calling it we will call by
				//Utility.methodname() ie Utility.show()
				Utility.show( driver1,"//select [@id='ppp']",2);
				System.out.println("show dropdown completed ");
				Thread.sleep(9000);
				/*WebElement cross=driver.findElementByXPath("//div[@id='facetItems']/span/img[@id='OCCASION']");
				cross.click();*/
				//clicking the "mothers day giftcard" names "Spring Floral E- Gift Card" ie
				//giftcards>egiftcard>mothersday>Spring Floral E- Gift Card
				/*WebElement springfloral=driver.findElement(By.xpath("//div[@id='thumbnails']/div[2]/descendant::div[@class='shortDescription']/a"));
				springfloral.click();
				*/
				WebElement FirstProduct=driver1.findElement(By.xpath("//div[@id='macysGlobalLayout']/div[1]/ul/li[1]"));
				FirstProduct.click();
				Thread.sleep(6000);
				WebElement enter_amount=driver1.findElement(By.id("amount"));
				enter_amount.sendKeys("50");
				WebElement recipient_email =driver1.findElement(By.id("email"));
				recipient_email.sendKeys("sonamkalia512@gmail.com");
				WebElement msg1 =driver1.findElement(By.id("toMessage"));
				msg1.sendKeys("sonam51284@gmail.com");
				WebElement msg2 =driver1.findElement(By.id("message"));
				msg2.sendKeys("TestMessage");
				WebElement msg3 =driver1.findElement(By.id("fromMessage"));
				msg3.sendKeys("binakalia1234@gmail.com");
				WebElement addtobag=driver1.findElement(By.xpath("//img[@class='addToBagButton']"));
				addtobag.click();
				System.out.println("Add to Bag clicked");
				Thread.sleep(8000);
				WebElement checkout=driver1.findElement(By.id("btnCheckout"));
				checkout.click();
				Thread.sleep(8000);
				// Id of Welcome, Sonam		
				WebElement againlogin=driver1.findElement(By.xpath("//li/a[@id='globalMastheadUserSalutation']"));
				// Id of Welcome, Sonam
				String str1=againlogin.getText();
				System.out.println("Str1 is :"+str1);
				String str2="";
				if(str1.equalsIgnoreCase(str2)){
					WebElement checkout2=driver1.findElement(By.id("continueCheckout"));
					checkout2.click();
					Thread.sleep(6000);
					try
					{
						WebElement email1 = driver1.findElement(By.id("email"));
						email1.clear();
						email1.sendKeys("binakalia@gmail.com");
				        WebElement password1 = driver1.findElement(By.id("password"));
				        password1.sendKeys("aryanbhola");
				        WebElement singnin1=driver1.findElement(By.id("signInBtn"));
				       singnin1.click();
					}
					catch (Exception e) {
						System.out.println("========="+e.getMessage());
					}
				}
				else
				{
					WebElement checkout2=driver1.findElement(By.id("continueCheckout"));
					checkout2.click();
					Thread.sleep(15000);
					System.out.println("ContinueCheckout2 Click");
					WebElement countinue=driver1.findElement(By.id("submit"));
					countinue.click();
					System.out.println("Final continue is clicked");
				}
				
				/*WebElement continueCheckout=driver.findElementById("continueCheckout");
				continueCheckout.click();*/
			}
	private void If(Object object) {
		// TODO Auto-generated method stub
		
	}

	// Sort_By Dropdown
/*public void sortdropdown(String xpath, int index)
{
	try{
		Select made1 = new Select(driver.findElement(By.xpath(xpath)));
		made1.selectByIndex(index);
		}
		catch (Exception e) {
			System.out.println("dropdown : Exception : "+e);
			System.out.println("dropdown : Exception : "+e.getMessage());
		}
}
// Show Drop down
public void show( String xpath,int index)
{
	try
	{
		Select show1=new Select (driver.findElement(By.xpath(xpath)));
		show1.selectByIndex(index);
		//select [@id='ppp']			
	}
	catch(Exception e)
	{
		System.out.println("show dropdown exception:"+e);
		System.out.println("show dropdown exception:"+e.getMessage());
	}
}*/

}

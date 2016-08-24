package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radio_Buttons {
	
	public static RemoteControlConfiguration rc;
	
	public static FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void testSetUp()
	{
		
		driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		
		WebElement close=driver.findElement(By.id("closeButton"));
		close.click();
		

		WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		newsite.click();
		System.out.println("kkkkkkkkkkkkkkkkkk");
	
	}
	
	@Test
	
	public void testSearch() throws InterruptedException	
	{
			//#Singn Up
	
		driver.findElement(By.id("globalMastheadSignIn"));

		WebElement signin = driver.findElement(By.id("globalMastheadSignIn"));
		signin.click();
		
		WebElement create = driver.findElement(By.id("createAccount"));
		create.click();
		
		System.out.println("Account Created");
		
		// Radio Buttons
		
		/*WebElement radio =driver.findElement(By.xpath("//input[@id='emailSalesEvents']"));
		
		if(radio.isSelected())
		{
		radio.click();
		}
		//Verify Radiobutton is selected
		assertTrue(radio.isSelected());
		System.out.println("Radiobutton is selected");*/
		
		//Selecting another radio button
		
		System.out.println("Radio started");
		try
		{
		
		//Select radio2=new Select(driver.findElementByXPath("////label[@class='fontSize12']/input[@id='emailSalesEvents']"));
		WebElement radio2 =driver.findElement(By.xpath("//label[@class='fontSize12']/input[@id='emailSalesEvents']"));
		radio2.click();

		}	
		
		catch (Exception e) {
			System.out.println("Exception : "+e);
			System.out.println("Exception : "+e.getMessage());
		}
		System.out.println("RadioEnd");
		

		
	}

	private void assertTrue(boolean selected) {
		// TODO Auto-generated method stub
		
	}
	

}

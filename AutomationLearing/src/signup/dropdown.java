package signup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.junit.Assert;;

public class dropdown {
	
	
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
			Listarray();
			
		}
			
			void Listarray()
			{
			
			//Dropdowns
			
			Select make = new Select(driver.findElement(By.name("gender")));
			
			//Verify Dropdown does not support multiple selection
			assertFalse(make.isMultiple());
			System.out.println("does not support multiple selection");
			
			//Verify Dropdown has 2 options for selection
//			assertEquals(2, make.getOptions().size());
			System.out.println("Dropdown has 2 options for selection");
			
			Select gen=new Select(driver.findElement(By.id("gender")));
			gen.selectByVisibleText("Female");
		
	
	//We will verify Dropdown has expected values as listed in a array
		
	List<String> exp_options = Arrays.asList(new String[]{"Select One","Female","Male"}); // from these options are will compare our UI values ie "Male","Female"
	List<String> act_options = new ArrayList<String>();
			for(WebElement option : make.getOptions())
			{
				act_options.add(option.getText()); // through "add" we are adding the values(ie male and female that are rendering in run time through gettext()
													//in the list act_options
				System.out.println(act_options);
			}
			
			assertEquals(exp_options, act_options);// this is for verification that expected options(ieexp_options) is equal to Actual Options(act_options)
			
			
			//Verify expected options array and actual options array match
			 assertEquals(exp_options.toArray(),act_options.toArray());
			 System.out.println("Expected and Actual Array Matches");
			 
			                //OR
			//With Select class we can select an option in Dropdown using Visible Text
			make.selectByVisibleText("Male");
			assertEquals("Male", make.getFirstSelectedOption().getText());
			System.out.println("male is found");
			
							//OR
			
			//Verify expected options array and actual options array match
			
			assertArrayEquals(exp_options.toArray(),act_options.toArray());
			System.out.println("Expected and Actual Array matches");
			
							//OR
			
			//With Select class we can select an option in Dropdown using Visible Text
			
			make.selectByVisibleText("Female");
			assertEquals("Female", make.getFirstSelectedOption().getText());
			System.out.println("***************: This is the selected option");
			
			
							//OR
			
			//or we can select an option in Dropdown using value attribute
			make.selectByValue("Male");
			assertEquals("Male", make.getFirstSelectedOption().getText());
			System.out.println("This is first selected option");
			}
			
		
			


			private void assertArrayEquals(Object[] array, Object[] array2) {
				// TODO Auto-generated method stub
				
			}


			private void assertEquals(String string, String text) {
				// TODO Auto-generated method stub
				
			}


			private void assertEquals(Object[] array, Object[] array2) {
				// TODO Auto-generated method stub
				
			}


			private void assertFalse(boolean multiple) {
				// TODO Auto-generated method stub
				
			}


			private void assertEquals(List<String> exp_options,
					List<String> act_options) {
				// TODO Auto-generated method stub
				
			}
					




}

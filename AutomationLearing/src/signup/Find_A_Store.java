package signup;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Find_A_Store {
	
	private static final int index = 0;

	public static RemoteControlConfiguration rc;
	
	//public static FirefoxDriver driver = new FirefoxDriver();
	
	//WebDriver driver;
	
	@BeforeTest
	/*public void testSetUp()
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
	}*/
	
	@Test
	public void storesearch(WebDriver driver) throws InterruptedException
	{
		WebElement store=driver.findElement(By.xpath("//a[@id='stores']"));
		store.click();
		System.out.println("Stores clicked");
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.xpath("//img[@id='search-nowBtn']"));
		search.click();
		System.out.println("Search is clicked");
		Thread.sleep(8000);
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='searchField']"));
		searchfield.click();
		System.out.println("Search field is clicked");
		searchfield.sendKeys("Phoenix");
		WebElement searchstore=driver.findElement(By.xpath("//span[@id='searchStore']"));
		searchstore.click();
		System.out.println("Search store clicked");
		Thread.sleep(9000);
		WebElement more=driver.findElement(By.xpath("//ul[@id='store-list']/li[1]/div/div[3]/span[@class='store-more']"));
		more.click();
		System.out.println("More clicked");
		Thread.sleep(3000);
		WebElement less=driver.findElement(By.xpath("//ul[@id='store-list']/li[1]/div/div[3]/span[@class='store-more']"));
		less.click();
			}
}
	
	
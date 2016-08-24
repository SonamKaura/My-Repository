package taran;
	
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

	public class TaranTest {
	 WebDriver driver ;
	 @Test
	   @Parameters("browser")

	     
	 public void method(String u) throws InterruptedException{
	     if (u.equals("firefox"))
	       {
	      driver=new FirefoxDriver();
	      
	     
	     }
	     else if (u.equals("chrome"))
	     {
	    	 System.setProperty("webdriver.chrome.driver",
				"D://IMPTASPECTS//Selenium Learning//chromedriver_win32//chromedriver.exe");
				 driver = new ChromeDriver();
	     //driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	     }
	     driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	     driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='bluemenu']//li[6]/a")).click();
	  String Parent=driver.getWindowHandle();
	  Set<String> All=driver.getWindowHandles();
	  for(String s:All){
	   if(s.equals(Parent)==false)
	   {
	    driver.switchTo().window(s);
	    break;
	   }
	  }
	  driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("Delhi");
	  driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(Keys.ARROW_DOWN);
	  driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Jaipur");
	  driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(Keys.ARROW_DOWN);
	  driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='departDate']/following-sibling::img")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[4]//a")).click();
	  Thread.sleep(2000);
	  Select select=new Select(driver.findElement(By.xpath("//select[@id='noOfAdult']")));
	  //select.selectByVisibleText("3");
	  select.getOptions().get(1).click();
	  Thread.sleep(2000);
	    Select select1=new Select(driver.findElement(By.xpath("//select[@id='noOfChild']")));
	  select1.getOptions().get(1).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='submitVal']/following-sibling::div")).click();
	  List <WebElement> weblist = driver.findElements(By.xpath("//div[@id='flightListResult']/div"));
	  int size = weblist.size();
	  System.out.println(size);
	 
	  
	Assert.assertEquals(52,size);
	System.out.println("Result is same i.e. "+size);
	 }

	}



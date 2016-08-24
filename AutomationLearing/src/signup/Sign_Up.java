package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sign_Up

{
	
	private static final int index = 0;
	public static RemoteControlConfiguration rc;

	WebDriver driver;
	

	/*@BeforeTest
	public void testSetUp()
	{
		
		driver.get("https://www.macys.com");
	}
	
	@AfterTest
	public void testClose()
	{
		//WebElement close=driver.findElement(By.id("closeButton"));
		//close.click();
		driver.close();
	}
	*/
	@BeforeTest
	public void before()throws  InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.macys.com");
	driver.manage().window().maximize();
	
	/*WebElement close=driver.findElement(By.id("closeButton"));
	close.click();
	
	WebElement newsite=driver.findElement(By.id("href_changeCountry"));
	newsite.click();
	System.out.println("Country Changed");*/
	
	}
	
	@Test
	public void singnup(WebDriver driver)throws InterruptedException
	{
	
	driver.findElement(By.id("globalMastheadSignIn"));
	WebElement signin = driver.findElement(By.id("globalMastheadSignIn"));
	signin.click();
	Thread.sleep(20000);
	WebElement create = driver.findElement(By.id("createProfileContainer"));
	create.click();
	Thread.sleep(5000);
	WebElement firstname=driver.findElement(By.id("firstName"));;
	firstname.click();
	firstname.sendKeys("Sonam");
//	//input[@id='addressVB.lastName']
	WebElement secondname=driver.findElement(By.id("lastName"));
	secondname.click();
	secondname.sendKeys("Kalia");
	WebElement add1=driver.findElement(By.id("addressLine1"));
	add1.click();
	add1.sendKeys("1661 West Blay Lock Drive");
	//	//input[@id='addressVB.addressLine2']
	WebElement add2=driver.findElement(By.id("addressLine2"));
	add2.click();
	add2.sendKeys("1661 West Blay Lock Drive");
	WebElement city=driver.findElement(By.id("city"));
	city.click();
    city.sendKeys("Phoenix");
    // To randomly select the state
	Select select=new Select(driver.findElement(By.id("state")));
    String state="Florida";
    select.selectByVisibleText(state);
    
   // driver.findElement(By.xpath("//select[@id='addressVB.state']//option[@text()='"+state+"']")).sendKeys(Keys.ENTER);
   	
	/*//int Count = driver.findElements(By.xpath("//select[@id='addressVB.state']")).size();[For the size ]
	// while loop for making the text is dropdown visible one by one
    
    while(Count>0){
	make.selectByIndex(Count);
	Count++;
	System.out.println("SSSSSSSSSSSSSSSonam" +Count);
	}
	System.out.println(Count);
    
    //select.selectByVisibleText("Birth date");
*/    
	WebElement zipcode=driver.findElement(By.id("zipcode"));
	zipcode.click();
	zipcode.sendKeys("85085");
    Select month=new Select(driver.findElement(By.id("month")));
    month.selectByVisibleText("January");
    
    Select date=new Select(driver.findElement(By.id("date")));
    date.selectByIndex(2);
    Select year=new Select(driver.findElement(By.id("year")));
    year.selectByIndex(2);
    //driver.findElementByXPath("//select[@id='userBirthDate.month']//option [@value='1']").sendKeys(Keys.ENTER);
    /*select.selectByVisibleText("Date");
    select.selectByVisibleText("Year");
    */
    System.out.println("done");
     // driver.findElementByXPath("//select [@id='userBirthDate.month']/option [@value='2']").sendKeys(Keys.ENTER);
	Thread.sleep(4000);	
	Select gen=new Select(driver.findElement(By.xpath("	//select[@id='gender']")));
	gen.selectByVisibleText("Female");
	WebElement email=driver.findElement(By.id("email"));
	email.click();
	email.sendKeys("kalia_sonam@yahoo.co.in");
	WebElement verifyemail=driver.findElement(By.id("createConfirmEmail"));
	verifyemail.click();
	verifyemail.sendKeys("kalia_sonam@yahoo.co.in");
	WebElement password=driver.findElement(By.id("password"));
	password.click();
	password.sendKeys("Secretpower5");
	WebElement verifypassword=driver.findElement(By.id("confirmPassword"));
	verifypassword.click();
	verifypassword.sendKeys("Secretpower5");
	Select secure=new Select(driver.findElement(By.id("SecurityQna")));
	//String security=("What was the first concert you attended?");
	secure.selectByIndex(2);		
	WebElement answer=driver.findElement(By.id("securityAns"));
    answer.click();
	answer.sendKeys("Euphoria");
	Thread.sleep(3000);
	WebElement create_profile=driver.findElement(By.id("createProfileBtn"));
	create_profile.click();
	System.out.println("profile created");
	Thread.sleep(10000);
	
	// Update the Profile
		WebElement signin1 = driver.findElement(By.id("globalMastheadSignIn"));
		signin1.click();
		Thread.sleep(5000);
		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("binakalia@gmail.com");
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("aryanbhola");
		WebElement singnin2=driver.findElement(By.id("signInBtn"));
		singnin2.click();
        Thread.sleep(8000);
       
       // My Account
       WebElement myaccount=driver.findElement(By.id("href_myAccountHeader"));
       myaccount.click();
       Thread.sleep(10000);
       //My Profile
       //WebElement profile=driver.findElementById(" //a[text()='My Profile']");
       System.out.println("profile");
       WebElement profile = driver.findElement(By.xpath("//a[text()='My Profile']"));
       System.out.println("profile completed");
       profile.click();
       Thread.sleep(8000);
       WebElement secondname1=driver.findElement(By.id("lastName"));
       secondname1.click();
       Thread.sleep(5000);
       secondname1.clear();
      // driver.findElement(By.xpath("//input[@id='addressVB.lastName']")).getAttribute("KauraKalia").equals("");
       System.out.println("last name is blank");
       Thread.sleep(8000);
       secondname1.sendKeys("Dhruv");
       Thread.sleep(3000);
       WebElement update=driver.findElement(By.xpath("//*[@id='updateProfileBtn']"));
       update.click();
       System.out.println("update done");
       System.out.println("======singup end =======");
	}

private static void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	
}


private static void assertEquals(int i, int j) {
	// TODO Auto-generated method stub
	
}


private static void sleep(int i) {
	// TODO Auto-generated method stub
	
}

}
	
	
	
	
	
	
	
	
	
	
	

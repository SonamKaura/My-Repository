package signup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.List;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import com.utils.Utility;

public class BeautyandQuickView {

	private static final int index = 0;

	public static RemoteControlConfiguration rc;

	// public static FirefoxDriver driver = new FirefoxDriver();

	WebDriver driver;

	// private int 50;

	// declaration of class variable
	private int rowCount;

	@BeforeTest
	public void testSetUp() throws InterruptedException

	{

		// Code to run on IE Browser

		/*
		 * File file = new File("C://IeDriver/IEDriverServer.exe");
		 * System.setProperty("webdriver.ie.driver" ,file.getAbsolutePath());
		 * driver = new InternetExplorerDriver();
		 */
		// code to run on Chrome
		System.setProperty("webdriver.chrome.driver",
				"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com");
		driver.manage().window().maximize();
		
/*
		Utility.sign_in(driver);
		Thread.sleep(20000);
		*/
		
		/*
		 * Thread.sleep(2000); try { WebElement
		 * close=driver.findElement(By.xpath("//a[@id='closeButton']"));
		 * Thread.sleep(2000); close.click(); }
		 * 
		 * catch(Exception e)
		 * 
		 * { System.out.println("Exception is"+e);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * WebElement newsite=driver.findElement(By.id("href_changeCountry"));
		 * newsite.click();
		 * 
		 * // have to click on the link "go to us site" manually
		 * 
		 * System.out.println("Country Changed");
		 * 
		 * Thread.sleep(8000);
		 */
	}

	@Test
	public WebDriver testBeautyCheckout(WebDriver driver)
			throws InterruptedException

	{
		try {
			M1(driver);
		}

		catch (Exception e) {
			System.out.println("Exception is :" + e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}

	private char[] assertTrue(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	private void sysassertTrue(String text) {
		// TODO Auto-generated method stub

	}

	private int parseInt(String verifyprice) {
		// TODO Auto-generated method stub
		return 0;
	}

	// created a local method to be used in deals and promo class coz we need to
	// use this method in deals and promotions class

	public void M1(WebDriver driver) throws InterruptedException {

		/*
		 * //bag clear: WebElement bag =
		 * driver.findElement(By.xpath("//a[@id='checkoutLink']/span[2]"));Saved
		 * content settings and search engines will not be cleared and may
		 * reflect your browsing habits.
		 * 
		 * bag.clear(); Thread.sleep(8000);
		 * 
		 * */
		
		WebElement beauty = driver.findElement(By
				.xpath("//div[@id='globalMastheadCategoryMenu']/ul/li[7]/a"));
		Thread.sleep(4000);
		beauty.click();
		System.out.println("Beauty Clicked");
		Thread.sleep(9000);
		// Setting the focus on MAC new
		// Actions(driver).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'MAC')])[2]"))).perform();
		// WebElement MAC =
		// driver.findElement(By.xpath("//ul[@id='firstNavSubCat']/li[5]/ul/li[9]"));
		WebElement MAC = driver
				.findElement(By
						.xpath("//ul[@id='firstNavSubCat']//li//ul//li[9]//a[contains(text(),'MAC')]"));
		MAC.click();
		System.out.println("MAC Clicked");
		Thread.sleep(8000);
		// Quick View and Mouse Over
		// Mouse over to Quick View Xpath
		try {
			Actions action = new Actions(driver);
			WebElement product1 = driver.findElement(By
					.xpath("//ul[@id='weRecommendThumbnails']/li[1]/img"));
			action.moveToElement(product1);
			action.perform();
			System.out.println("Mouse Over done");

			// Quick View (xpath)
			WebElement quickview = driver.findElement(By
					.xpath("////ul[@id='weRecommendThumbnails']/li[1]/img"));
			quickview.click();
			System.out.println("View Clicked");
			Thread.sleep(4000);

			// closing the popup
			WebElement close = driver.findElement(By
					.xpath("//a[@class='container-close']"));
			close.click();
		} catch (Exception e) {
			System.out.println("Exception is " + e);
		}
		// clicking on MAC product
		WebElement product = driver
				.findElement(By
						.xpath("//div[@id='browse_womens_default_product']/ul/li[1]/div[1]/div[2]/div/a"));
		product.click();
		Thread.sleep(32000);
		System.out.println("product clicked");
		WebElement chooseitems =null;
		try{
		chooseitems = driver.findElement(By
					.xpath("//div[@id='viewCollectionItemsButton']/a/img"));
		}catch (Exception e) {
			System.out.println("Exception in chooseitems : "+e.getMessage());
		}
		System.out.println("Choose items is "+chooseitems);
		if ((null!=chooseitems) && (chooseitems.isDisplayed())) {
			// below is the xpath of the whole row of products under choose ur
			// items tab
		
			rowCount = driver
					.findElements(
							By.xpath("//div[@id='memberProductList']/h2/following-sibling::div"))
					.size();
			System.out.println("Row Count is " + rowCount);
			Thread.sleep(4000);
			if (rowCount > 0) {
				// for loop to count how many times color container is coming
				// and i for how many times the
				// product container will be visible and actions will be
				// performed in it.
				for (int i = 1; i <= rowCount; i++) {
					System.out.println("i : " + i);
					String s = "colorSelection";
					// below is the xpath(dynamic) of color selection box
					String h = driver.findElement(By.xpath("//div[@id='memberProductList']/div[" + i+ "]/div[2]/div[2]")).getAttribute("class");
					// it will get the class name dynamically ie it in this the class is "colorSelection"(if we look through the
					// xpath)also +i+ is for conactionation also getAttribute("class")=gives color selection thats y we are comparing with s
					System.out.println("=============================");
					System.out.println("h=" + h);
					Thread.sleep(8000);
					if (s.equals(h)) {
						// below is the xpath(dynamic) of the selection of the color
						WebElement text = driver.findElement(By.xpath("//div[@id='memberProductList']/div["+ i+ "]/descendant::div[1]/following::div[1]//ul/li[1]/img"));
						text.click();
					} 
					else {
						System.out.println("No color selection box is present ");
					}
					WebElement qty = driver.findElement(By.xpath("//div[@id='memberProductList']/div[" + i+ "]/div[4]/descendant::select/option[2]"));
					qty.click();
					System.out.println("qtyclicked");
					WebElement addtobag = driver.findElement(By.xpath("//div[@id='memberProductList']/div[" + i+ "]/div[4]/img"));
					addtobag.click();
					System.out.println("addtobagclick");
					Thread.sleep(4000);
					driver.findElement(By.xpath("//div[@id='pdpMasterAddToBagPanel']/div[2]/img[2]")).click();
					System.out.println("add_to_bag_checkoutclicked");
					Thread.sleep(4000);
					Thread.sleep(8000);
					// obj.sign_in(driver);
					// This will be implemented if clicking on next product ie keep shooping>mac>product clicked, if it is the same
					// product as last one then uncomment this
					/*
					 * if (i==rowCount) {
					 * System.out.println("inside i = rowcount"); WebElement
					 * checkout =
					 * driver.findElement(By.xpath("//img[@id='continueCheckout']"
					 * )); System.out.println("Checkout done" +checkout);
					 * checkout.click(); Thread.sleep(5000); finalcheckout();
					 * System.out.println("Final Checkout done");
					 * 
					 * }
					 */
					// if 2 product is added
					if (i == 2) {
						System.out.println("Value of i==" + i);
						
						int rowcount11;
						//WebElement rowcount1=driver.findElement(By.xpath("//div[@id='itemsContainer']"));
						
						rowcount11=driver.findElements(By.xpath("//div[@id='itemsContainer']//div[@class = 'lineItem dashedResgistryLine']")).size();
						System.out.println("Row count is "+rowcount11);
						// j loop is for the no of items added in the bag and rowcount11 is to calculate the size of the whole row
						for (int j=1;j<=rowcount11;j++)
						{
							System.out.println("j:"+j);
							//this is the dynamic xpath of the each row of the bag where the product is there
							String prefixXPath = "//div[@id='itemsContainer']//div[@class = 'lineItem dashedResgistryLine']["+j+"]";
							System.out.println("prefixXPath:"+prefixXPath);
							//xpath of the bonus
							WebElement bonus = Utility.getElement(driver,prefixXPath + "//div[contains(text(),'Bonus offer')]");
							System.out.println("bonus is "+bonus);
							if (bonus != null && bonus.isDisplayed()) {
								// WebElement
								// bonusselect=driver.findElement((By.xpath("//select[@class='attrChoice']/option[2]")));
								
									// WebElement
									// bonusselect=driver.findElement((By.xpath("//select[@class='attrChoice']/option[2]")));
									String bonustext = bonus.getText();
									System.out.println("bonus text is : " + bonustext);
								    Select bonusselect = new Select(driver.findElement(By.className("attrChoice")));
									bonusselect.selectByIndex(1);
									System.out.println("Bonus is selected");
								
								/*if (null != bonus) {
									String bonustext = bonus.getText();
									System.out.println("bonus text is : " + bonustext);
								}*/
								
							   /* Select bonusselect = new Select(driver.findElement(By.className("attrChoice")));*/
								/*WebElement bonusDropdown = Utility.getElement(driver,prefixXPath + "//select");
								System.out.println("bonusDropdown is "+bonusDropdown.getText());*/
								/*if(bonusDropdown != null){
									Select bonusselect = new Select(driver.findElement(By.xpath(prefixXPath + "//select")));
									
									System.out.println("bonusselect : " + bonusselect.toString());
									List<WebElement> options= bonusselect.getOptions();
									for(WebElement option: options){
										System.out.println("option :: " + option.getText());
									}
									bonusselect.selectByIndex(1);
									System.out.println("Bonus is selected");
								}*/
								
							}
							else
							{
								System.out.println("bonus is not displayed");
							}
							
							
							/*if (null != bonus) {
							String bonustext = bonus.getText();
							System.out.println("bonus text is : " + bonustext);
						*/
								/*if (bonus.isDisplayed()) {
								// WebElement
								// bonusselect=driver.findElement((By.xpath("//select[@class='attrChoice']/option[2]")));
								
							    Select bonusselect = new Select(driver.findElement(By.className("attrChoice")));
								bonusselect.selectByIndex(1);
								System.out.println("Bonus is selected");
								
							}*/
						}
						
						WebElement checkout = driver.findElement(By
								.xpath("//img[@id='continueCheckout']"));
						checkout.click();
						System.out.println("Checkout done");
						Thread.sleep(5000);
						finalcheckout(driver);
						System.out.println("Final Checkout done");
						break;
						}
			
					else {
						WebElement keepshopping = driver
								.findElement(By
										.xpath("//div[@class='bagContainer shoppingButtons']/img[1]"));
						keepshopping.click();
						System.out.println("Keep Shopping");

						Thread.sleep(8000);
						// mouse over on MAC
						/*
						 * Actions action1 = new Actions(driver); WebElement
						 * women = driver .findElement(By.xpath(
						 * "//ul[@id='firstNavSubCat']/li[5]/ul/li[9]/a"));
						 * action1.moveToElement(women).build().perform();
						 */
						// MAC checkbox
						WebElement checked = driver
								.findElement(By
										.xpath("//ul[@id='featuredBrands']/li[5]/span"));
						if (!checked.isSelected()) {
							checked.click();
							System.out.println("checked clicked");
							Thread.sleep(8000);
							Thread.sleep(8000);
						}

						WebElement productnew = driver
								.findElement(By
										.xpath("//div[@id='macysGlobalLayout']/div[1]/ul/li[1]/div/div[2]/a"));
						productnew.click();
						System.out.println("Productnew clicked");
						Thread.sleep(8000);
						

						int update_rowCount = driver
								.findElements(
										By.xpath("//div[@id='memberProductList']/h2/following-sibling::div"))
								.size();
						System.out.println("Updated row count is "
								+ update_rowCount);
						// This is when mac>another product is clicked then we
						// are checking whether choose item is displayed or not
						WebElement chooseitems1 = null;
						try {
							chooseitems1 = driver
									.findElement(By
											.xpath("//div[@id='viewCollectionItemsButton']/a/img"));
						} catch (Exception e) {
							// TODO: handle exception
						}
						if (null != chooseitems1) {
							if (chooseitems1.isDisplayed()) {
								System.out.println("loop continues");
							}
						}

						else {
							Addto_bag(driver);
							Thread.sleep(5000);
							finalcheckout(driver);
							break;
						}
					}
					// }
					/*
					 * else { Addto_bag(driver); }
					 */
				}

			}
		} else {
			// Selecting the 5 quantity ie Choose Item is not present
			Addto_bag(driver);
			Thread.sleep(8000);
			finalcheckout(driver);
		}
	}

	public void Addto_bag(WebDriver driver) throws InterruptedException {
		System.out.println("addToBag_beauty_started");
		WebElement colorselection=driver.findElement(By.xpath("//div[@id='productBox']/div[2]/div/ul/li[1]/img"));
		
		if (colorselection.isDisplayed())
		{
			colorselection.click();
			WebElement quantity = driver
			.findElement(By
					.xpath("//div[@id='productDescription']/div[5]/div[1]/div[1]/select[@id='productQuantity']"));
	System.out.println("quantuty is " + quantity);
	Select sel1 = new Select(quantity);
	sel1.selectByIndex(1);
	Thread.sleep(8000);
	System.out.println("Qty Clicked");
	WebElement addtobag = driver.findElement(By
			.xpath("//div[@id='pdpButtons']/img[@class='addToBagButton']"));
	addtobag.click();
	System.out.println("Add to Bag Clicked");
	Thread.sleep(2000);
	WebElement checkout = driver.findElement(By
			.xpath("//img[contains(@title,'Checkout')]"));
	checkout.click();
	System.out.println("Checkout done");
	Thread.sleep(5000);
	WebElement continuecheckout = driver
			.findElement(By
					.xpath("//div[@class='bagContainer shoppingButtons']/img[@id='continueCheckout']"));
	try {
		continuecheckout.click();
		System.out.println("continuecheckout done");
	} catch (Exception e) {
		System.out.println("Exception is " + e);
	}
		}
		else
		{
			WebElement quantity = driver
			.findElement(By
					.xpath("//div[@id='productDescription']/div[5]/div[1]/div[1]/select[@id='productQuantity']"));
	System.out.println("quantuty is " + quantity);
	Select sel1 = new Select(quantity);
	sel1.selectByIndex(1);
	Thread.sleep(8000);
	System.out.println("Qty Clicked");
	WebElement addtobag = driver.findElement(By
			.xpath("//div[@id='pdpButtons']/img[@class='addToBagButton']"));
	addtobag.click();
	System.out.println("Add to Bag Clicked");
	Thread.sleep(2000);
	WebElement checkout = driver.findElement(By
			.xpath("//img[contains(@title,'Checkout')]"));
	checkout.click();
	System.out.println("Checkout done");
	Thread.sleep(5000);
	WebElement continuecheckout = driver
			.findElement(By
					.xpath("//div[@class='bagContainer shoppingButtons']/img[@id='continueCheckout']"));
	try {
		continuecheckout.click();
		System.out.println("continuecheckout done");
	} catch (Exception e) {
		System.out.println("Exception is " + e);
	}
			
		}
		
	}

	public void finalcheckout(WebDriver driver) throws InterruptedException {
		System.out.println("Final Checkout Started");
		Thread.sleep(10000);
		String subtotal = driver.findElement(
				By.xpath("//span[@id='subTotalAmount']")).getText();
		// String subtotal =
		// driver.findElement(By.xpath("//div[@id='bagTotal']")).getText();
		System.out.println("subtotal is" + subtotal);

		// from gettext() we will gets subtotal value which is say $420, now
		// with the help of substring we can trim $ sign by
		// ie 1 indicates that string will start from 1 ie it will start from 4
		// till length ie 420 and so $ is trimmed
		// ie $420 is also calculated from index starting from 0 ie at 0th
		// position is $ and length is calculated from 1 ie 4 till lemgth which
		// is 420

		String subtotal2 = subtotal.substring(1, subtotal.length());

		System.out.println("Subtotal2 is :" + subtotal2);

		String subtotal3 = subtotal2.substring(0, subtotal2.indexOf("."));// with this line in subtotal we are getting 142.00
		//in order to trim .00 ie we are using this line ie starting from 0 till . will come in  subtoatal 3 ie subtotal 3 
		//will come as :142
		System.out.println("Subtotal3 is " + subtotal3);
		int price = 0;
		try {
			price = Integer.parseInt(subtotal3);
			System.out.println("Price is " + price);
		} catch (Exception e) {
			System.out.println("Exception is " + e);
		}
		// WebElement estimatedship =
		// driver.findElement(By.xpath("//div[@id='bagEstimatedShippingTotal']"));
		if (price >= 50) {
			System.out.println("Free Shiiping $50 and above");
		} else {
			try{
			WebElement backtobag=driver.findElement(By.xpath("//div[@id='doubleWidthColumnBtnWrapper']/div/a"));
			backtobag.click();
			}
			catch (Exception e)
			{
				System.out.println("Exception in chooseitems : "+e.getMessage());
			}
			WebElement qtynew = driver.findElement(By
					.xpath("//div[@class='colQty']/select"));
			Select selnew = new Select(qtynew);
			selnew.selectByIndex(3);
			System.out
					.println("Qty is selected to avail shipping for $50 and above");
		}
		Thread.sleep(3000);
		WebElement continuefinalcheckout = driver.findElement(By
				.xpath("//button[@id='submit']"));
		continuefinalcheckout.click();
		System.out.println("Final Checkout done");

	}

	private void assertTrue(boolean selected) {
		// TODO Auto-generated method stub
	}
}

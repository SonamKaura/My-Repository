package com.testing;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static InternetExplorerDriver driver;
	public static void main(){
//	public  InternetExplorerDriver driver = new InternetExplorerDriver();
		try{
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriver\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

package com.gspann.selenium;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.gspann.selenium.MyListener.class)
public class ListenerTest {
	@Test
	public void t1()
	{
		Assert.assertTrue(true,"");
	}
	@Test
	public void t2()
	{
		Assert.assertTrue(false,"");
	}

}

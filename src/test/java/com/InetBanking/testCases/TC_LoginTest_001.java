package com.InetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.InetBanking.PageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	
	public void logintest() throws IOException
	
	{
		driver.get(baseUrl);
		logger.info("url is opened");
		LoginPage lg=new LoginPage(driver);
		
		lg.setusername1(username);
		logger.info("Entered the username");
		lg.setpassword(password);
		logger.info("Entered pasword");
		lg.Submit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage12"))
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		
		else
		{
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Test failed");
		}
		
	}
}
	
	

package com.InetBanking.testCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.InetBanking.utilities.ReadConfig;

public class BaseClass {

	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseUrl=readconfig.getURL();
	public String username=readconfig.getUser();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	
	


	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
        driver=new FirefoxDriver();
        logger=Logger.getLogger("Inetbanking");
        PropertyConfigurator.configure("Log4j.properties");
     
	}
	
	
	
	

	@AfterClass
    public void teardown()
    {
    	driver.quit();
    }
	
	public void captureScreen(WebDriver driver,String tname)throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/ScreenShots/"+ tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	

}

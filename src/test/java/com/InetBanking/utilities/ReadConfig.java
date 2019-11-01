package com.InetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;


public ReadConfig()
{
	File src=new File("./Configurations/config.properties");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	}catch (Exception e)
	{
		System.out.println("Exception is"+e.getMessage());
	}
}

public String getURL()
{
	String baseurl=pro.getProperty("baseUrl");
	return baseurl;
}

public String getUser()
{
	String username=pro.getProperty("username");
	return username;
}

public String getpassword()
{
	String password=pro.getProperty("password");
	return password;

}
public String getdriver()
{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;

}
}
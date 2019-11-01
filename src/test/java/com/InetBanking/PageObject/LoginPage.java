package com.InetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
			
	@FindBy(name="uid")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="btnLogin")
	WebElement Loginbtn;


public void setusername1(String user)
{
	UserName.sendKeys(user);
}

public void setpassword(String password)
{
	Password.sendKeys(password);
}
public void Submit()
{
	Loginbtn.click();
}

}


package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.utilities.ReadConfig;

public class LoginPageClass 
{   ReadConfig readConfig  = new ReadConfig("./Xpath/xpath.properties");
	WebDriver driver;
	public LoginPageClass(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		// pageFactory is  a class used by selenium webdriver support
		//to design page object format.this class provide initElements method to initialise web elements
		//in pageFactory @FindBy annotation to find out web elements and perform action
	}
	String s = readConfig.readProperty("txtPassword");
	@FindBy(xpath = "//*[@name='password']" )
	WebElement txtPassword;
	
	
	@FindBy(xpath = "//*[@name='uid']")
	 WebElement txtUsername;
	
	@FindBy(xpath = "//*[@name='btnLogin']")
	 WebElement btnLogin;
	
	public void setUserName(String userName) {
		txtUsername.sendKeys(userName);		
	}
	
	public void setPassword(String password) {
       txtPassword.sendKeys(password);		
	}

	 public void clickLoginBtn() {
		btnLogin.click();
	}
	
	
	
	
	public HomePageClass LoginToApplication(String usreName , String password) throws Exception {
		
		setUserName(usreName);
		setPassword(password);
		clickLoginBtn();
		HomePageClass homePage = new HomePageClass(driver);
		Thread.sleep(20000);
		return homePage; 
	}
	
	
	
	
	
	
	
	
	
}





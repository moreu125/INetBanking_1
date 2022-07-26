package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.utilities.ReadConfig;

public class HomePageClass {
	

		WebDriver driver;
		public HomePageClass(WebDriver rdriver)
		{
			driver = rdriver;
			PageFactory.initElements(driver, this);

		}
		
		@FindBy(xpath = "//*[text()='New Customer']")
        WebElement newCustomer;	
		
		public NewCustomerPage newCustomerClick() throws InterruptedException {
			
			newCustomer.click();
			Thread.sleep(2000);
			return new NewCustomerPage(driver);
		}
}









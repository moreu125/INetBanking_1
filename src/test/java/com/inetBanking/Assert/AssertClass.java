package com.inetBanking.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AssertClass {
    WebDriver driver;
    private SoftAssert softAssert ;
	
    public AssertClass(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		driver = rdriver ;
		softAssert =new SoftAssert();
	}
	
	public void assertPageTitle(String expected) {
		softAssert.assertEquals(driver.getTitle() ,expected);
	}
	
	
	public void AssertAll() {
		softAssert.assertAll();
	}
}

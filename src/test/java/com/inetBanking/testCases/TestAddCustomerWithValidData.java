package com.inetBanking.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.inetBanking.Assert.AssertClass;
import com.inetBanking.pageObject.HomePageClass;
import com.inetBanking.pageObject.LoginPageClass;
import com.inetBanking.pageObject.NewCustomerPage;

public class TestAddCustomerWithValidData extends TestClassBase {
      
	  AssertClass assertClass;
	  public LoginPageClass loginPage;
	  public HomePageClass homePage;
	  public NewCustomerPage newCustomerPage;
	@Test
	public void step_1_Login_To_Application() throws Exception {
		loginPage =  new LoginPageClass(driver);
		assertClass = new AssertClass(driver);
        homePage= loginPage.LoginToApplication(userName, passWord);
      
	    }
	
	@Test(dependsOnMethods = "step_1_Login_To_Application")
	public void step_2_Click_NewCustomer() throws Exception {
		 newCustomerPage =      homePage.newCustomerClick();
         String expected =  " Guru99 Bank New Customer Entry Pge ";
         
         assertClass.assertPageTitle(expected);
         assertClass.AssertAll();
	}
	
	

	
}



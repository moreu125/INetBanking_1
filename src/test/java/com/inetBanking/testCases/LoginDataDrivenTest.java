package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPageClass;
import com.inetBanking.utilities.DataProviderClass;

public class LoginDataDrivenTest extends TestClassBase
{ 
     @Test(dataProvider = "dp" , dataProviderClass = DataProviderClass.class)
     public void loginDDT(String userName , String password)
     {
    	 driver.get(baseUrl);
	 	 logger.info("url is open");
	
	 	 LoginPageClass loginPage =  new LoginPageClass(driver);
		 loginPage.setUserName(userName); //with this object call page object package class methods
	     logger.info("enter username");
		 loginPage.setPassword(password);
		 logger.info("enter password");
		
	      loginPage.clickLoginBtn(); 
	     if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	     {
	    	 Assert.assertTrue(true);
	    	 logger.info("login test passed");
	     }
	     else
	     {
	    	 Assert.assertTrue(false);
	    	 logger.info("login test fail");
	     }
	     
	   
	   }
	
	
		   ///s
	    
	    

     }
    


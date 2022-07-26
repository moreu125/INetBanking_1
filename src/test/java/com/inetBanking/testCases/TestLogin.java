package com.inetBanking.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPageClass;

public class TestLogin extends TestClassBase
{
  @Test
	public void loginTest() throws InterruptedException {
		 driver.get(baseUrl);
	 	 logger.info("url is open");
	
	 	 LoginPageClass loginPage =  new LoginPageClass(driver);
		 loginPage.setUserName(userName); //with this object call page object package class methods
	     logger.info("enter username");
		 loginPage.setPassword(passWord);
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
	
	
		   
	    
	    
	    
	}
	
	
	


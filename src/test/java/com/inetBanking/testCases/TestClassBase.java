package com.inetBanking.testCases;

import org.apache.log4j.Logger;
//import java.util.logging.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;
public class TestClassBase 
{
	ReadConfig readConfig = new ReadConfig();
	public WebDriver driver;
	public static Logger logger;
	public String baseUrl= readConfig.readProperty("baseUrl");
	public String userName= readConfig.readProperty("userName");
	public String passWord= readConfig.readProperty("passWord");
	
	@Parameters("browser")
    @BeforeClass
	public void setUp(String br) 
    {
    	// Logger is a class of log4j package
    	//Logger is responsible for capturing login information.responsible for publishing logging information
    	// to various prefered destination
    	logger= Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");//allows the configuration of log4j from external file
    	if(br.equals("chrome"))
    	{
        logger.info("chrome");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();  // open/invoke the browser
		driver.get(baseUrl);
	 	logger.info("url is open"); 
	    
    	}
    	else if(br.equals("Firefox"))
    	{
            logger.info("FirexFox");
    		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    		driver=new ChromeDriver();  // open/invoke the browser
    	    
    		
    	}
    
      
    
    }
	@AfterClass
	public void tearDown() throws InterruptedException
	{   Thread.sleep(20000);
		driver.quit();
	}
	
}

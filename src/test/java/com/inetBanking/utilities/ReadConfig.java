package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro ;
	
	public ReadConfig()  {
		
		File src = new File("./Config/config.properties");
		
		FileInputStream ip;
		try {
			ip = new FileInputStream(src);
			pro = new Properties();
			pro.load(ip);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
		public ReadConfig(String FilePath)  {
			
			File src = new File(FilePath);
			
			FileInputStream ip;
			try {
				ip = new FileInputStream(src);
				pro = new Properties();
				pro.load(ip);
				
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		
		
	}
	
	public String readProperty(String proName) {
		String property =  pro.getProperty(proName);
		return property;
	}
	

}

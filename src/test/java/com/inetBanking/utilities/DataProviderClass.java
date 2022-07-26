package com.inetBanking.utilities;

import org.testng.annotations.DataProvider;



public class DataProviderClass {

@DataProvider(name = "dp")
public static String[][] dp(){
	ReadDataFromExcell readFromExcell = new ReadDataFromExcell();
	String [][] data_1 = readFromExcell.getExcelData("./Data//dipali.xlsx","Sheet2");
	
	return data_1; 
	
}
}

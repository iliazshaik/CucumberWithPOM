package com.regence.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	//Creating a constructor - It will help us to initialize the variables and objects
	public ConfigDataProvider()
	{
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load the config file "+e.getMessage());
		} 
		
	}
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String getQA1URL()
	{
		return pro.getProperty("qa1URL");
	}
	
	public String getUsername()
	{
		return pro.getProperty("username");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}

}

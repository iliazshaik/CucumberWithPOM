package com.regence.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.regence.pages.HomePage;
import junit.framework.Assert;


public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	
	
	
	public static void setup()
	{
		config = new ConfigDataProvider();
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getQA1URL());
		
	}
	
	public static void validateHomeTitle()
	{
		String title = driver.getTitle();
		Assert.assertEquals("Regence home", title);
	}
	
	public static void credentials()
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.loginToRegence(config.getUsername(), config.getPassword());
	}
	
	public static void validateDashboardTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Member dashboard"));
		String title = driver.getTitle();
		Assert.assertEquals("Member dashboard", title);
	}
	
	public static void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}

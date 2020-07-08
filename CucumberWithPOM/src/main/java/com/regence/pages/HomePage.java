package com.regence.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
		

		WebDriver driver;
		//Creating a constructor
		public HomePage(WebDriver ldriver)
		{
			this.driver=ldriver;
		}
		
		@FindBy(xpath="//a[@id='Regence-cs-logo']")
		WebElement RegLogoOrUt;
		
		@FindBy(xpath="//a[@id='Regence-cs-logo']//span[text()='Oregon and Utah']")
		WebElement RegLogoOrUtText;
		
		@FindBy(xpath="//a[@id='Regence-s-logo']")
		WebElement RegLogoIdWa;
		
		@FindBy(xpath="//a[@id='Regence-s-logo']//span[text()='Idaho and select counties of Washington']")
		WebElement RegLogoIdWaText;
		
		@FindBy(xpath="//a[@data-analytics-id= 'desktop-header-find-a-doctor'and text()='Find a doctor']")
		WebElement findAdoctorHeader;
		
		@FindBy(xpath="//a[@data-analytics-id= 'desktop-header-contact-us'and text()='Contact us']")
		WebElement contactusHeader;
		
		@FindBy(xpath="(//span[text()='For individuals & families '])[1]")
		WebElement ForIndiFamltextheader;
		
		@FindBy(xpath="(//span[text()='(change)'])[1]")
		WebElement changeheader;
		
		@FindBy(id ="sign-in-out-btn")
		@CacheLookup
		WebElement signin;
		
		//but if you want to take dynamically we have to use how
		@FindBy(how = How.ID,using="username")
		@CacheLookup
		WebElement uname;
		
		@FindBy(how=How.XPATH,using="//input[@name='PASSWORD']")
		@CacheLookup
		WebElement pass;
		
		@FindBy(how=How.ID,using="signin-submit")
		@CacheLookup//It will not check this web element each time on a webpage. It will check in the cache memory.
		WebElement signinSub;
		
		public void loginToRegence(String appusername, String apppassword)
		{
			signin.click();
			uname.sendKeys(appusername);
			pass.sendKeys(apppassword);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("signin-submit")));
			signinSub.click();
		}
		
}

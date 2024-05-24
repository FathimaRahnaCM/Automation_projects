package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//Encapsulation= Locators + Actions
	
	private WebDriver driver;//Instance
	
	//Initialize driver
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//locator
	By link=By.linkText("Sign In");
	
	//methods

	public String getAppTitle() {
		
		return driver.getTitle();
	}
	public String getAppUrl() {
		
		return driver.getCurrentUrl();
	}
	public String SignIn() {
		
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}

	
	

}

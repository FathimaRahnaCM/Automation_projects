package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	//initialize
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//locator

	private By email=By.id("email-id");
    private By password=By.id("password");
	private By submit=By.id("submit-id");
	
	public String dologin(String un,String pw) {
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(submit).click();
		return driver.getCurrentUrl();
	}
	
	
}

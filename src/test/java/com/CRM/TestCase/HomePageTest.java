package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends BaseClass {
  @Test(priority=1)
  public void validateAppUrl() {
	  //HomePage hp=new HomePage(driver);
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test fail:Url not matched!");
	  System.out.println("test pass: url matched!");
	  
	  
	  }
  @Test(priority=2)
  public void validateAppTitle() {
	
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer Service"),"Test fail :Title not matched!");
	  System.out.println("Test pass:Title matched!");
	  
	  }
  @Test(priority=3)
  public void validateAppSignIn() {
	  String nextPageUrl=hp.SignIn();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail:user is not navigated!");
	  System.out.println("Test pass: User navigated to next page!");
	  
	  }
}

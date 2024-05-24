package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
  @Test
  public void login() {
	  String nextpageurl=lp.dologin("abc@gmail.com","abc123");
	  Assert.assertTrue(nextpageurl.contains("customers"),"Test Fail:url not validated!");
	  System.out.println("Test Pass:Url validated!");
	  
	   }
}

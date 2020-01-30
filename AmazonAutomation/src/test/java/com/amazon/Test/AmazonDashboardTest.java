package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.Base.AmazonBase;
import com.amazon.Page.AmazonDashboardPage;
import com.amazon.Page.AmazonLoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AmazonDashboardTest extends AmazonBase{
 
	AmazonDashboardPage amazondashboardpage;
	AmazonLoginPage amazonloginpage;
		
	
	
	public AmazonDashboardTest()
	{
		 super();
		
	}
	
	@BeforeMethod
  public void beforeMethod() {
           
		AmazonBase.initialization();
		amazondashboardpage=new AmazonDashboardPage();
	}

	

	@Test
  public void verifyloginpage() {
  
		
		amazonloginpage=amazondashboardpage.navigatetologin();
		
	
	}
	
	
	
	
  @AfterMethod
  public void afterMethod() {
  
	  AmazonBase.quit();
  }

}

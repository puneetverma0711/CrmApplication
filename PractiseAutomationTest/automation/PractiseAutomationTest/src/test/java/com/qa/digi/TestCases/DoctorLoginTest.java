package com.qa.digi.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Pages.DoctorDashboardPage;
import com.qa.digi.Pages.DoctorLoginPage;

public class DoctorLoginTest extends DigitalBase {

	DoctorLoginPage doctorpage;
	DoctorDashboardPage dashboardpage;
	public DoctorLoginTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		doctorpage=new DoctorLoginPage();
		//doctorpage.closeloginmodelpopup();
	}

	
@Test
public void validateusername()  {
	doctorpage.verifyusernamefields();
	
}


@Test
public void validatepassword()  {
	doctorpage.verifyusernamefields();

}
	
	
	
	
	
@Test(dependsOnMethods= {"validateusername","validatepassword"})
public void logintest() throws InterruptedException {
	dashboardpage=doctorpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}
	


	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	
	
}



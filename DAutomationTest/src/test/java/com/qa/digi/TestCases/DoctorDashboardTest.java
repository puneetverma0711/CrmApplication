package com.qa.digi.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Pages.DoctorAddPrescriptionPage;
import com.qa.digi.Pages.DoctorDashboardPage;
import com.qa.digi.Pages.DoctorLoginPage;
import com.qa.digi.Pages.DoctorViewExamPage;
import com.qa.digi.Util.DigitalUtility;

public class DoctorDashboardTest extends DigitalBase{

	
	DoctorLoginPage doctorpage;
	DoctorDashboardPage dashboardpage;
	DoctorAddPrescriptionPage doctoraddprescriptionpage;
	
	
	public DoctorDashboardTest(){
		super();		
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		initialization();
		doctorpage=new DoctorLoginPage();
		doctorpage.closeloginmodelpopup();
		dashboardpage=doctorpage.login(prop.getProperty("username"),prop.getProperty("password"));   
		
	}
	
	  
	@Test
	public void navigatetoviewexampage() throws InterruptedException  { 
		doctoraddprescriptionpage=dashboardpage.clickonaddprescriptionbutton(); 
		 
	}   
	
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	
	
	
}

package com.qa.digi.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Pages.DoctorAddPrescriptionPage;
import com.qa.digi.Pages.DoctorDashboardPage;
import com.qa.digi.Pages.DoctorLoginPage;
import com.qa.digi.Pages.DoctorViewExamPage;
import com.qa.digi.Util.DigitalUtility;

public class DoctorAddPrescriptionTest extends DigitalBase {

	DoctorLoginPage doctorpage;
	DoctorDashboardPage dashboardpage;
	DoctorAddPrescriptionPage doctoraddprescriptionpage;
	DoctorViewExamPage doctorexamviewpage;
	String visualacuitysheet = "visualacuity";
	String contactlenssheet = "contactlens";
	
	public DoctorAddPrescriptionTest(){
		super();		
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		initialization();
		doctorpage=new DoctorLoginPage();
		doctorpage.closeloginmodelpopup();
		dashboardpage=doctorpage.login(prop.getProperty("username"),prop.getProperty("password"));
		doctoraddprescriptionpage=dashboardpage.clickonaddprescriptionbutton();
		
	}
	
	
	@Test(enabled=false)
	public void navigatetoviewexampage() {
		doctorexamviewpage= doctoraddprescriptionpage.clickonviewexam();
		
	}
	
	@DataProvider
	public Object[][] getVisualAcuityData() {
		
		Object data[][] = DigitalUtility.getTestData(visualacuitysheet);  
		return data;
	}
	
	@DataProvider
	public Object[][] getContactLensData() {
		
		Object data[][] = DigitalUtility.getTestData(contactlenssheet);   
		return data;
	}
	
	
	@Test(priority=2,dataProvider="getVisualAcuityData") 
	public void validateaddvisualacuity(String norxright,String norxleft,String norxout,String oldrxright,String oldrxleft,String oldrxout,String newrxright,String	newrxleft, String newrxout,String	nearrxright, String nearrxleft, String nearrxout,String	clsright, String clsleft,String clsout) throws InterruptedException {
		doctoraddprescriptionpage.addVisualAcuity(norxright, norxleft, norxout, oldrxright, oldrxleft, oldrxout, newrxright, newrxleft, newrxout, clsright, clsleft, clsout, clsright, clsleft, clsout); 
		
	}  
	
	
	@Test(priority=1,dataProvider="getContactLensData") 
	public void validateaddcontactlens(String sphright,String sphleft,String cylr,String cyll,String axisr,String axisl,String addright,String	addleft, String lenstyper,String	lenstypel, String manufr, String manufl,String	curver, String curvel,String diar,String dial,String cr,String cl) throws InterruptedException {
		doctoraddprescriptionpage.fillcontactlensdata(sphright, sphleft, cylr, cyll, axisr, axisl, addright, addleft, lenstyper, lenstypel, manufr, manufl, curver, curvel, curver, curvel, cr, cl);  
		
	}  
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	
}

package com.crm.TestCases;

import org.testng.annotations.Test;

import com.crm.Base.CrmBase;
import com.crm.Pages.CrmCasesPage;
import com.crm.Pages.CrmCompanyPage;
import com.crm.Pages.CrmContactPage;
import com.crm.Pages.CrmDashboardPage;
import com.crm.Pages.CrmDealsPage;
import com.crm.Pages.CrmLoginPage;
import com.crm.Pages.CrmTasksPage;
import com.crm.Util.CrmUtilities;
import com.crm.Util.JiraPolicy;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CrmDashboardTest extends CrmBase {
	CrmLoginPage crmloginpage;
	CrmDashboardPage crmdashbaordpage;
	CrmContactPage crmcontactpage;
	CrmCompanyPage crmcompanypage;
	CrmDealsPage crmdealspage;
	CrmTasksPage crmrtaskspage;
	CrmCasesPage crmcasespage;
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  CrmBase.initialization();
	  crmloginpage=new CrmLoginPage();
	  crmdashbaordpage=crmloginpage.login(CrmBase.resb.getString("username"),CrmBase.resb.getString("password"));
	  
  }
  
  @JiraPolicy(logticketready=true)
  @Test(priority=1)     
  public void verifycontactpagenavigation() {
	  crmcontactpage=crmdashbaordpage.navigatecontactlink();
	  Assert.assertEquals(CrmDashboardPage.verifycontactpagetext(), CrmUtilities.CONTACTS_Text);
  } 
  
  
  @JiraPolicy(logticketready=true)
  @Test(priority=2)
  public void verifycompanypagenavigation() {
	  crmcompanypage=crmdashbaordpage.navigatecompanylink();
	  Assert.assertEquals(CrmDashboardPage.verifycompanypagetext(), CrmUtilities.COMPANIES_Text);
  } 
  
  @JiraPolicy(logticketready=true)
  @Test(priority=3)
  public void verifydealspagenavigation() {
	  crmdealspage=crmdashbaordpage.navigatedealslink();
	  Assert.assertEquals(CrmDashboardPage.verifydealspagetext(), CrmUtilities.DEALS_Text);
  } 
    
  @JiraPolicy(logticketready=true)
  @Test(priority=4)
  public void verifytaskspagenavigation() {  
	  crmrtaskspage=crmdashbaordpage.navigatetaskslink();
	  Assert.assertEquals(CrmDashboardPage.verifytaskspagetext(), CrmUtilities.TASKS_Text);
  } 

  @JiraPolicy(logticketready=true)
  @Test(priority=5)  
  public void verifycasespagenavigation() {
	    crmcasespage=crmdashbaordpage.navigatecaseslink();
	    Assert.assertEquals(CrmDashboardPage.verifycasespagetext(), CrmUtilities.CASES_Text);
  } 
  
  
  
  
  
  

  @AfterMethod
  public void afterMethod() {
	  CrmBase.quit();
	  
  }

}

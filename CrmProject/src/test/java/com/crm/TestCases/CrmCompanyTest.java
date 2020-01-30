package com.crm.TestCases;

import org.testng.annotations.Test;

import com.crm.Base.CrmBase;
import com.crm.Pages.CrmCompanyPage;
import com.crm.Pages.CrmDashboardPage;
import com.crm.Pages.CrmLoginPage;
import com.crm.Util.CrmUtilities;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CrmCompanyTest extends CrmBase {
  
	CrmLoginPage crmloginpage;
	CrmDashboardPage crmdashbaordpage;
	CrmCompanyPage crmcompanypage;
	
  @BeforeMethod
  public void beforeMethod() {
	  CrmBase.initialization();
	  crmloginpage=new CrmLoginPage();
	  crmdashbaordpage=crmloginpage.login(CrmBase.prop.getProperty("username"),CrmBase.prop.getProperty("password"));
	  crmdashbaordpage=new CrmDashboardPage();
	  crmcompanypage=crmdashbaordpage.navigatecompanylink();
  }

          
  @Test
  public void verifyaddnewcompany() {
	  CrmCompanyPage.addnewcompany();
	  Assert.assertEquals(CrmCompanyPage.verfifysavedcompanyname(), "test78"); 
	  
	  
  }
  
  
  
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  CrmBase.quit();
	  
  }

}

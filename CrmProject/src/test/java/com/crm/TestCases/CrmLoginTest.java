package com.crm.TestCases;

import org.testng.annotations.Test;

import com.crm.Base.CrmBase;
import com.crm.Pages.CrmDashboardPage;
import com.crm.Pages.CrmLoginPage;
import com.crm.Util.CrmUtilities;
import com.crm.Util.JiraPolicy;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CrmLoginTest extends CrmBase {
	CrmLoginPage crmloginpage;
	CrmDashboardPage crmdashbaordpage;
	
	
	
	public CrmLoginTest() {		
		super();		
	}
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  CrmBase.initialization();
	  crmloginpage=new CrmLoginPage();
	  
	  
  }

  
  
  @Test(priority=2)
  public void verifyusername() {  
	  Assert.assertEquals( crmloginpage.verifyusernamefield(), true);
	  //System.out.println(Thread.currentThread().getId());
  }
    
  @Test(priority=3)
  public void verifypassword() {  
	 Assert.assertEquals(crmloginpage.verifypasswordfield(), true);
	
  }
  
  
  @Test(priority=4)
  public void verifyforgotpassword() {  
	 Assert.assertEquals(crmloginpage.verifyforgotpasswordlink(), true); 
	
  }
  
  
  @JiraPolicy(logticketready=true)
  @Test(priority=1)
  public void verifylogin() {  
	  crmdashbaordpage= crmloginpage.login(CrmBase.resb.getString("username"),CrmBase.resb.getString("password"));    	 
	  Assert.assertEquals( CrmLoginPage.dashboardwelcometext(), CrmUtilities.DASHBOARD_Text);    
	  
  }
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  CrmBase.quit();
	 
  }

}

package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.CrmBase;

public class CrmDashboardPage extends CrmBase {

	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactlink;
	
	
	@FindBy(xpath="//span[contains(text(),'Companies')]") 
	WebElement companylink;
	
	
	@FindBy(xpath="//span[contains(text(),'Deals')]") 
	WebElement dealslink;
	
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]") 
	WebElement taskslink;
	
	
	@FindBy(xpath="//span[contains(text(),'Cases')]") 
	WebElement caseslink;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']") 
	static WebElement contacttext;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")  
	static WebElement companytext;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']") 
	static WebElement dealstext;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']") 
	static WebElement taskstext;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']") 
	static WebElement casestext;
	
	
	
	public CrmDashboardPage() {
		PageFactory.initElements(CrmBase.driver, this);
		
		
	}
	
	
	public CrmContactPage navigatecontactlink() {
		contactlink.click();
		return new CrmContactPage();
	}
	
	
	
public CrmCompanyPage navigatecompanylink() {
	companylink.click();
		return new CrmCompanyPage(); 
		
	}
	

public CrmDealsPage navigatedealslink() {
	
	dealslink.click();
	return new CrmDealsPage();  
}


public CrmTasksPage navigatetaskslink() {
	taskslink.click();
	return new CrmTasksPage();   
	
}


	
public CrmCasesPage navigatecaseslink() {
	
	caseslink.click();
	return new CrmCasesPage();      
}
	
	


public  static String verifycontactpagetext(){
	return contacttext.getText();
	
	
	
}


public  static String verifycompanypagetext(){
	return companytext.getText();
	
	
	
}


public  static String verifydealspagetext(){
	return dealstext.getText();
		
}

public  static String verifytaskspagetext(){
	return taskstext.getText();
		
}

public  static String verifycasespagetext(){
	return casestext.getText();
		
}





	
}

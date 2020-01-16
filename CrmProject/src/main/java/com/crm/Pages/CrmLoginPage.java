package com.crm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.CrmBase;


public class CrmLoginPage extends CrmBase  {

	
	
	
	
	@FindBy(xpath="//input[@name='email']") 
	static WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']") 
	static WebElement password;
	
	
	@FindBy(xpath="//div[@class='ui stacked segment']/child::div[3]") 
	static WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")  
	static WebElement forgotpasswordlink;
	
	
	@FindBy(xpath="//div[@class='ui stackable grid']//child::div[@class='content']/div[contains(text(),'Deals Summary')]")
	static WebElement crmdashboardpagetext;      
	 
	
	
	public CrmLoginPage() {
		PageFactory.initElements(CrmBase.driver, this);		
	}
	
	
	
	
	public  boolean verifyusernamefield() {
		
		return username.isDisplayed();
		
	}
	
	
public  boolean verifypasswordfield() {
		
		return password.isDisplayed();
		
	}
	
	
	
	public  CrmDashboardPage login(String un, String pass) {
	
		username.sendKeys(un);  
		password.sendKeys(pass);  
		loginbtn.click();	
		
		return new CrmDashboardPage();
		
	}
	
	
	public static String dashboardwelcometext() {
		return  crmdashboardpagetext.getText();
		
		
	}
	
	
	public boolean verifyforgotpasswordlink() {
		
		return forgotpasswordlink.isEnabled();
		
	}
	
	
}

package com.amazon.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

public class AmazonLoginPage extends AmazonBase {

	@FindBy(xpath="//input[@id='ap_email']") 
	static WebElement email;
	
	@FindBy(xpath="//input[@id='continue']") 
	static WebElement continuebtn;
	
	
	@FindBy(xpath="//input[@id='ap_password']") 
	static WebElement password;
	
	
	@FindBy(xpath="//input[@id='signInSubmit']") 
	static WebElement loginbtn;
	
	
	
	public AmazonLoginPage() {
		PageFactory.initElements(AmazonBase.driver, this);
		}
	
	
	public AmazonDashboardPage login(String username,String Password) throws InterruptedException {
		
		email.sendKeys(username);
		continuebtn.click();
		Thread.sleep(3000);
		password.sendKeys(Password);
		loginbtn.click();
		return new AmazonDashboardPage();
		
	}
	
	
	
	
	
}

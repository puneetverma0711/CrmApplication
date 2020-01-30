package com.amazon.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.Base.AmazonBase;

public class AmazonDashboardPage extends AmazonBase {

	@FindBy(xpath="//span[contains(text(),'Account & Lists')][position()=1]") 
	static WebElement accountloginlink;
	
	
	public AmazonDashboardPage() {
		
		PageFactory.initElements(AmazonBase.driver, this);
				
	}
	
	
	public  AmazonLoginPage navigatetologin() {
		accountloginlink.click();
		
		return new AmazonLoginPage();
		
	}
	
	 
	
	
	
	
	
	
	
	
	
}

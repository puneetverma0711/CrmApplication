package com.crm.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.CrmBase;
import com.crm.Util.CrmUtilities;

public class CrmCompanyPage extends CrmBase{

	@FindBy(xpath="//button[contains(text(),'New')]") 
	static WebElement addnewcompanybtn;
	
	@FindBy(xpath="//div[@class='ui right corner labeled input']//input[@name='name']") 
	static WebElement companynamefield;
	
	
	 
	@FindBy(xpath="//button[@class='ui linkedin button']")   
	static WebElement savecompanybtn;
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")    
	static WebElement savedcompanyname;
	
	
	
	public CrmCompanyPage() {
		
		PageFactory.initElements(CrmBase.driver, this);
		
	}
	
	
	
	public static void addnewcompany() {
		addnewcompanybtn.click();
		companynamefield.sendKeys("test78");
		savecompanybtn.click();
		
		
	}
	
	
	
	public static String  verfifysavedcompanyname() throws InterruptedException {
		Thread.sleep(3000);
		return savedcompanyname.getText();
		
		
	}
	
	
}

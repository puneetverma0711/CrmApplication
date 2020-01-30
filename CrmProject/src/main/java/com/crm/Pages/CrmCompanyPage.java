package com.crm.Pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import com.crm.Base.CrmBase;
import com.crm.Util.CrmUtilities;
import com.google.common.base.Function;

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
	
	
	
	
	
	public static String  verfifysavedcompanyname(){
		
		/*
		 * wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(CrmUtilities.FLUENTWAIT_TIMEOUT,
		 * TimeUnit.SECONDS).pollingEvery(CrmUtilities.FLUENTWAIT_POLLINGTIME,
		 * TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		 * 
		 * savedcompanyname = (WebElement)wait.until(new
		 * Function<WebDriver,WebElement>() { public WebElement apply(WebDriver driver)
		 * { return savedcompanyname; }
		 * 
		 * 
		 * 
		 * 
		 * });
		 */
		 
		driver.manage().timeouts().implicitlyWait(CrmUtilities.IMPLICITWAIT_TIMEOUT,TimeUnit.SECONDS);
		System.out.println(savedcompanyname.getText()); 
		return savedcompanyname.getText();
		
		
	}
	
	
}

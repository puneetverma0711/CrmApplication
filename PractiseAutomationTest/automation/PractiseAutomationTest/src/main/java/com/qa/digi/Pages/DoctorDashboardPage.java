package com.qa.digi.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Util.DigitalUtility;

public class DoctorDashboardPage extends DigitalBase {

	  
	
	@FindBy(xpath="//i[@title='add prescription']")   
	WebElement addprescriptionbutton;
	WebElement clickonaddprescriptionbtn;
	
	
	public DoctorDashboardPage() {
		PageFactory.initElements(driver, this);		
	}
	 
	public DoctorAddPrescriptionPage clickonaddprescriptionbutton() throws InterruptedException  { 
		
		//Thread.sleep(8000); 
		//wait=new WebDriverWait(driver,DigitalUtility.EXPLICITWAIT_TIMEOUT); 
		//clickonaddprescriptionbtn=wait.until(ExpectedConditions.elementToBeClickable(addprescriptionbutton));
		Thread.sleep(8000);
		addprescriptionbutton.click();
		//System.out.println("clicked on prescription button");  
		Thread.sleep(4000); 	
            Alert prescriptionbuttonalert = driver.switchTo().alert();
            prescriptionbuttonalert.accept();	
		return new DoctorAddPrescriptionPage();	
	}
	
	
	
	
	
}

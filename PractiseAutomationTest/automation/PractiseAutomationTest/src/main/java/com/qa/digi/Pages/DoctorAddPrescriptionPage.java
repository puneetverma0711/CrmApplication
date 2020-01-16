package com.qa.digi.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Util.DigitalUtility;

public class DoctorAddPrescriptionPage extends DigitalBase {

	JavascriptExecutor jse= (JavascriptExecutor)driver; 

	 
	@FindBy(xpath="//i[@title='View Exam']")
	WebElement viewexambtn;
	
	@FindBy(xpath="//textarea[@id='txtDoctorNewNotePopUp']")
	WebElement notestextfield;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submitnotefieldbtn;
	
	@FindBy(xpath="//button[@id='closemodal']")
	WebElement notestabclosebtn;
	
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNoRx_Right']")
	WebElement norxrighttextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNoRx_Left']")
	WebElement norxlefttextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNoRx_OU']")
	WebElement norxouttdextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityOldRx_Right']")
	WebElement oldrxrightdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityOldRx_Left']")
	WebElement oldrxleftdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityOldRx_OU']")
	WebElement oldrxoutdtextfield;
	
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNewRx_Right']")
	WebElement newrxrightdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNewRx_Left']")
	WebElement newrxleftdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNewRx_OU']") 
	WebElement newrxoutdtextfield;
	
	
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNearRxRight']")
	WebElement nearrxrightdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNearRxLeft']")
	WebElement nearrxleftdtextfield;
	
	@FindBy(xpath="//input[@id='txtVisualAcuityNearRxOU']")
	WebElement nearxoutdtextfield;
	
	
	
	@FindBy(xpath="//input[@id='VisualAcuityWithCLsRight']")
	WebElement clsrightdtextfield;
	
	@FindBy(xpath="//input[@id='VisualAcuityWithCLsLeft']")
	WebElement clsleftdtextfield;
	
	@FindBy(xpath="//input[@id='VisualAcuityWithCLsOU']")
	WebElement clsoutdtextfield;
	
	
	
	@FindBy(xpath="//input[@id='chkAddContactLensPrescription']") 
	WebElement contactlenscheckbox;
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Sph']") 
	WebElement sphright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Sph']") 
	WebElement sphleft; 
	
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Cyl']")  
	WebElement cylright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Cyl']")  
	WebElement cylleft; 
	
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Axis']")  
	WebElement axisright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Axis']")  
	WebElement axisleft; 
	
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Add']")  
	WebElement addright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Add']")  
	WebElement addleft; 
	
	
	
	
	@FindBy(xpath="//select[@id='ddlLensTypeContactLens_R']")   
	WebElement lenstyperight; 
	
	
	@FindBy(xpath="//select[@id='ddlLensTypeContactLens_L']")  
	WebElement lenstypeleft; 
	
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_LensBrand']")  
	WebElement manufacturerright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_LensBrand']")  
	WebElement manufacturerleft;
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_BaseCurve']")  
	WebElement curveright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_BaseCurve']")   
	WebElement curveleft;
	
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Diam']")  
	WebElement diameterright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Diam']")  
	WebElement diameterleft;
	
	
	@FindBy(xpath="//input[@id='txtContactLensR_Color']")  
	WebElement colorright; 
	
	
	@FindBy(xpath="//input[@id='txtContactLensL_Color']")   
	WebElement colorleft;  
	

	
	
	public DoctorAddPrescriptionPage() {
		PageFactory.initElements(driver, this);		
		
	}
	
	
	public DoctorViewExamPage clickonviewexam() {
		
		
		jse.executeScript("window.scrollBy(0,34)");
		viewexambtn.click();
		//now do the click because of state reference exception
	//	viewexambtn.click();
		return new DoctorViewExamPage();	
		
	}
	
	
	public void addVisualAcuity(String nr,String nl,String no,String oldr,String oldl,String oldo,String newr,String newl,String newo,String nearr,String nearl,String nearo,String clsr,String clsl,String clso) throws InterruptedException {
		
		jse.executeScript("window.scrollBy(0,36)");
		norxrighttextfield.sendKeys(nr);  
		
		norxlefttextfield.sendKeys(nl); 
		
		norxouttdextfield.sendKeys(no); 
		
		oldrxrightdtextfield.sendKeys(oldr);
		
		oldrxleftdtextfield.sendKeys(oldl);
		
		oldrxoutdtextfield.sendKeys(oldo);
		
		newrxrightdtextfield.sendKeys(newr);
		
		newrxleftdtextfield.sendKeys(newl);
		
		newrxoutdtextfield.sendKeys(newo);
		
		nearrxrightdtextfield.sendKeys(nearr);
		
		nearrxleftdtextfield.sendKeys(nearl);  
		
		nearxoutdtextfield.sendKeys(nearo);
		
		clsrightdtextfield.sendKeys(clsr);
		
		clsleftdtextfield.sendKeys(clsl);
		
		clsoutdtextfield.sendKeys(clso);   
		Thread.sleep(5000);
		System.out.println("data has been successfully populated on the visual acuity textfields");
	}
	
	 
	public void fillcontactlensdata(String sphr,String sphl,String cylr,String cyll,String axisr,String axisl,String addr,String addl,String lenstyper,String lenstypel,String manur,String manul,String curver,String curvel,String diamr,String diaml,String colr,String coll) throws InterruptedException {
		jse.executeScript("window.scrollBy(0,45)");  
		contactlenscheckbox.click();
		jse.executeScript("window.scrollBy(0,50)");  
		sphright.sendKeys(sphr);
		sphleft.sendKeys(sphl);
		cylright.sendKeys(cylr);
		cylleft.sendKeys(cyll);
		axisright.sendKeys(axisr);
		axisleft.sendKeys(axisl);
		addright.sendKeys(addr);
		addleft.sendKeys(addl);
		
		
		Select rightlens = new Select(lenstyperight);
		lenstyperight.click();
		Thread.sleep(3000L);
		rightlens.selectByVisibleText(lenstyper); 
		lenstypeleft.click();
		Thread.sleep(3000L);
		Select leftlens = new Select(lenstypeleft);
		
		leftlens.selectByVisibleText(lenstypel); 
		
		manufacturerright.sendKeys(manur);
		manufacturerleft.sendKeys(manul);
		curveright.sendKeys(curver);
		curveleft.sendKeys(curvel);
		diameterright.sendKeys(diamr);
		diameterleft.sendKeys(diaml);
		colorright.sendKeys(colr);
		colorleft.sendKeys(coll);
		Thread.sleep(5000);
		
	}
	
	
}

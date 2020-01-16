package com.qa.digi.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.digi.Base.DigitalBase;
import com.qa.digi.Util.DigitalUtility;

public class DoctorLoginPage extends DigitalBase {

	
	
	
	@FindBy(xpath=".//*[@id='announcementModal']/div/div/div[1]/button")
	WebElement modelclosebtn;
	
	
	@FindBy(xpath="//input[@name='UserName']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@id='BtnLogin']")
	WebElement loginbtn;
	
	@FindBy(xpath="//h2[contains(text(),'Remote Doctor Dashboard')]")
	WebElement doctorhomepage;
	
	
	//intialisation of page objects
	
	public DoctorLoginPage() {
		PageFactory.initElements(driver, this);		
	}
	
	
	public void closeloginmodelpopup() {
		modelclosebtn.click();
	}
	
	public boolean verifyusernamefields() {
		return username.isEnabled();
		
	
	}
	
	public boolean verifypasswordfields() {	 
	 return password.isEnabled();
	}
	
	
	public DoctorDashboardPage login(String un,String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		/*wait=new WebDriverWait(driver, DigitalUtility.EXPLICITWAIT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(loginbtn));	 */
		//Thread.sleep(5000); 
		clickloginbyjs(loginbtn,driver);
		//loginbtn.click();  
		driver.manage().timeouts().pageLoadTimeout(DigitalUtility.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		String actualtext=doctorhomepage.getText();
		Assert.assertEquals(actualtext, "Remote Doctor Dashboard");  
		return new DoctorDashboardPage();
		
	}
	
	
	
	public static void clickloginbyjs(WebElement element,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	
	
}

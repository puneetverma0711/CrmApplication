package com.zap.Page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SchedulingApp {
    WebDriver driver;
    public final static String BASE_URL = "https://stage-scheduling.worksteps.com/login/";
    public final static String LOGOUT_URL = "https://stage-testing.worksteps.com/logout";
    public final static String USERNAME = "scheduling@worksteps.com";
    public final static String PASSWORD = "Password1819!";

    public SchedulingApp(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    }

    public void login() {
        driver.get(BASE_URL); 
       driver.findElement(By.xpath("//input[@placeholder='User ID']")).clear();
       driver.findElement(By.xpath("//input[@placeholder='User ID']")).sendKeys(USERNAME); 
       driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PASSWORD);   
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
     try {
    	
    	 Thread.sleep(5000); 
     }
     catch(Exception e){
    	 e.printStackTrace();
    	 
     }
        verifyTextPresent("Administration");
   }

    public void registerUser() {
        driver.get(BASE_URL+"register.jsp");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(USERNAME);
        driver.findElement(By.id("password1")).clear();
        driver.findElement(By.id("password1")).sendKeys(PASSWORD);
        driver.findElement(By.id("password2")).clear();
        driver.findElement(By.id("password2")).sendKeys(PASSWORD);
        driver.findElement(By.id("submit")).click();
    }

    public void navigateBeforeLogin() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click(); 
        driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("test56");
       WebElement q= driver.findElement(By.xpath(" //select[@id='id_question']"));
     
        Select question = new Select(q);
        try {
			Thread.sleep(3000L);
			 question.selectByVisibleText("What is your pet's name?");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//input[@id='id_answer']")).sendKeys("abc");
     
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click(); 
        try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath(" //a[contains(text(),'Home')]")).click();  
     
             driver.close();
      
    }

    public void navigateAfterLogin() throws InterruptedException {
    	driver.findElement(By.xpath("//a[contains(text(),'Document')]")).click();
    	driver.findElement(By.xpath("//input[@id='search_value']")).sendKeys("5855"); 
    	 Thread.sleep(5000); 
    	
    	driver.findElement(By.xpath("//button[@id='Find']")).click();
    	 Thread.sleep(5000); 
    	
    	driver.findElement(By.xpath("//a[@id='test_link']")).click();
    	 Thread.sleep(5000); 
    	
    	driver.findElement(By.xpath("//tr[@id='positions_rows_189522']//a[contains(text(),'FCE - Initial')]")).click();
    	 Thread.sleep(5000);   
    	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
    	 Thread.sleep(5000);   
    	driver.findElement(By.xpath("//a[@id='link_98']")).click();
    	 Thread.sleep(5000);   
    	 driver.findElement(By.xpath("//textarea[@id='id_188168_98_913_877']")).clear();
    	 driver.findElement(By.xpath("//textarea[@id='id_188168_98_913_877']")).sendKeys("test56");
    	driver.findElement(By.xpath("//a[@id='saveBtn_TestInformation']")).click();
    	 Thread.sleep(5000);    
    	 
    	 
    	
        driver.close();
    }


    public void verifyTextPresent(String text) {
        if (!this.driver.getPageSource().contains(text)) throw new RuntimeException("Expected text: ["+text+"] was not found.");
    }
}


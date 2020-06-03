package com.crm.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.Util.CrmUtilities;



public class CrmBase  {
	// public static Properties prop;
	 public static ResourceBundle resb;
	 public static WebDriver driver;
public static Wait<WebDriver> wait;
	
	public CrmBase() {
		
		try {
			//InputStream input = new FileInputStream("F:/CrmApplication/CrmProject/src/main/java/com/crm/Config/Crm.properties");
			
			resb=ResourceBundle.getBundle("Crm");
          //  prop = new Properties();

           // load a properties file
         //  prop.load(input);

          

       } catch (Exception ex) {
           ex.printStackTrace();
       }
		
		
	}
	
	
	
	
	
	public  static void  initialization() {
		//String browsername= prop.getProperty("browser");
		String browsername=resb.getString("browser");
		if(driver==null) { 
		if(browsername.equals("chrome")) {
			/*ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--headless");*/
			System.setProperty("webdriver.chrome.driver", "F:/downloaded data/selenium drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			
			
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/selenium jar files/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	
		}
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(CrmUtilities.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(CrmUtilities.IMPLICITWAIT_TIMEOUT, TimeUnit.SECONDS);

driver.get(resb.getString("url")); 

	
	}
	
	
	public static void quit() {
		
		driver.quit();
		driver=null;
		
	}
	
public static void close() {
		
		driver.close(); 
		driver=null;
		
	}
	
	
}

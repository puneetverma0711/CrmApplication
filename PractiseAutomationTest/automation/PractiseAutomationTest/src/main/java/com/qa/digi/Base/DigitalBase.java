package com.qa.digi.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.digi.Util.DigitalUtility;
import com.qa.digi.Util.WebEventListener;

public class DigitalBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public DigitalBase() {
		try {
			InputStream input = new FileInputStream("D:/git/automation/DigitalAutomationTest/src/main/java/com/qa/digi/Config/digital.properties");
			

             prop = new Properties();

            // load a properties file
            prop.load(input);

           

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static void  initialization() {
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/selenium jar files/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/selenium jar files/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(DigitalUtility.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(DigitalUtility.IMPLICITWAIT_TIMEOUT, TimeUnit.SECONDS);

driver.get(prop.getProperty("url"));

	}
	
	
	
	
}

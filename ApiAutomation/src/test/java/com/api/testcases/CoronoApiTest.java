package com.api.testcases;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CoronoApiTest {
 
	
	@Test(priority=0)
  public void getCoronoCasesIndia() throws EmailException {
  
		RestAssured.baseURI="https://coronavirus-monitor.p.rapidapi.com";
		RequestSpecification httprequest=RestAssured.given();
             httprequest.header("X-RapidAPI-Key","ab67d93a9cmsh9a4a2df5ebd3ca0p154061jsn937cd26b1a92");
		Response resp=httprequest.request(Method.GET,"/coronavirus/cases_by_country.php");
        JsonPath jsonevaluator=resp.jsonPath();
          
		//List<String> countrynamelist=jsonevaluator.get("countries_stat.country_name");
		
          //to get complete list of objects and store in  a list        
        List<String> objectlist=jsonevaluator.getList("countries_stat");
    for(int i=0;i<objectlist.size();i++) {
        	
        	//to get main list  and within that particular array(eg "countries_stat.get(21)") and store the key value pair of this particular array in map
            
        	LinkedHashMap<String,String> map=jsonevaluator.get("countries_stat.get("+i+")");
        	
        	if(map.get("country_name").equals("India")) {
        		
               
				HtmlEmail email = new HtmlEmail(); email.setHostName("smtp.gmail.com");
				  email.setSmtpPort(465); email.setAuthenticator(new
				  DefaultAuthenticator("puneetverma0711@gmail.com", "confidom1"));
				  email.setSSLOnConnect(true); email.setFrom("puneetverma0711@gmail.com");
				  email.setSubject("Coronavirus update of india");
				  email.setHtmlMsg("<html> <p><b>hi this is htmlmessage</b></p></html>");
				  email.setMsg("country name: " +map.get("country_name")
				  + " total no of cases: " +map.get("cases") 
				  + " total no of deaths: " +map.get("deaths")+ 
				  " total recovered: "  +map.get("total_recovered")+ 
				  " new deaths:  " 	  +map.get("new_deaths")+ 
				  " new cases:  " +map.get("new_cases")+ 
				  " serious critical: " 	  +map.get("serious_critical")+ 
				  " active cases: " +map.get("active_cases")+ 
				  " total cases_per_1m_population:  "	+map.get("total_cases_per_1m_population"));  
				  email.addTo("puneetverma0711@gmail.com"); 
				  email.send() ;  		
                   
        		
        	}
        		
        	
        }
        

		
		
	}
	



	@Test(priority=1)
	  public void getCoronoCasesUSA() throws EmailException {
	  
			RestAssured.baseURI="https://coronavirus-monitor.p.rapidapi.com";
			RequestSpecification httprequest=RestAssured.given();
	             httprequest.header("X-RapidAPI-Key","ab67d93a9cmsh9a4a2df5ebd3ca0p154061jsn937cd26b1a92");
			Response resp=httprequest.request(Method.GET,"/coronavirus/cases_by_country.php");
	        JsonPath jsonevaluator=resp.jsonPath();
	          
			//List<String> countrynamelist=jsonevaluator.get("countries_stat.country_name");
			
	          //to get complete list of objects and store in  a list        
	        List<String> objectlist=jsonevaluator.getList("countries_stat");
	    for(int i=0;i<objectlist.size();i++) {
	        	
	        	//to get main list  and within that particular array(eg "countries_stat.get(21)") and store the key value pair of this particular array in map
	            
	        	LinkedHashMap<String,String> map=jsonevaluator.get("countries_stat.get("+i+")");
	        	
	        	if(map.get("country_name").equals("USA")) {
	        		
	               
					HtmlEmail email = new HtmlEmail(); email.setHostName("smtp.gmail.com");
					  email.setSmtpPort(465); email.setAuthenticator(new
					  DefaultAuthenticator("puneetverma0711@gmail.com", "confidom1"));
					  email.setSSLOnConnect(true); email.setFrom("puneetverma0711@gmail.com");
					  email.setSubject("Coronavirus update of USA");
					  email.setHtmlMsg("<html> <p><b>hi this is htmlmessage</b></p></html>");
					  email.setMsg("country name: " +map.get("country_name")
					  + " total no of cases: " +map.get("cases") 
					  + " total no of deaths: " +map.get("deaths")+ 
					  " total recovered: "  +map.get("total_recovered")+ 
					  " new deaths:  " 	  +map.get("new_deaths")+ 
					  " new cases:  " +map.get("new_cases")+ 
					  " serious critical: " 	  +map.get("serious_critical")+ 
					  " active cases: " +map.get("active_cases")+ 
					  " total cases_per_1m_population:  "	+map.get("total_cases_per_1m_population"));  
					  email.addTo("puneetverma0711@gmail.com"); 
					  email.send() ;  		
	                   
	        		
	        	}
	        		
	        	
	        }
	        

			
			
		}








}

	



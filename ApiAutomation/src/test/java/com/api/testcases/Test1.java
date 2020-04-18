package com.api.testcases;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
 
	@BeforeMethod
	public void setup() {
		RestAssured.baseURI="https://fakerestapi.azurewebsites.net";
		  
		 
  	   
		
	}
	
	
	
	@Test(priority=0)
  public void verifystatuscode() {
		 RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		  String responsebody=response.getBody().asString();
		  int code=response.getStatusCode();
		  
		  Assert.assertEquals(code, 200);
		  //System.out.println(responsebody);  
		  
	
	}

	
	@Test(priority=1)
	public void getResponse() {
		
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		  String responsebody=response.getBody().asString();
		System.out.println(responsebody);  
		
		
	}
	
	
	
	@Test(priority=2)
	public void validateResponse() {
		
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		
		       List<String> li=response.getBody().jsonPath().get("FirstName");
		
		       for(int i=0;i<li.size();i++) {
		    	   if(li.get(i).equals("First Name 4")) {
		   			
		    		  
		   			Assert.assertTrue(true, "name appear in the response");
	
		   		}else {
		   		 
		   			Assert.assertTrue(false, "name does not appear in the response");
		   			
		   		}   
		       
		       
		       }
		       
       /*
		 * Iterator<String> it=li.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * String fn=it.next();
		 * 
		 * // System.out.println(fn);
		 * 
		 * if(fn.equals("First Name 2")) {
		 * 
		 * Assert.assertTrue(true, "name appear in the response");
		 * 
		 * }else { Assert.assertTrue(false, "name does appear in the response");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		      
		       // Assert.assertEquals(fn, "First Name 1");
		
		
	}
	

	@Test(priority=3)
	public void verifystatusline() {
		
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		  String statusline=response.getStatusLine();
		System.out.println(statusline);    
		
		
	}
	
	
	@Test(priority=4)
	public void verifyresponsetime() {
		
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		  long time=response.getTime();
		
		  if(time<950) {
			  Assert.assertTrue(true, "response is less than 950 mili seconds");
			  
		  }else {
			  
			  Assert.assertTrue(false, "response is greater than 950 mili seconds");
		  }
		      
		
		
	}
	
	
	
	@Test(priority=5)
	public void verifyHeaders() {
		
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET,"/api/Authors");
		
		  String contenttype=response.getHeader("Content-Type");
		Assert.assertEquals(contenttype, "application/json; charset=utf-8");
		      
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		
	}

}

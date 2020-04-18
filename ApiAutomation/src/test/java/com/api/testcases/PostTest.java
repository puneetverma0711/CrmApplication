package com.api.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class PostTest {
  
	@BeforeMethod
	public void setup() {
		RestAssured.baseURI="https://reqres.in";
		  
		 
  	   
		
	}
	
	
	
	@Test(priority=0)
  public void verifystatuscode() {
		 RequestSpecification httprequest=RestAssured.given();
		
		
		JSONObject json=new JSONObject();
		json.put("name", "puneet");
		json.put("job", "lead");
		
		httprequest.header("Content-Type","application/json");
		httprequest.body(json.toJSONString());
		Response response=httprequest.request(Method.POST,"/api/users");
		
		
		  
		  int code=response.getStatusCode();
		  
		  System.out.println(code);  
		  
		  
	
	}

	

	@Test(priority=1)
	  public void getResponse() {
			 RequestSpecification httprequest=RestAssured.given();
			
			
			JSONObject json=new JSONObject();
			json.put("name", "puneet");
			json.put("job", "lead");
			
			httprequest.header("Content-Type","application/json");
			httprequest.body(json.toJSONString());
			Response response=httprequest.request(Method.POST,"/api/users");
		    String responsebody=response.getBody().asString();  
			  System.out.println(responsebody);
  
		
		}
	
	
	
	@Test(priority=2)
	  public void validateResponse() {
			 RequestSpecification httprequest=RestAssured.given();
			
			
			JSONObject json=new JSONObject();
			json.put("name", "puneet");
			json.put("job", "lead");
			
			httprequest.header("Content-Type","application/json");
			httprequest.body(json.toJSONString());
			Response response=httprequest.request(Method.POST,"/api/users");
		    String id=response.jsonPath().get("id"); 
			  System.out.println(id);

		
		}
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		
	}

	
	
	
	
	
	
	
	

}

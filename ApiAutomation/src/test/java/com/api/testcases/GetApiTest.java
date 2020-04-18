package com.api.testcases;

import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApiTest {
  
	
  @Test(priority = 0, enabled=false)
  public void printAllHeaders() {
  
	  RestAssured.baseURI="https://reqres.in";
	  
	  RequestSpecification httprequest=RestAssured.given();
	
	  Response resp=httprequest.request(Method.GET, "/api/users?page=2");
	   
  
	            
	  
		
		  Headers headers=resp.headers();
		  
		  for(Header h: headers) { System.out.println(h.getName()+ "    "
		  +h.getValue());
		  
		  
		  
		  }
		 
	  
	  
  
  }



  @Test(priority=1,enabled=false)
  public void validateResponse() {
	  
	  RestAssured.baseURI="https://reqres.in";
	  
	  RequestSpecification httprequest=RestAssured.given();
	
	  Response resp=httprequest.request(Method.GET, "/api/users?page=2");
	   
    
	  JsonPath json=resp.jsonPath();
	 
	  
	  List<String> li =json.get("data.email");
	  
	  for(String s:li) {
		  System.out.println(s);
		  
	  }
	  
  }

  
  @Test(priority=2)
  public void validateAuthentication() {
	  
	  RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication/";
	  
	 
	  
		
		  PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme();
		  authscheme.setUserName("ToolsQA"); authscheme.setPassword("TestPassword");
		 RestAssured.authentication=authscheme;
	  
	  
	
	 RequestSpecification httprequest=RestAssured.given();
	  //httprequest.auth().basic("ToolsQA", "TestPassword");
	  
	  
	  Response resp=httprequest.request(Method.GET, "");
	  
	  String faultid=resp.jsonPath().get("FaultId");	  
	  Assert.assertEquals(faultid, "OPERATION_SUCCESS");  
	  
	  
	  
  }
  
  
  
  
  
}

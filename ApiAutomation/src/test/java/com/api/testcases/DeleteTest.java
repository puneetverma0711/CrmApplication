package com.api.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterMethod;

public class DeleteTest {
  
	

	@Test
  public void deleterecord() {
        RestAssured.baseURI="http://localhost:3000/posts";
		
		RequestSpecification httprequest=RestAssured.given();
		 Response resp=httprequest.request(Method.GET,"");
	          JsonPath jsonevaluator=resp.jsonPath();
	          int val=jsonevaluator.get("[8].id");
	          System.out.println(val);
	          
	          Response deleteresponse=httprequest.request(Method.DELETE,"/"+val);
     		 int code=deleteresponse.getStatusCode();
     		 System.out.println(code);
	       /*   List<Integer> li=jsonevaluator.get("[4].id");
	          System.out.println(li.size());
	       
	          Iterator<Integer> it=li.iterator();
	          
	          outer:while(it.hasNext()) {
	        	  
	        	  int id=it.next();
	        	
	        	  System.out.println(id);  
	        	  /* if(id.equals("1")) {
	        		 
	        		 Response deleteresponse=httprequest.request(Method.DELETE,"/api/v1/employees/"+id);
	        		 int code=deleteresponse.getStatusCode();
	        		 System.out.println(code); 
	        		 break outer;
	        	 }  */
	        	  
	        	  
			
	        		 
	        	  
	        	  
	        	  
	          } 
	          
	          
	    	 
	
  
	
  @AfterMethod
  public void afterMethod() {
  
  
  }

}

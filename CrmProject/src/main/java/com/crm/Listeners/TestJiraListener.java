package com.crm.Listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.Util.JiraPolicy;
import com.crm.Util.JiraServiceProvider;

public class TestJiraListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		JiraPolicy jirapolicy=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady=jirapolicy.logticketready();
		if(isTicketReady) {
			
			JiraServiceProvider jirasp=new JiraServiceProvider("https://puneetverma0711.atlassian.net","puneetverma0711@gmail.com","VsbMbSeBNOGrTK4d6NEBF3E2","TA");
			String issuesummary=result.getMethod().getConstructorOrMethod().getMethod().getName()+ "got failed due to some assertion or exception";
			String issuedescription=result.getThrowable().getMessage()+"\n";
			issuedescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			jirasp.createjiraticket("Bug", issuesummary, issuedescription, "naveen");
			         
			
			
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

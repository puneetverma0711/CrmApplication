package com.crm.Util;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {

	public JiraClient jira;
	public String project;
	
	
	
	public JiraServiceProvider(String jiraurl,String username,String password,String project) {
		
		BasicCredentials creds=new BasicCredentials(username,password);
		jira=new JiraClient(jiraurl,creds);
		this.project=project;		
	}
	
	
	
	
	public void createjiraticket(String issuetype,String summary,String description,String reportername) { 
		
		try {
			FluentCreate fluentcreate=jira.createIssue(project, issuetype);
			fluentcreate.field(Field.SUMMARY, summary);
			fluentcreate.field(Field.DESCRIPTION, description);
			Issue issue=fluentcreate.execute();
			
		} catch (JiraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}

package com.wipro.frs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.wipro.frs.util.User;

public class FRS_LOGOUT implements SessionAware{

	Map<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute() {
		String id = session.get("id").toString();
		User user = new User();

		
		  boolean logout1= user.logout(id);
		  
		  if (logout1 == true) 
		  {   
			  return "SUCCESS"; 
		} else
		 
		return "ERROR";
	}

}
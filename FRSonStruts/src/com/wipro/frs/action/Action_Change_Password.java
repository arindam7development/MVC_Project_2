package com.wipro.frs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wipro.frs.entity.CredentialsBean;
import com.wipro.frs.util.User;

public class Action_Change_Password extends ActionSupport {
	
	CredentialsBean credential = new CredentialsBean() ;
public CredentialsBean getCredential() {
		return credential;
	}
	public void setCredential(CredentialsBean credential) {
		this.credential = credential;
	}
public String execute() {
		
				
		User user = new User();
		
		String status = user.changePassword(credential, credential.getPassword());
		
			if (status.equals("success")) {
		
			return "success";
			
		}
		 else {
			return "fail";
			
		}
}
}

package com.wipro.frs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wipro.frs.entity.ProfileBean;
import com.wipro.frs.util.User;

@SuppressWarnings("serial")
public class FRS_ACTION_Reg extends ActionSupport {
	ProfileBean profilebean;		
	public ProfileBean getProfilebean() {
		return profilebean;
	}

	public void setProfilebean(ProfileBean profilebean) {
		this.profilebean = profilebean;
	}



	public String execute() {
      User u = new User();
      String str = u.register(profilebean);
    	  return str;
      
	  
		
	}
}

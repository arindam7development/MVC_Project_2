package com.wipro.frs.util;

import com.wipro.frs.dao.CredentialsDAO;
import com.wipro.frs.entity.CredentialsBean;

public class Authentication {
	boolean validity;

	boolean authenticate(CredentialsBean c) {
		CredentialsDAO dao = new CredentialsDAO();
		CredentialsBean cb = dao.findById(c.getId());
		
		validity = c.getPassword().equals(cb.getPassword()) ? true : false;
		
		return validity;
		

	}

	String authorize(String userId, boolean validity) {
	
		String Usertype;
		CredentialsDAO dao = new CredentialsDAO();
		CredentialsBean cb = dao.findById(userId);
		Usertype = cb.getType();
		if (!validity) {
			return "NotValid";
		}
		return Usertype;
	}


	  public int changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) {
	
		  CredentialsDAO crdao=new CredentialsDAO();
		  int logstatus=crdao.changeLogin(credentialsBean,loginStatus);
		  
	  return logstatus;
      
	}
}

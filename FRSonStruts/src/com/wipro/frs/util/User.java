package com.wipro.frs.util;

import com.wipro.frs.dao.CredentialsDAO;
import com.wipro.frs.dao.ProfileDAO;
import com.wipro.frs.entity.CredentialsBean;
import com.wipro.frs.entity.ProfileBean;

public class User {

	Authentication a = new Authentication();
	
	public String register(ProfileBean profileb){
	ProfileDAO p = new ProfileDAO();
		 
			String usid=	p.createProfile(profileb);
			
			CredentialsBean cb1 = new CredentialsBean();
			cb1.setId(profileb.getId());
			cb1.setPassword(profileb.getPassword());
			CredentialsDAO cdao = new CredentialsDAO();
			String s=cdao.createUser(cb1);
			
		return "SUCCESS";
			
	}
	  public String login(CredentialsBean credentialsBean) {
		  int loginStatus = 1;
		  Authentication auth=new Authentication();
		  boolean b=auth.authenticate(credentialsBean);
		
		  String type=auth.authorize(credentialsBean.getId(), b);
	
		  int status=auth.changeLoginStatus(credentialsBean,loginStatus);
		  if (type != null) {
				return type;
			} else
				return null;
		 
	  }
	
  
		    
	public String changePassword(CredentialsBean userBean, String newPassword) {
       
CredentialsDAO changePassword1 = new CredentialsDAO();
userBean.setPassword(newPassword);
boolean statusChangePassword= changePassword1.changePassword(userBean);
 if(statusChangePassword)
return "success";
 else return "fail";
}


public boolean logout(String userId) {
	int loginStatus=0;
	CredentialsDAO cred=new CredentialsDAO();
	int i=cred.changeLogout(userId,loginStatus);
	if(i!=0)
	{return true;
	
	}else
	
	return false;
}

}	
		
		
		
	


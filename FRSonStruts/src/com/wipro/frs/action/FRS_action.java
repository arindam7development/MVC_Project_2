package com.wipro.frs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wipro.frs.entity.CredentialsBean;
import com.wipro.frs.util.User;

@SuppressWarnings("serial")
public class FRS_action extends ActionSupport implements SessionAware{
@SuppressWarnings("unused")
private SessionMap<String,Object> sessionMap;
	
	@SuppressWarnings("unchecked")
	public void setSession(Map<String, Object> map)
	
	{
		sessionMap=(SessionMap)map;
	}
	
	CredentialsBean cb = new CredentialsBean() ;

	


	public CredentialsBean getCb() {
		return cb;
	}
  

	public void setCb(CredentialsBean cb) {
		this.cb = cb;
	}


	public String execute() {
		
	
		User u = new User();
		
		String userty = u.login(cb);
		
			if ("A".equals(userty)) {
			
			sessionMap.put("id",cb.getId());
			return "A";
			
		}
		else if ("C".equals(userty)) {
			
			sessionMap.put("id",cb.getId());
			return "C";
		} else {
			return "FAIL";
			
		}
     
	}

}

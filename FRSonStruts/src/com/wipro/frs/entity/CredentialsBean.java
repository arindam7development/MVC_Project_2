package com.wipro.frs.entity;

public class CredentialsBean {

  public String id;

  private String password;

  private String type;

  private int loginStatus;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getLoginStatus() {
	return loginStatus;
}

public void setLoginStatus(int loginStatus) {
	this.loginStatus = loginStatus;
}



}
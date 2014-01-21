package com.wipro.frs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.RouteBean;

public class AdminAddRoute extends ActionSupport {

	RouteBean routebean;

	
	public RouteBean getRoutebean() {
		return routebean;
	}


	public void setRoutebean(RouteBean routebean) {
		this.routebean = routebean;
	}


	public String execute() {
		Administrator a = new Administrator();
		String strutsResult = a.addRoute(routebean);
		if (strutsResult.equals("SUCCESS")) {

			return "SUCCESS";
		} else {
			return "ERROR";

		}
	}

}
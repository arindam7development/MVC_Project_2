package com.wipro.frs.action;

import java.util.ArrayList;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.RouteBean;

public class AdminDisplayAllRoutes {
	private ArrayList<RouteBean> alistRoute = new ArrayList<RouteBean>();
	private RouteBean routebean=new RouteBean();
	
	
	
	public RouteBean getRoutebean() {
		return routebean;
	}

	public void setRoutebean(RouteBean routebean) {
		this.routebean = routebean;
	}

	
	
	

	public ArrayList<RouteBean> getAlistRoute() {
		return alistRoute;
	}

	public void setAlistRoute(ArrayList<RouteBean> alistRoute) {
		this.alistRoute = alistRoute;
	}

	public String execute() {

		try {
			Administrator admin = new Administrator();
			alistRoute = admin.viewByAllRoute();
			
		} catch (Exception e) {
			System.out.print(e);

			return "ERROR";
		}
			return "SUCCESS";

	}

}


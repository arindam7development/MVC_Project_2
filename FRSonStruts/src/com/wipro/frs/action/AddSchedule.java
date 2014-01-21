package com.wipro.frs.action;

import java.util.ArrayList;

import com.wipro.frs.dao.RouteDAO;
import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;
import com.wipro.frs.entity.RouteBean;
import com.wipro.frs.entity.ScheduleBean;

public class AddSchedule {
	private ScheduleBean schedulebean= new ScheduleBean();
	public ScheduleBean getSchedulebean() {
		return schedulebean;
	}
	public void setSchedulebean(ScheduleBean schedulebean) {
		this.schedulebean = schedulebean;
	}
	public ArrayList<FlightBean> alistFlight = new ArrayList<FlightBean>();
	private FlightBean flightbean=new FlightBean();
	public ArrayList<RouteBean> alistRoute = new ArrayList<RouteBean>();
	private RouteBean routebean=new RouteBean();
	
	public FlightBean getFlightbean() {
		return flightbean;
	}
	public void setFlightbean(FlightBean flightbean) {
		this.flightbean = flightbean;
	}
	
	public ArrayList<FlightBean> getAlistFlight() {
		return alistFlight;
	}
	public void setAlistFlight(ArrayList<FlightBean> alistFlight) {
		this.alistFlight = alistFlight;
	}
	public ArrayList<RouteBean> getAlistRoute() {
		return alistRoute;
	}
	public void setAlistRoute(ArrayList<RouteBean> alistRoute) {
		this.alistRoute = alistRoute;
	}
	public RouteBean getRoutebean() {
		return routebean;
	}
	public void setRoutebean(RouteBean routebean) {
		this.routebean = routebean;
	}
	public String execute() {
			try {
			Administrator admin = new Administrator();
			alistFlight = admin.viewByAllFlights();
			RouteDAO routeObj = new RouteDAO();
			alistRoute = routeObj.findAll();
					
		}
		catch (Exception e) {
			System.out.print(e);

			return "ERROR";
		}
		
		return "SUCCESS";

	}
	public String executeqwe() {
		return "success";
		
	}
		
}

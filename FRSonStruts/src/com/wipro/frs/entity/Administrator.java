package com.wipro.frs.entity;

import java.util.ArrayList;
import java.util.Date;

import com.wipro.frs.dao.FlightDAO;
import com.wipro.frs.dao.PassengerDAO;
import com.wipro.frs.dao.ReservationDAO;
import com.wipro.frs.dao.RouteDAO;
import com.wipro.frs.dao.ScheduleDAO;
import com.wipro.frs.entity.RouteBean;
import com.wipro.frs.entity.PassengerBean;
import com.wipro.frs.entity.ScheduleBean;
public class Administrator {
	ArrayList<FlightBean> flightArrayList = new ArrayList<FlightBean>();
	

	public ArrayList<FlightBean> getFlightArrayList() {
		return flightArrayList;
	}

	public void setFlightArrayList(ArrayList<FlightBean> flightArrayList) {
		this.flightArrayList = flightArrayList;
	}

	public String addFlight(FlightBean flightbean) {
		String resultOfaddFlight;
		FlightDAO flightdaoinstance = new FlightDAO();
		resultOfaddFlight = flightdaoinstance.createFlight(flightbean);
		return resultOfaddFlight;
	}

	public boolean modifyFlight(FlightBean flightbean) {
		FlightDAO modifyFlight= new FlightDAO();
	    boolean result=modifyFlight.updateFlight(flightbean);
		return result;

	}

	public int removeFlight(ArrayList<String> flightId) {
		int status = 0;
		boolean value = false;
		
		int n = flightId.size();
		
		
		FlightDAO flightdaoinstance = new FlightDAO();
		
		if(value){
			status =1;
			
		}
		else status = 0;
		return status;
		
	}
	ArrayList<ScheduleBean> ScheduleArrayList = new ArrayList<ScheduleBean>();
	
	public ArrayList<ScheduleBean> getScheduleArrayList() {
		return ScheduleArrayList;
	}

	public void setScheduleArrayList(ArrayList<ScheduleBean> scheduleArrayList) {
		ScheduleArrayList = scheduleArrayList;
	}

	public String addSchedule(ScheduleBean schedulebean) {
		String resultOfaddSchedule;
		ScheduleDAO scheduledaoinstance= new ScheduleDAO();
		resultOfaddSchedule=scheduledaoinstance.createSchedule(schedulebean);
	    return resultOfaddSchedule;
	}

	public boolean modifySchedule(ScheduleBean schedulebean) {
		return false;
	}

	public int removeSchedule(ArrayList<String> scheduleid) {
		return 0;
	}
	ArrayList<RouteBean> routeArrayList = new ArrayList<RouteBean>();
	
	public ArrayList<RouteBean> getRouteArrayList() {
		return routeArrayList;
	}

	public void setRouteArrayList(ArrayList<RouteBean> routeArrayList) {
		this.routeArrayList = routeArrayList;
	}

	public String addRoute(RouteBean routebean) {
		String str;
		RouteDAO routedao = new RouteDAO();
		str = routedao.createRoute(routebean);
		return str;
	}

	public boolean modifyRoute(RouteBean routebean) {
		return false;
	}

	public int removeRoute(ArrayList<String> routeid) {
		return 0;
	}

	public FlightBean viewByFlightId(String flightId) {
		 FlightBean flightDetails= new FlightBean();
		  FlightDAO viewById = new FlightDAO();
		  flightDetails=viewById.findById(flightId);
	  return flightDetails;
	}

	public RouteBean viewByRouteId(String routeid) {
		return null;
	}

	public ArrayList<FlightBean> viewByAllFlights() {
		try {
			
			FlightDAO flightDao = new FlightDAO();
			flightArrayList = flightDao.findAll();

		} catch (Exception e) {
			

		}
		
		return flightArrayList;
	}

	public ArrayList<RouteBean> viewByAllRoute() {
		try {
			RouteDAO routeDao = new RouteDAO();
			routeArrayList = routeDao.findAll();

		} catch (Exception e) {
		
		}
		
		return routeArrayList;
	}

	public ArrayList<ScheduleBean> viewByAllSchedule() {
		try {
			ScheduleDAO scheduleDao = new ScheduleDAO();
			ScheduleArrayList = scheduleDao.findAll();

		} catch (Exception e) {
			

		}
		
		return ScheduleArrayList;
	}
	public ArrayList<String> viewAllFlightId() 
	  {
		  ArrayList<String> flightId =new ArrayList<String>();
		  FlightDAO flightList=new FlightDAO();
		  flightId=flightList.findOnlyFlightId();
		  return flightId;
		  }
	  
	  public ArrayList<String> viewAllRouteId() {
		  ArrayList<String> routeId =new ArrayList<String>();
		  RouteDAO routeIdList= new RouteDAO();
		  routeId=routeIdList.findOnlyRouteId();
		  return routeId;
		  }
	  
	public ScheduleBean viewByScheduleId(String scheduleid) {
		return null;
	}

	public ArrayList<PassengerBean> viewPassengersByFlight(String flighIdFromUI, Date admindate) {
		
		ReservationDAO view =new ReservationDAO();
		PassengerDAO viewPassenger = new PassengerDAO();
		
		ArrayList<String> rId= new ArrayList<String>();
		
	    rId=view.findById(flighIdFromUI,admindate);
	    
		ArrayList<PassengerBean> list =viewPassenger.findById(rId);
		
		
		return list;
	}

	


}
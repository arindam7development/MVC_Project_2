package com.wipro.frs.action;

import java.util.ArrayList;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;

public class AdminDisplayAllFlights {
	private ArrayList<FlightBean> alistFlight = new ArrayList<FlightBean>();
	private FlightBean flightbean=new FlightBean();
	
	
	
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

	public String execute() {

		try {
			Administrator admin = new Administrator();
			alistFlight = admin.viewByAllFlights();
			
		} catch (Exception e) {
			return "ERROR";
		}
		return "SUCCESS";

	}

}

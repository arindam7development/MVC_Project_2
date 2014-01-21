package com.wipro.frs.action;

import java.util.ArrayList;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;

public class Delete_Flight {
			FlightBean flight ;

	public ArrayList<FlightBean> flightI = new ArrayList<FlightBean>();
	
	public ArrayList<String> flightIDs = new ArrayList<String>();

	
public ArrayList<FlightBean> getFlightI() {
		return flightI;
	}

	public void setFlightI(ArrayList<FlightBean> flightI) {
		this.flightI = flightI;
	}

public ArrayList<String> getFlightIDs() {
		return flightIDs;
	}

	public void setFlightIDs(ArrayList<String> flightIDs) {
		this.flightIDs = flightIDs;
}

	public String execute() {
	
		
		int sta = 0;
				String res = null;
			Administrator a = new Administrator();
		
		sta = a.removeFlight(flightIDs);
		if (sta == 1) {
			res = "SUCCESS";
		} else
			res = "FAIL";
		return res;
	}

	
}

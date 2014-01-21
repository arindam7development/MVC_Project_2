package com.wipro.frs.action;

import java.util.ArrayList;
import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;

public class Delete_populate {
	FlightBean f;

	public FlightBean getF() {
		return f;
	}

	public void setF(FlightBean f) {
		this.f = f;
	}
	public ArrayList<FlightBean> alistFlight = new ArrayList<FlightBean>();

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
				}
		catch (Exception e) {
			return "ERROR";
		}
		
		return "SUCCESS";

	
	}
	
}

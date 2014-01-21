package com.wipro.frs.action;

import java.util.ArrayList;
import java.util.Date;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.PassengerBean;
public class viewPassengerAction {
	String flighIdFromUI = "null";
	ArrayList<String> flightId = new ArrayList<String>();
	ArrayList<PassengerBean> passengers = new ArrayList<PassengerBean>();
	Date admindate;

	public String execute() {
		Administrator viewSchedule = new Administrator();
		flightId = viewSchedule.viewAllFlightId();

		return "populate";

	}

	public String viewPassengers() {

		Administrator viewPassenger = new Administrator();
		passengers = viewPassenger.viewPassengersByFlight(flighIdFromUI,
				admindate);
		return "success";

	}

	public ArrayList<PassengerBean> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<PassengerBean> passengers) {
		this.passengers = passengers;
	}

	public Date getAdmindate() {
		return admindate;
	}

	public void setAdmindate(Date admindate) {
		this.admindate = admindate;
	}

	public ArrayList<String> getFlightId() {
		return flightId;
	}

	public void setFlightId(ArrayList<String> flightId) {
		this.flightId = flightId;
	}

	public String getFlighIdFromUI() {
		return flighIdFromUI;
	}

	public void setFlighIdFromUI(String flighIdFromUI) {
		this.flighIdFromUI = flighIdFromUI;
	}

}

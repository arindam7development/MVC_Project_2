package com.wipro.frs.action;

import java.util.ArrayList;


import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;


public class FlightModify {
	ArrayList<String> nameAndId= new ArrayList<String>();
	String flightId="null";
	FlightBean forModify= new FlightBean();
	public String execute()
	{
		
		Administrator modifyFlight = new Administrator();
		nameAndId= modifyFlight.viewAllFlightId();
		return "success";
		
	}
	public String showToModify()
	{
		Administrator modifyFlight = new Administrator();
		forModify=modifyFlight.viewByFlightId(flightId);
		return "success";
		
	}
	
	public String modify()
	{
		Administrator modifyFlight3 = new Administrator();
		modifyFlight3.modifyFlight(forModify);
		return "success";
		
	}
	
	

	public ArrayList<String> getNameAndId() {
		return nameAndId;
	}

	public void setNameAndId(ArrayList<String> nameAndId) {
		this.nameAndId = nameAndId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public FlightBean getForModify() {
		return forModify;
	}
	public void setForModify(FlightBean forModify) {
		this.forModify = forModify;
	}
	
	
}

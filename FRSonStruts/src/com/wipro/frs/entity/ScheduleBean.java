package com.wipro.frs.entity;

public class ScheduleBean {

  public String id;
  
  public String flightId;

  public String routeId;

  public String availableDays;

  public int departureTime;

  public int travelDuration;


  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFlightId() {
	return flightId;
}

public void setFlightId(String flightId) {
	this.flightId = flightId;
}

public String getRouteId() {
	return routeId;
}

public void setRouteId(String routeId) {
	this.routeId = routeId;
}

public String getAvailableDays() {
	return availableDays;
}

public void setAvailableDays(String availableDays) {
	this.availableDays = availableDays;
}

public int getDepartureTime() {
	return departureTime;
}

public void setDepartureTime(int departureTime) {
	this.departureTime = departureTime;
}

public int getTravelDuration() {
	return travelDuration;
}
public void setTravelDuration(int travelDuration) {
	this.travelDuration = travelDuration;
}


}
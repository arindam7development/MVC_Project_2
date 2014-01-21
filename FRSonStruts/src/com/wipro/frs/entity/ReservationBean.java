package com.wipro.frs.entity;

import java.util.Date;

public class ReservationBean extends RouteBean {

  private String id;

  private String userId;

  private String flightId;

  private String source;

  private String destination;

  private Date bookingDate;

  private Date journeyDate;
  private String bookingStatus;
  private String reservationType;
  public String getReservationType() {
	return reservationType;
}

public void setReservationType(String reservationType) {
	this.reservationType = reservationType;
}

private int noOfSeats;

  private double fare;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getFlightId() {
	return flightId;
}

public void setFlightId(String flightId) {
	this.flightId = flightId;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public Date getBookingDate() {
	return bookingDate;
}

public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}

public Date getJourneyDate() {
	return journeyDate;
}

public void setJourneyDate(Date journeyDate) {
	this.journeyDate = journeyDate;
}

public String getBookingStatus() {
	return bookingStatus;
}

public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}

public int getNoOfSeats() {
	return noOfSeats;
}

public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}

public double getFare() {
	return fare;
}

public void setFare(double fare) {
	this.fare = fare;
}


  
}
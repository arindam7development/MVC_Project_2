package com.wipro.frs.entity;

public class RouteBean {

  private String id;

  private String source;

  private String destination;

  private int distance;

  private double fare;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
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

public int getDistance() {
	return distance;
}

public void setDistance(int distance) {
	this.distance = distance;
}

public double getFare() {
	return fare;
}

public void setFare(double fare) {
	this.fare = fare;
}


  

}
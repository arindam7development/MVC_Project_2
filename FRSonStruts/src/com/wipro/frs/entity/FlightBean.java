package com.wipro.frs.entity;

public class FlightBean {

	private String id;
	private String name;
	private int seatingCapacity;
	private int reservationCapacity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name:" + name);
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
		System.out.println("seatingCapacity:" + seatingCapacity);
	}

	public int getReservationCapacity() {
		return reservationCapacity;
	}

	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}

}
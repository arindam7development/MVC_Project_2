package com.wipro.frs.entity;

public class PassengerBean {

  public String reservationId;

  public String fullName;

  public String gender;
  public String seatNo;

  public int Age;

  public String getReservationId() {
	return reservationId;
}

public void setReservationId(String reservationId) {
	this.reservationId = reservationId;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getSeatNo() {
	return seatNo;
}

public void setSeatNo(String seatNo) {
	this.seatNo = seatNo;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}



}
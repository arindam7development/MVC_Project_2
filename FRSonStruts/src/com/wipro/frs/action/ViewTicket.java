package com.wipro.frs.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.wipro.frs.entity.Customer;
import com.wipro.frs.entity.PassengerBean;
import com.wipro.frs.entity.ReservationBean;


public class ViewTicket implements SessionAware{
	
	ReservationBean ticket = new ReservationBean();
	ArrayList<PassengerBean> ticket1 = new ArrayList<PassengerBean>();
	ArrayList<String> reservationIdS = new ArrayList<String>();
	String reservationIdFromUI;
	
	private SessionMap<String, Object> sessionMap;

	@SuppressWarnings("unchecked")
	public void setSession(Map<String, Object> map)

	{
		sessionMap = (SessionMap) map;
	}
	
public String execute()
{
	Customer viewticket = new Customer();
	
	String UserId1 = sessionMap.get("id").toString();
	
	System.out.println(UserId1);
	
	reservationIdS=viewticket.getReservationId(UserId1);
	return "populate";
	
	
}

public String viewTicket()
{
	Customer viewticket = new Customer();
	ticket=viewticket.viewTicket(reservationIdFromUI);
	ticket1=viewticket.viewTicket1(reservationIdFromUI);
	return "success";
	
}



public ArrayList<PassengerBean> getTicket1() {
	return ticket1;
}

public void setTicket1(ArrayList<PassengerBean> ticket1) {
	this.ticket1 = ticket1;
}

public ReservationBean getTicket() {
	return ticket;
}

public void setTicket(ReservationBean ticket) {
	this.ticket = ticket;
}

public String getReservationIdFromUI() {
	return reservationIdFromUI;
}

public void setReservationIdFromUI(String reservationIdFromUI) {
	this.reservationIdFromUI = reservationIdFromUI;
}

public ArrayList<String> getReservationIdS() {
	return reservationIdS;
}

public void setReservationIdS(ArrayList<String> reservationIdS) {
	this.reservationIdS = reservationIdS;
}


}

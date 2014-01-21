package com.wipro.frs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import com.wipro.frs.dao.FlightDAO;
import com.wipro.frs.dao.PassengerDAO;
import com.wipro.frs.dao.ReservationDAO;
import com.wipro.frs.dao.RouteDAO;
import com.wipro.frs.dao.ScheduleDAO;


/**
 * @author Arindam Mishra
 * @author Arun Sai Karthik
 * @category FRS
 * @version 1.0
 */
public class Customer {

	
	 public  ArrayList<String> viewSource() {
		 ArrayList<String> source =new ArrayList<String>();
		 RouteDAO viewSource = new RouteDAO();
		 source=viewSource.findAllSource();
			  return source;
		  }
	
	

public ScheduleBean viewScheduleByRoute(String source, String destination, Date date) {
	  RouteDAO findId = new RouteDAO();
	  ScheduleDAO scheduleDetails = new ScheduleDAO();
	  //ReservationDAO viewSchedule= new ReservationDAO();
	  RouteBean reserve = new RouteBean();
	  ScheduleBean correctSchedule= new ScheduleBean();
	  //ReservationBean schedule =new ReservationBean();
	  ArrayList<ScheduleBean> scheduleDetails1=new ArrayList<ScheduleBean>();
	  
	  System.out.println("From view Schedule" +source+ destination+ date);
	  reserve.setSource(source);
	  reserve.setDestination(destination);
	  reserve=findId.findRouteIDFromSD(reserve);
	  System.out.println("From view Schedule"+ reserve.getId());
	   scheduleDetails1 =scheduleDetails.findAllDetails(reserve.getId());
	  
	   Iterator<ScheduleBean> iterator = scheduleDetails1.iterator();
		while (iterator.hasNext()) 
		{
			ScheduleBean schedule1= new ScheduleBean();
			
			schedule1=iterator.next();
			
			System.out.println("From view Schedule"+ schedule1.getRouteId());
			
			
			String i=date.toString();
			
			
			
			
			System.out.println("From view Schedule int date"+i);
			String all[]=i.split(" ");
			
			String dateFromUser= all[2];
			
			System.out.println("From view Schedule date from user "+dateFromUser);
			String dates =schedule1.getAvailableDays();
			System.out.println("From view Schedule"+dates);
			StringTokenizer availableDates = new StringTokenizer(dates,",");
			
			while (availableDates.hasMoreTokens()) 
			{
				String availableDate =availableDates.nextToken().trim();
				System.out.println("From view Schedule"+availableDate);
				
				if(availableDate.equals(dateFromUser))
				{
					
					correctSchedule.setId(schedule1.getId());
					System.out.println("From view Schedule"+ schedule1.getRouteId());
					
					correctSchedule.setFlightId(schedule1.getFlightId());
					System.out.println("From view Schedule"+ schedule1.getFlightId());
					correctSchedule.setRouteId(schedule1.getRouteId());
					correctSchedule.setDepartureTime(schedule1.getDepartureTime());
					correctSchedule.setTravelDuration(schedule1.getTravelDuration());
				
				}
				
			}
			
	
		}

	  
		System.out.println("From view Schedule out of loop"+correctSchedule.getRouteId());
	  
  return correctSchedule;
  }

  public String reserveTicket(ReservationBean reservationBean, PassengerBean passengers1,PassengerBean passengers2,PassengerBean passengers3) {
	
	  ReservationDAO reserve = new ReservationDAO();
		PassengerDAO passenger = new PassengerDAO();
		String reserveId1 = reserve.createReserveId();
		String reserveId2 = reservationBean.getSource().substring(0, 2);
		String reserveId3 = reservationBean.getDestination().substring(0, 2);
		String fullId = reserveId2 + reserveId3 + reserveId1;
		reservationBean.setId(fullId);

		reservationBean.setBookingStatus("0");
		reserve.createReservation(reservationBean);
		passengers1.setReservationId(fullId);
		passengers2.setReservationId(fullId);
		passengers3.setReservationId(fullId);
	  
	  if(reservationBean.getNoOfSeats()==3)
		{
		  
		  passenger.createPassenger(passengers1);
		  passenger.createPassenger(passengers2);
		  passenger.createPassenger(passengers3);
		
		}
		else if(reservationBean.getNoOfSeats()==2)
		{
			passenger.createPassenger(passengers1);
		passenger.createPassenger(passengers2);
			
			}
		else
		{
			passenger.createPassenger(passengers1);
			
			}
  return "booked";
  }

  public boolean cancelTicket(String reservationId) {
  return false;
  }

  

  public Map<ReservationBean,PassengerBean> printTicket(String reservationId) {
  return null;
  }


public ArrayList<String> viewDestination(String source)  {
	 ArrayList<String> destination =new ArrayList<String>();
	 RouteDAO viewDestination = new RouteDAO();
	 destination=viewDestination.findAllDestination(source);
	  return destination;
	  }


public String getFlightNamefromId(String flightId) {
	FlightDAO forFlightName = new FlightDAO();
	FlightBean flight = new FlightBean();
	 flight= forFlightName.findById(flightId);
	String flightName = flight.getName();
	return flightName;
}


public RouteBean getRouteBean(String routeId) {
	RouteDAO routeDetails= new RouteDAO();
	RouteBean route=routeDetails.findById(routeId);
	
	return route;
}



public void changeBookinStatus(ReservationBean reservationbean) {
	ReservationDAO reserve = new ReservationDAO();
	reserve.updateReservation(reservationbean);

}

public ArrayList<String> getReservationId(String userId) {
	ArrayList<String> rid = new ArrayList<String>();
	ReservationDAO viewTicket = new ReservationDAO();
	rid = viewTicket.getReservationIdForUserId(userId);
	return rid;
	
}
public ReservationBean viewTicket(String reservationId) {
	ReservationBean ticket1 = new ReservationBean();
	ReservationDAO ticket = new ReservationDAO();
	ticket1=ticket.findAllById(reservationId);
	return ticket1;
}

public ArrayList<PassengerBean> viewTicket1(String reservationId) {
	ArrayList<PassengerBean> ticket1 = new ArrayList<PassengerBean>();
	PassengerDAO ticket = new PassengerDAO();
	ArrayList<String> reservationId1 =new ArrayList<String>();
	reservationId1.add(reservationId);
	ticket1=ticket.findById(reservationId1);
	return ticket1;
}
}
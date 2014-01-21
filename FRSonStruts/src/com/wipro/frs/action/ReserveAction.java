package com.wipro.frs.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.Customer;
import com.wipro.frs.entity.FlightBean;
import com.wipro.frs.entity.PassengerBean;
import com.wipro.frs.entity.ReservationBean;
import com.wipro.frs.entity.RouteBean;
import com.wipro.frs.entity.ScheduleBean;
import com.wipro.frs.util.Payment;
public class ReserveAction implements SessionAware{
	private SessionMap<String, Object> sessionMap;

	@SuppressWarnings("unchecked")
	public void setSession(Map<String, Object> map)

	{
		sessionMap = (SessionMap) map;
	}

	ArrayList<String> sourceFromDatabase = new ArrayList<String>();
	ArrayList<String> destinationFromDatabase = new ArrayList<String>();
	ScheduleBean scheduleFromBl = new ScheduleBean();
	String flightName;
	RouteBean forUser = new RouteBean();
	PassengerBean passengerBean1 = new PassengerBean();
	PassengerBean passengerBean2 = new PassengerBean();
	PassengerBean passengerBean3 = new PassengerBean();
	ReservationBean reservation = new ReservationBean();
	String cardNumber = "null";
	String validFrom = "null";
	String validTo = "null";
	String source = "null";
	String destination = "null";
	Date date;

	public String execute() {
		Customer reserve = new Customer();
		sourceFromDatabase = reserve.viewSource();

		return "populate";
	}

	public String destination() {
		Customer reserve1 = new Customer();
		sessionMap.put("source", getSource());

		destinationFromDatabase = reserve1.viewDestination(source);
		return "populate";
	}

	public String findrouteid() {
		Customer reserve2 = new Customer();
		String sourceFromUI = sessionMap.get("source").toString();

		scheduleFromBl = reserve2.viewScheduleByRoute(sourceFromUI,
				destination, date);
		flightName = reserve2.getFlightNamefromId(scheduleFromBl.getFlightId());
		forUser = reserve2.getRouteBean(scheduleFromBl.getRouteId());
		String UserId = sessionMap.get("id").toString();
		
		sessionMap.put("userId", UserId);
		sessionMap.put("flightId", scheduleFromBl.getFlightId());
		sessionMap.put("source", forUser.getSource());
		sessionMap.put("destination", forUser.getDestination());
		sessionMap.put("journeyDate", date);
		sessionMap.put("fare", forUser.getFare());

		return "success";
	}

	public String reserveTicket() throws ParseException

	{
		Administrator modify = new Administrator();
		String Userid = sessionMap.get("userId").toString();
		String flightId = sessionMap.get("flightId").toString();
		String source = sessionMap.get("source").toString();
		String destination = sessionMap.get("destination").toString();
		FlightBean afterBook = new FlightBean();
		double fare = Double.parseDouble(sessionMap.get("fare").toString());
		
		reservation.setUserId(Userid);
		reservation.setFlightId(flightId);
		reservation.setSource(source);
		reservation.setDestination(destination);
		int seats = reservation.getNoOfSeats();
		double totalFare = seats * fare;
		sessionMap.put("tfare", totalFare);
		reservation.setFare(totalFare);
	
		
	
		String DATE1 = sessionMap.get("journeyDate").toString();
		String all[] = DATE1.split(" ");
		String dateFromUser = all[1]+"-"+all[2]+"-"+all[5];
		Date date = new SimpleDateFormat("MMM-dd-yyyy", Locale.ENGLISH).parse(dateFromUser);

			
		reservation.setJourneyDate(date);
		reservation.setBookingDate(new Date());
		Customer reserve3 = new Customer();
		String reserveStaus = reserve3.reserveTicket(reservation,
				passengerBean1, passengerBean2, passengerBean3);

		if (reserveStaus.equals("booked")) {
			afterBook = modify.viewByFlightId(flightId);

			int capacity = (afterBook.getReservationCapacity())
					- (reservation.getNoOfSeats());

			afterBook.setReservationCapacity(capacity);

			modify.modifyFlight(afterBook);
			return "success";
		} else
			return "error";
	}

	public String makePayment() {

		String result = "null";
		Payment makePayment1 = new Payment();
		Payment makePayment2 = new Payment();
		String money = sessionMap.get("tfare").toString();
		double amount = Double.parseDouble(money);

		makePayment2.setCreditCardNumber(cardNumber);

		makePayment2.setValidFrom(validFrom);

		makePayment2.setValidTo(validTo);

		String userId = sessionMap.get("userId").toString();

		@SuppressWarnings("unused")
		boolean validity = makePayment1.findByCardNumber(userId, cardNumber);

		@SuppressWarnings("unused")
		String Status = makePayment1.process(makePayment2, amount);

		result = "success";

		if (result.equals("success")) {

			ReservationBean reservation1 = new ReservationBean();
			reservation1.setFlightId(sessionMap.get("flightId").toString());
			reservation1.setUserId(sessionMap.get("id").toString());
			reservation1.setSource(sessionMap.get("source").toString());
			reservation1.setDestination(sessionMap.get("destination")
					.toString());

			Customer reserve3 = new Customer();
			reserve3.changeBookinStatus(reservation1);
		}

		return "success";

	}

	public ReservationBean getReservation() {
		return reservation;
	}

	public void setReservation(ReservationBean reservation) {
		this.reservation = reservation;
	}

	public ScheduleBean getScheduleFromBl() {
		return scheduleFromBl;
	}

	public void setScheduleFromBl(ScheduleBean scheduleFromBl) {
		this.scheduleFromBl = scheduleFromBl;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public ArrayList<String> getDestinationFromDatabase() {
		return destinationFromDatabase;
	}

	public void setDestinationFromDatabase(
			ArrayList<String> destinationFromDatabase) {
		this.destinationFromDatabase = destinationFromDatabase;
	}

	public ArrayList<String> getSourceFromDatabase() {
		return sourceFromDatabase;
	}

	public void setSourceFromDatabase(ArrayList<String> sourceFromDatabase) {
		this.sourceFromDatabase = sourceFromDatabase;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public RouteBean getForUser() {
		return forUser;
	}

	public void setForUser(RouteBean forUser) {
		this.forUser = forUser;
	}

	public PassengerBean getPassengerBean1() {
		return passengerBean1;
	}

	public void setPassengerBean1(PassengerBean passengerBean1) {
		this.passengerBean1 = passengerBean1;
	}

	public PassengerBean getPassengerBean2() {
		return passengerBean2;
	}

	public void setPassengerBean2(PassengerBean passengerBean2) {
		this.passengerBean2 = passengerBean2;
	}

	public PassengerBean getPassengerBean3() {
		return passengerBean3;
	}

	public void setPassengerBean3(PassengerBean passengerBean3) {
		this.passengerBean3 = passengerBean3;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

}

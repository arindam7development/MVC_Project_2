package com.wipro.frs.dao;

import com.wipro.frs.entity.ReservationBean;
import com.wipro.frs.util.DBUtil;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
public class ReservationDAO {

  public String createReservation(ReservationBean reservationbean) {
 
	  PreparedStatement pst;
		Connection conn;
		try {
			conn = DBUtil.getDBConnection("Type4");
			String tablename = "FRS_TBL_RESERVATION";

			pst = conn.prepareStatement("insert into " + tablename + " values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, reservationbean.getId() );
			pst.setString(2, reservationbean.getUserId() );
			pst.setString(3, reservationbean.getFlightId() );
			pst.setString(4, reservationbean.getSource() );
			pst.setString(5, reservationbean.getDestination() );
			pst.setString(6, reservationbean.getReservationType() );
			pst.setDate(7, new java.sql.Date(reservationbean.getBookingDate().getTime()));
			pst.setDate(8, new java.sql.Date(reservationbean.getJourneyDate().getTime()));
			pst.setInt(9, reservationbean.getNoOfSeats());
			pst.setDouble(10, reservationbean.getFare());
			int status= Integer.parseInt( reservationbean.getBookingStatus());
			pst.setInt(11, status);
			 pst.executeUpdate();
	
		} catch (Exception e) {
		
		}

		return "Success";
  }

  public boolean updateReservation(ReservationBean reservationbean) {
		try {

			Connection conn = DBUtil
					.getDBConnection("Type4");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("update FRS_TBL_reservation set bookingstatus=1 where userid='"
							+ reservationbean.getUserId()
							+ "' and flightid='"
							+ reservationbean.getFlightId() + "'");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;

	}
  public boolean deleteReservation(ArrayList<String> reservationId) {
  return false;
  }

  public ArrayList<ReservationBean> findAll() {
  return null;
  }
	public ArrayList<String> findById(String flighIdFromUI, Date admindate)

	{
		ArrayList<String> resrevationid = new ArrayList<String>();

		try {

			Connection conn;
			conn = DBUtil.getDBConnection("Type4");
			PreparedStatement pst;
			ResultSet rs;
			String DATE1 =admindate.toString();
			String all[] = DATE1.split(" ");
			String dateFromUser = all[2]+"-"+all[1]+"-"+all[5].substring(2, 4);
			
			Date date1 = new SimpleDateFormat("dd-MMM-yy", Locale.ENGLISH).parse(dateFromUser);
				
			pst = conn
					.prepareStatement("select reservationid from frs_tbl_reservation where flightid=? and journeydate ='"+dateFromUser+"'");
			pst.setString(1, flighIdFromUI);
		
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				resrevationid.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resrevationid;

	}

public String createReserveId() {
	
	String reservationid_seq = "null";
	try {

		Connection conn;
		conn = DBUtil.getDBConnection("Type4");
		PreparedStatement pst;
		ResultSet rs;
		pst = conn.prepareStatement("SELECT FRS_Seq_Reservationid.nextval from dual");
		rs = pst.executeQuery();
		while (rs.next()) {
			reservationid_seq = rs.getString(1);
		}
	}

	catch (Exception e) {
			}
	return reservationid_seq;
}
public ReservationBean findAllById(String reservationId) 
{
	ReservationBean ticket = new ReservationBean();

	try {

		Connection conn;
		conn = DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		PreparedStatement pst;
		ResultSet rs;
	
		
		pst = conn
				.prepareStatement("select * from frs_tbl_reservation where reservationId=?");
		pst.setString(1, reservationId);
	
		
		
		rs = pst.executeQuery();
		while (rs.next()) {
			ticket.setId(rs.getString(1));
			ticket.setUserId(rs.getString(2));
			ticket.setFlightId(rs.getString(3));
			ticket.setSource(rs.getString(4));
			ticket.setDestination(rs.getString(5));
			ticket.setReservationType(rs.getString(6));
			ticket.setBookingDate(rs.getDate(7));
			ticket.setJourneyDate(rs.getDate(8));
			ticket.setNoOfSeats(rs.getInt(9));
			ticket.setFare(rs.getDouble(10));
			Integer i = rs.getInt(11);
			String status = i.toString();
			ticket.setBookingStatus(status);
		

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return ticket;

}

public ArrayList<String> getReservationIdForUserId(String userId) {

	{
		ArrayList<String> resrevationid = new ArrayList<String>();

		try {

			Connection conn;
			conn = DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
			PreparedStatement pst;
			ResultSet rs;

			System.out.println("From RDAO" + userId);
			
			
			
			pst = conn
					.prepareStatement("select reservationid from frs_tbl_reservation where userid=?");
			pst.setString(1,userId);
		
			
			
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				resrevationid.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resrevationid;

	}
}

}
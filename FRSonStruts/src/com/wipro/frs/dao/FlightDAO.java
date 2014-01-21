package com.wipro.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.wipro.frs.entity.FlightBean;
import com.wipro.frs.util.DBUtil;

public class FlightDAO {

	ArrayList<FlightBean> flightList = new ArrayList<FlightBean>();

	public String createFlightid(FlightBean f) {
		System.out.println("in side CREATE FLIGHT ID");
		String sql, userid, finalUserid, partAuto = null;
		userid = null;
		finalUserid = null;

		try {
			Connection c = DBUtil.getDBConnection("Type4");
			sql = "select FRS_SEQ_FLIGHTID.nextval FROM dual";
			Statement stmt1 = null;
			stmt1 = c.createStatement();
			ResultSet rs = stmt1.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				partAuto = rs.getString(1);
				userid = f.getName();
			}
			
			
			finalUserid = userid.substring(0, 2);
			finalUserid = finalUserid.concat(partAuto);

			

		} catch (Exception e) {

		}
		return finalUserid;

	}
	public ArrayList<String> findOnlyFlightId() {
		ArrayList<String> flightId1 = new ArrayList<String>();
		try {

			Connection conn;
			conn = DBUtil.getDBConnection("Type4");
			PreparedStatement pst;
			ResultSet rs;
			pst = conn.prepareStatement("select flightid from frs_tbl_flight");
			rs = pst.executeQuery();
			while (rs.next()) {
				flightId1.add(rs.getString(1));
			}
		}

		catch (Exception e) {
			
		}
		
		return flightId1;
	}
	public String createFlight(FlightBean flightbean) {

		Connection c = DBUtil.getDBConnection("Type4");
		PreparedStatement psmt;
		
		try {
			String tablename = "FRS_TBL_FLIGHT";
		
			String flightid = createFlightid(flightbean);
			
			psmt = c.prepareStatement("insert into " + tablename
					+ " values(?,?,?,?)");
			psmt.setString(1, flightid);
			psmt.setString(2, flightbean.getName());
			psmt.setInt(3, flightbean.getSeatingCapacity());
			psmt.setInt(4, flightbean.getReservationCapacity());

			int i = psmt.executeUpdate();
			if (i == 1)
				return "SUCCESS";
			else
				return "FAIL";
		}

		catch (Exception e) {
			
			return null;
		} finally {

		}
	}

	public boolean updateFlight(FlightBean flightbean) {

		boolean result = false;

		Connection conn;
		try {

			conn = DBUtil.getDBConnection("Type4");
			Statement stmt = conn.createStatement();
			
			int modify = stmt
					.executeUpdate("update FRS_TBL_FLIGHT set flightname='"
							+ flightbean.getName() + "',Seatingcapacity='"
							+ flightbean.getSeatingCapacity()
							+ "',Reservationcapacityregular='"
							+ flightbean.getReservationCapacity()
							+ "' where flightid='" + flightbean.getId() + "'");

			if (modify == 1)
				result = true;
			else
				result = false;
			
		} catch (Exception e) {
			
		}

		return result;
	}

	public boolean deleteFlight(ArrayList<String> userId) {
	          
		Connection c = DBUtil.getDBConnection("Type4");
		PreparedStatement psmt;
		
		try {
			
			int n = userId.size();
			
			for(int i=0;i<n;i++){
				
				String id = userId.get(i);
				psmt = c.prepareStatement("delete  from FRS_TBL_FLIGHT where FLIGHTID ='"+userId.get(i)+"'");
			psmt.executeUpdate();
			}
					}catch (Exception e) {
				
				return false;
			} finally {

			}
				
	 return true;			
			}
		
	

	public ArrayList<FlightBean> findAll() {
		Connection con = DBUtil.getDBConnection("Type4");
		
		ResultSet resultSet;
		PreparedStatement pst;

		try {


			
			String tablename = "FRS_TBL_FLIGHT";
			pst = con.prepareStatement("select * from " + tablename);
			resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				FlightBean flight = new FlightBean();
				flight.setId(resultSet.getString("flightId"));
				flight.setName(resultSet.getString("flightName"));
				flight.setSeatingCapacity(resultSet.getInt("seatingCapacity"));
				flight.setReservationCapacity(resultSet
						.getInt("reservationCapacityRegular"));
			
				flightList.add(flight);
			}
		} catch (Exception e) {
			
		}
		return flightList;
	}

	public ArrayList<FlightBean> getFlightlistDAO() {
		return flightList;
	}

	public void setFlightlistDAO(ArrayList<FlightBean> flightlistDAO) {
		this.flightList = flightlistDAO;
	}

	public FlightBean findById(String flightId) {
		  FlightBean flightDetailsById= new FlightBean();
			try
			{
				
				Connection conn;
				conn = DBUtil.getDBConnection("Type4");
				PreparedStatement pst;
				ResultSet rs;
				pst = conn.prepareStatement("select * from frs_tbl_flight where flightid='"+flightId+"'");
				rs = pst.executeQuery();
				while (rs.next()) 
				{
					
					flightDetailsById.setId(rs.getString(1));
					flightDetailsById.setName(rs.getString(2));
					flightDetailsById.setSeatingCapacity(rs.getInt(3));
					flightDetailsById.setReservationCapacity(rs.getInt(4));
					
				}
			}

			catch (Exception e) 
			{
			
			}
			
			return flightDetailsById; 
		  
	  }

	}


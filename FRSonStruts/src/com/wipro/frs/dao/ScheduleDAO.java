package com.wipro.frs.dao;
import java.util.ArrayList;

import com.wipro.frs.entity.ScheduleBean;
import com.wipro.frs.util.DBUtil;

import java.sql.*;
public class ScheduleDAO { 
	ArrayList<ScheduleBean> scheduleList = new ArrayList<ScheduleBean>();
public String createScheduleid(ScheduleBean sc) {
	
		Statement stmt2 = null;
		String sql = null;
		String partAuto = null;
		String source = null;
		String dest = null;
		
		String finalscheduleId = null;
		try {
			Connection ch = DBUtil.getDBConnection("Type4");
			System.out.println("I am here");
			sql = "select FRS_Seq_Scheduleid.nextval FROM dual";
			//sqlRouteTable1= "select Source from FRS_TBL_Route where Routeid = sc.getRouteId()";
			stmt2 = ch.createStatement();
			System.out.println("I am here 1");
			ResultSet rs1 = stmt2.executeQuery("select * from FRS_TBL_Route where Routeid = '"+sc.getRouteId()+"'");
			System.out.println("I am here 2");
			while(rs1.next()){
				source = rs1.getString("Source");
				dest = rs1.getString("Destination");
				System.out.println("I am here 3");
			}
			source= source.substring(0,2);
			System.out.println("I am here 4");
			
			dest = dest.substring(0,2);
			Statement stmt1 = null;
			stmt1 = ch.createStatement();
			ResultSet rs = stmt1.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				partAuto = rs.getString(1);
				
			}
			
			finalscheduleId=source;
			finalscheduleId=finalscheduleId.concat(dest);
			finalscheduleId=finalscheduleId.concat(partAuto);
			
			System.out.println("leaving create Scheduleid");

		} catch (Exception e) {

		}
		return finalscheduleId;

	}

	public String createSchedule(ScheduleBean sch) {

		Connection c = DBUtil.getDBConnection("Type4");
		PreparedStatement psmt;
		String schid = createScheduleid(sch);
		try {
			String tablename = "FRS_TBL_Schedule";
			System.out.println("leaving create Scheduleid"+schid);
			psmt = c.prepareStatement("insert into " + tablename
					+ " values(?,?,?,?,?,?)");
			psmt.setString(1,schid);
			psmt.setString(2, sch.getFlightId());
			psmt.setString(3, sch.getRouteId());
			psmt.setInt(4, sch.getTravelDuration());
			psmt.setString(5, sch.getAvailableDays());
			psmt.setInt(6, sch.getDepartureTime());

			int i = psmt.executeUpdate();
			if (i == 1)
				return "SUCCESS";
			else
				return "FAIL";
		}

		catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {

		}
	}

  public boolean updateSchedule(ScheduleBean schedulebean) {
  return false;
  }

  public boolean deleteSchedule(ArrayList<String> scheduleId) {
  return false;
  }

  public ArrayList<ScheduleBean> findAll() {
	  Connection con = DBUtil.getDBConnection("Type4");
		
		ResultSet resultSet;
		PreparedStatement pst;

		try {


			System.out.println("4 IN DAO");
			String tablename = "FRS_TBL_SCHEDULE";
			pst = con.prepareStatement("select * from " + tablename);
			resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
			ScheduleBean schedule = new ScheduleBean();
			schedule.setId(resultSet.getString("SCHEDULEID"));
			schedule.setFlightId(resultSet.getString("FLIGHTID"));
			schedule.setRouteId(resultSet.getString(3));
			schedule.setTravelDuration(resultSet.getInt("TRAVELDURATION"));
			schedule.setAvailableDays(resultSet.getString("AVAILABLEDAYS"));
			schedule.setDepartureTime(resultSet.getInt("DEPARTURETIME"));
				
				
						
				scheduleList.add(schedule);
				System.out.println("4 IN DAO");
				System.out.println("Checking"+scheduleList.isEmpty());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return scheduleList; 
  }

  public ScheduleBean findById(String scheduleId) {
  return null;
  }

public ArrayList<ScheduleBean> findAllDetails(String id) {
	ArrayList<ScheduleBean> scheduleDetailsDb =new ArrayList<ScheduleBean>();
	

	try {

		Connection conn;
		conn = DBUtil.getDBConnection("Type4");
		PreparedStatement pst;
		ResultSet rs;
		pst = conn.prepareStatement("select * from frs_tbl_schedule where routeid='"+id+"'");
		rs = pst.executeQuery();
		while (rs.next()) {
		ScheduleBean fromDb1 =new ScheduleBean();
		fromDb1.setId(rs.getString(1));
		fromDb1.setFlightId(rs.getString(2));
		fromDb1.setRouteId(rs.getString(3));
		fromDb1.setTravelDuration(rs.getInt(4));
		fromDb1.setAvailableDays(rs.getString(5));
		fromDb1.setDepartureTime(rs.getInt(6));
		scheduleDetailsDb.add(fromDb1);	
		}
	}

	catch (Exception e) {
		System.out.println(e);
	}
	return scheduleDetailsDb;  
	
}

}
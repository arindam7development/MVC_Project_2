package com.wipro.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.wipro.frs.entity.RouteBean;
import com.wipro.frs.util.DBUtil;

public class RouteDAO {
	ArrayList<RouteBean> routeList = new ArrayList<RouteBean>();
	public String createRouteid(RouteBean rb) {
		
		String sql,f1,f2, userid1,userid2, partAuto = null;
		f1=null;
		f2=null;
		userid1 = null;
		userid2 = null;
		

		try {
			Connection c = DBUtil.getDBConnection("Type4");
			sql = "select FRS_Seq_Routeid.nextval FROM dual";
			Statement stmt1 = null;
			stmt1 = c.createStatement();
			ResultSet rs = stmt1.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				partAuto = rs.getString(1);
				userid1 = rb.getSource();
				userid2=rb.getDestination();
				
			}
			
			f1 = userid1.substring(0, 2);
			f2 = userid2.substring(0, 2);
			f1 = f1.concat(f2);
            f1=f1.concat(partAuto);
		
		} catch (Exception e) {

		}
		return f1;

	}
	public ArrayList<String> findOnlyRouteId() {
		  ArrayList<String> routeId1 =new ArrayList<String>();
			try {

				Connection conn;
				conn = DBUtil.getDBConnection("Type4");
				PreparedStatement pst;
				ResultSet rs;
				pst = conn.prepareStatement("select routeid from frs_tbl_route");
				rs = pst.executeQuery();
				while (rs.next()) {
					routeId1.add(rs.getString(1));
				}
			}

			catch (Exception e) {
				System.out.println(e);
			}
			return routeId1;  
		  }
	public RouteBean findRouteIDFromSD(RouteBean reserve) 
	{
		RouteBean fromDb =new RouteBean();

	try {

		Connection conn;
		conn = DBUtil.getDBConnection("Type4");
		PreparedStatement pst;
		ResultSet rs;
		pst = conn.prepareStatement("select * from frs_tbl_route where source='"+reserve.getSource()+"' and destination='"+reserve.getDestination()+"'");
		rs = pst.executeQuery();
		while (rs.next()) {
		
			fromDb.setId(rs.getString(1));
			fromDb.setSource(rs.getString(2));
			fromDb.setDestination(rs.getString(3));
			fromDb.setDistance(rs.getInt(4));
			fromDb.setFare(rs.getInt(5));
			
		}
	}

	catch (Exception e) {

	}
	return fromDb;  
	}

	public ArrayList<String> findAllDestination(String source){
		  ArrayList<String> destinationFromDb =new ArrayList<String>();
		  try {

				Connection conn;
				conn = DBUtil.getDBConnection("Type4");
				PreparedStatement pst;
				ResultSet rs;
				pst = conn.prepareStatement("select destination from frs_tbl_route where source='"+source+"'");
				rs = pst.executeQuery();
				while (rs.next()) {
					destinationFromDb.add(rs.getString(1));
				}
			}

			catch (Exception e) {
			
			}
			return destinationFromDb;  
		  }

	public String createRoute(RouteBean routebean) {
		
		Connection c = DBUtil.getDBConnection("Type4");
		PreparedStatement psmt;

		try {
			String tablename = "FRS_TBL_Route";
			
			String routeid = createRouteid(routebean);
			
			psmt = c.prepareStatement("insert into " + tablename
					+ " values(?,?,?,?,?)");
			psmt.setString(1, routeid);
			psmt.setString(2, routebean.getSource());
			psmt.setString(3, routebean.getDestination());
			psmt.setInt(4, routebean.getDistance());
			psmt.setDouble(5, routebean.getFare());

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
	
	public boolean updateRoute(RouteBean routebean) {
		return false;
	}
	
	public boolean deleteRoute(ArrayList< String> routeId) {
		return false;
	}
	
	public ArrayList<RouteBean> findAll() {
		Connection con = DBUtil.getDBConnection("Type4");
			ResultSet resultSet;
		PreparedStatement pst;

		try {

			String tablename = "FRS_TBL_Route";
			pst = con.prepareStatement("select * from " + tablename);
			resultSet = pst.executeQuery();
		
			while (resultSet.next()) {
				RouteBean route = new RouteBean();
				route.setId(resultSet.getString("Routeid"));
				route.setSource(resultSet.getString("Source"));
				route.setDestination(resultSet.getString("Destination"));
				route.setDistance(resultSet.getInt("Distance"));
				route.setFare(resultSet.getInt("Fare"));
				routeList.add(route);
			
			}
		} catch (Exception e) {
		
		}
		return routeList;
	}
	public ArrayList<String> findAllSource() 
	  {
		  ArrayList<String> sourceFromDb =new ArrayList<String>();
		  try {

				Connection conn;
				conn = DBUtil.getDBConnection("Type4");
				PreparedStatement pst;
				ResultSet rs;
				pst = conn.prepareStatement("select source from frs_tbl_route");
				rs = pst.executeQuery();
				while (rs.next()) {
					sourceFromDb.add(rs.getString(1));
				}
			}

			catch (Exception e) {
				System.out.println(e);
			}

			return sourceFromDb;  
		  }
		  

	public RouteBean findById(String routeId) {
		 RouteBean routeDetailsById= new RouteBean();
			try
			{
				
				Connection conn;
				conn = DBUtil.getDBConnection("Type4");
				PreparedStatement pst;
				ResultSet rs;
				pst = conn.prepareStatement("select * from frs_tbl_route where routeid='"+routeId+"'");
				rs = pst.executeQuery();
				while (rs.next()) 
				{
					
					routeDetailsById.setId(rs.getString(1));
					routeDetailsById.setSource(rs.getString(2));
					routeDetailsById.setDestination(rs.getString(3));
					routeDetailsById.setDistance(rs.getInt(4));
					routeDetailsById.setFare(rs.getInt(5));
				}
			}

			catch (Exception e) 
			{
			
			}
			
			return routeDetailsById; 
		  
	}
}

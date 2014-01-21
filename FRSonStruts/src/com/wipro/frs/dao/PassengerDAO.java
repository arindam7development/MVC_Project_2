package com.wipro.frs.dao;
import java.util.ArrayList;
import java.util.Iterator;

import com.wipro.frs.entity.PassengerBean;
import com.wipro.frs.util.DBUtil;

import java.sql.*;

public class PassengerDAO {

  public String createPassenger(PassengerBean passengerbean) {
	  
	  PreparedStatement pst;
		Connection conn;
		try {
			conn = DBUtil.getDBConnection("Type4");
			String tablename = "FRS_TBL_Passenger";

			pst = conn.prepareStatement("insert into " + tablename + " values(?,?,?,?,?)");
			pst.setString(1, passengerbean.getReservationId() );
			pst.setString(2, passengerbean.getFullName() );
			pst.setString(3, passengerbean.getGender() );
			Integer age=passengerbean.getAge();
			pst.setString(4, age.toString() );
			pst.setString(5, passengerbean.getSeatNo());
			
			int i = pst.executeUpdate();
			} catch (Exception e) {
			
		}

		return "Success";
}
 


  public boolean updatePassenger(PassengerBean passengerbean) {
  return false;
  }

  public boolean deletePassenger(PassengerBean passengerbean) {
  return false;
  }

  public ArrayList<PassengerBean> findAll() {
  return null;
  }

	public ArrayList<PassengerBean> findById(ArrayList<String> reservationId) {
		ArrayList<PassengerBean> passsengers = new ArrayList<PassengerBean>();

		try

		{

			Connection conn;
			conn = DBUtil.getDBConnection("Type4");
			PreparedStatement pst;
			ResultSet rs;
			Iterator<String> iterator = reservationId.iterator();
			while (iterator.hasNext())

			{

				String insideId;
				insideId = iterator.next();
				if (!insideId.isEmpty())

				{
					pst = conn
							.prepareStatement("select * from frs_tbl_passenger where reservationid='"
									+ insideId + "'");
					rs = pst.executeQuery();
					while (rs.next()) {
						PassengerBean add1 = new PassengerBean();
						add1.setReservationId(rs.getString(1));
						add1.setFullName(rs.getString(2));
						add1.setGender(rs.getString(3));
						add1.setAge(rs.getInt(4));
						add1.setSeatNo(rs.getString(5));
						passsengers.add(add1);
					}
				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return passsengers;

	}

}
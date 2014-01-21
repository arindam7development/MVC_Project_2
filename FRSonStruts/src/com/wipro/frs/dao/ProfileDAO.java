package com.wipro.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.wipro.frs.entity.CredentialsBean;
import com.wipro.frs.entity.ProfileBean;
import com.wipro.frs.util.DBUtil;

public class ProfileDAO {
CredentialsBean creb;
	
	public CredentialsBean getCreb() {
		return creb;
	}
	public void setCreb(CredentialsBean c) {
		this.creb = c;
	}
	public String createUserid(ProfileBean pb) {
	
		String sql, userid, finalUserid, partAuto = null;
		userid = null;
		finalUserid = null;

		try {
			Connection c = DBUtil.getDBConnection("Type4");
			sql = "select FRS_SEQ_USERID.nextval FROM dual";
			Statement stmt1 = null;
			stmt1 = c.createStatement();
			ResultSet rs = stmt1.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				partAuto = rs.getString(1);
				userid = pb.getFirstName();
			}
			
			/*
			 * String s = "Strings are immutable"; s =
			 * s.concat(" all the time"); System.out.println(s);
			 */
			finalUserid = userid.substring(0, 2);
			finalUserid = finalUserid.concat(partAuto);

			

		} catch (Exception e) {

		}
		return finalUserid;

	}
	
  @SuppressWarnings("finally")
public String createProfile(ProfileBean profilebean) {
	  Connection c = DBUtil.getDBConnection("Type4");
		PreparedStatement psmt;
		
		try {
			String tablename = "FRS_TBL_User_Profile";
			
			// select FRS_SEQ_FLIGHTID.nextval FROM dual
			String userid = createUserid(profilebean);
			profilebean.setId(userid);
			
		
			psmt = c.prepareStatement("insert into " + tablename
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
			psmt.setString(1, userid);
			
			psmt.setString(2, profilebean.getFirstName());
			psmt.setString(3,profilebean.getLastName());
			
			psmt.setDate(4,new java.sql.Date(profilebean.getDateOfBirth().getTime()));
			psmt.setString(5, profilebean.getGender());
			psmt.setString(6, profilebean.getStreet());
			psmt.setString(7, profilebean.getLocation());
			psmt.setString(8, profilebean.getCity());
			psmt.setString(9, profilebean.getState());
			psmt.setString(10, profilebean.getPincode());
			psmt.setString(11, profilebean.getMobileNo());
			psmt.setString(12, profilebean.getEmailId());
	
			int i = psmt.executeUpdate();
			
			if (i == 1){
				
					String  PFID=profilebean.getId();
					return PFID;
			}
			else
				return "FAIL";
		}

		catch (Exception e) {
		
			return null;
		} finally {
			return profilebean.getId();
		}
		
  }
 

  public boolean updateProfile(ProfileBean profilebean) {
  return false;
  }

  public boolean deleteProfile(ArrayList<String> userId) {
  return false;
  }

  public ArrayList<ProfileBean> findAll() {
  return null;
  }

  public ProfileBean findById(String userId) {
  return null;
  }

}
package com.wipro.frs.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Payment {
	String creditCardNumber, validFrom, validTo;
	double balance;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean findByCardNumber(String userId, String cardNumber) {

		PreparedStatement pst;
		ResultSet rs;
		Connection conn;
		String result1 = "null";
		try {

			
			conn = DBUtil.getDBConnection("Type4");
		
			pst = conn.prepareStatement(" select * from FRS_TBL_creditcard where userid='"
							+ userId
							+ "' and creditcardnumber ='"
							+ cardNumber
							+ "'");
		
			rs = pst.executeQuery();
		
			if (rs.next()) {
				result1 = "Exist";
			}
		}

		catch (Exception e) {
		
		}
		if (result1.equals("Exist"))
			return true;
		else
			return false;

	}

	public String process(Payment payment, double amount)
	{
		
String result="null";
		PreparedStatement pst;
		PreparedStatement pset;
		ResultSet rs;
		Connection conn;
		Connection conn1;
		Payment detailsFromDb = new Payment();
		try {
			conn = DBUtil.getDBConnection("Type4");

			pst = conn.prepareStatement(" select * from FRS_TBL_CreditCard where creditcardnumber='"
							+ payment.creditCardNumber + "'");
			rs = pst.executeQuery();

			if (rs.next()) {
				detailsFromDb.setCreditCardNumber(rs.getString(1));
				detailsFromDb.setValidFrom(rs.getString(2));
				detailsFromDb.setValidTo(rs.getString(3));
				detailsFromDb.setBalance(rs.getInt(4));
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		if ((detailsFromDb.getValidFrom().equals(payment.getValidFrom()))
				&& (detailsFromDb.getValidTo().equals(payment.getValidTo()))) {
			if (detailsFromDb.getBalance() > amount) {
				
				try {
					double amount1=detailsFromDb.getBalance()- amount;
					
					
					conn1 = DBUtil.getDBConnection("Type4");
					pset = conn1.prepareStatement("update frs_tbl_creditcard set creditbalance="+amount1+"where creditcardnumber='"+payment.creditCardNumber+"'");
					int i= pset.executeUpdate();
					if(i!=0)
					{
						result="SUCCESS";
					}
					else
					{
						result="FAIL";
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}

			} else {
				result="INSUFFICIANT AMOUNT";
			}
		} else

			result="INVALID";
		
		return result;

	}

}
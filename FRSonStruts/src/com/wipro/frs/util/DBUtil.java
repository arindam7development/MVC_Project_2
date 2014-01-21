/* 
 * <Copyright information>
 *
 * <Wipro Technologies >
 *
 * File Name: DBUtil.java
 *
 * <Short Description- This class is responsible for the Database connection establishment.>
 *
 * Version Number: 1.0.0
 *
 * Created Date: 20 08 2013  
 *
 * <Modification History>
 */

package com.wipro.frs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author 
 *
 */
public class DBUtil {
	// settings required to connect to database using Type1 driver

	  private static final String TYPE1DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
	  private static final String TYPE1URL = "jdbc:odbc:orcl";

	// settings required to connect to database using Type4 driver

	private static final String TYPE4DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String TYPE4URL = "jdbc:oracle:thin:@localhost:1521:xe";

	private static String driver = "";
	private static String url = "";
	private static String userName = "TEAM02";
	private static String password = "TEAM02";

	private static Connection connection;

	
	@SuppressWarnings("finally")
	public static Connection getDBConnection(String driverType) {
		System.out.println("In DBUtil1");
		if (driverType.equals("Type4")) {
			System.out.println("In DBUtil1 TYPE 4");
			driver = TYPE4DRIVER;
			url = TYPE4URL;
		} else {
			System.out.println("In DBUtil1 TYPE 1");
			driver = TYPE1DRIVER;
			url = TYPE1URL;
		}

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,userName,password);
			
		} catch (ClassNotFoundException exception) {
			Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null,
					exception);
		} catch (SQLException sqlexception) {
			Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null,
					sqlexception);
		} finally {System.out.println(connection);
		
			return connection;
			
		}
	}

}

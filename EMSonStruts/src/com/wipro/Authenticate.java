package com.wipro;   
import java.sql.*;   
import java.util.ArrayList;





public class Authenticate{     
	private String errormessage;     
	private int id; 
	private String password;
	private ArrayList<Login> action;
	
	
	public String execute(){         
		try{  
			//Map session = ActionContext.getContext().getSession();  // Get session 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";           
			String user = "system";             
			String pass = "omarin7om";             
			Connection conn;             
			Statement st = null;             
			ResultSet rs = null;             
			Class.forName("oracle.jdbc.driver.OracleDriver");          
			conn = DriverManager.getConnection(url, user, pass);             
			st = conn.createStatement();             
	rs = st.executeQuery("SELECT * FROM empdata WHERE EMP_ID='"+getId()+"'");  
	                 db.DAOClass x = new db.DAOClass();
	                 int i =getId();
	        action=x.displayWel(i);
	
	
	
	            
			if (rs.next()) { 
				//System.out.println(rs.getInt(1));
				//System.out.println(rs.getString(2));
				if (rs.getString(2).equals(getPassword())) {                 
					return "success";
				}
				
			                 
				
				else{                     
					setErrormessage("Error logging in.. Password MisMatch");                      
					conn.close();                     
					return "error";                 
				}             
			}                         
			else {                 
				setErrormessage("Error logging in..No User Found");                 
				conn.close();                 
				return "error";             
			}             
		
			
			
		
		}
		
		catch (Exception e){             
			System.out.print(e);             
			setErrormessage("Some database error occurred.");                         
			return "error";         
		} 
		
		/*finally{
			return "success";
		}
	   */
	}       
	/* getters and setters */


	public String getErrormessage() {
		return errormessage;
	}


	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public ArrayList<Login> getAction() {
		return action;
	}


	public void setAction(ArrayList<Login> action) {
		this.action = action;
	}    
	
} 

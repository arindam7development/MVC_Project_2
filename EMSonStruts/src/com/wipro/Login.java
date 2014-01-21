package com.wipro;

import java.util.*; 
import db.DAOClass;

public class Login{     
	private String errormessage;   
	private int id;
	private String name;
	private String password;
	private String gender;
	private String dob;
	private String address ;
	private String department ;
	private String designation ;
	private float salary ;
	private String doj ;
	private static ArrayList<Login> action;
	
	public Login() {
		super();
	}
	public String execute(){         
		try{  
			        
			db.DAOClass x = new db.DAOClass();
			int p1 =getId();
			String p2=getPassword();
			String p3=getName();
			String p4=getGender();
			String p5=getDob();
			String p6=getAddress();
			String p7=getDepartment();
			String p8=getDesignation();
			float p9=getSalary();
			String p10=getDoj();
			
			if( p1==0 || p2==null || p3 ==null || p4==null || p5==null || p6==null || p7==null || p8 ==null || p9==0 || p10==null){
				throw new ArithmeticException();
			}
			int i = x.insert(p1, p2, p3, p4, p5,p6,p7,p8,p9,p10);
	           
			if (i!=1) {               
					setErrormessage("Error inserting record..");      
					return "error";                 
			}                                    
		}         
		catch (Exception e){             
			System.out.print(e);             
			setErrormessage("Some database error occurred.");                         
			return "error";         
		}                
	return "success";     
	}     
	public String DisplayMethod(){         
		try{           
			DAOClass x = new DAOClass();
			action = x.displayAll();                                               
		}         
		catch (Exception e){             
			System.out.print(e);             
			setErrormessage("Some database error occurred.");                 
			return "error";         
		}                
	return "success";     
	}  
	public String DisplaybyID(){         
		try{           
			DAOClass x = new DAOClass();
			int i =getId();
			action = x.displayBy(i);                                               
		}         
		catch (Exception e){             
			System.out.print(e);             
			setErrormessage("Some database error occurred.");                 
			return "error";         
		} 
		int i =getId();
		if(action.isEmpty()||action.contains(getId()!=i)){
			return "error";
		}
	return "success";     
	}  
	   
	
	
	/* getters and setters */ 
	
	static{
		action = new ArrayList<Login>();
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public static void setAction(ArrayList<Login> action) {
		Login.action = action;
	}
	public ArrayList<Login> getAction() {
		return action;
	}
} 

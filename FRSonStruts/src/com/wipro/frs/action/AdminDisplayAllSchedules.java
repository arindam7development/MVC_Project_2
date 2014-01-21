package com.wipro.frs.action;

import java.util.ArrayList;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.ScheduleBean;

public class AdminDisplayAllSchedules {
	private ArrayList<ScheduleBean> alistSchedule = new ArrayList<ScheduleBean>();
	private ScheduleBean schedulebean=new ScheduleBean();	
	public ScheduleBean getSchedulebean() {
		return schedulebean;
	}

	public void setRoutebean(ScheduleBean schedulebean) {
		this.schedulebean = schedulebean;
	}
	public ArrayList<ScheduleBean> getAlistSchedule() {
		return alistSchedule;
	}

	public void setAlistRoute(ArrayList<ScheduleBean> alistSchedule) {
		this.alistSchedule = alistSchedule;
	}

	public String execute() {

		try {
			Administrator admin = new Administrator();
			alistSchedule = admin.viewByAllSchedule();
			
		} catch (Exception e) {
				return "ERROR";
		}
				return "SUCCESS";

	}

}


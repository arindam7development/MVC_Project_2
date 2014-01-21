package com.wipro.frs.action;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.ScheduleBean;

public class AddSchedule1 {
ScheduleBean schedulebean;



public ScheduleBean getSchedulebean() {
	return schedulebean;
}



public void setSchedulebean(ScheduleBean schedulebean) {
	this.schedulebean = schedulebean;
}



public String execute() {
	String result;
	try {
		Administrator admin = new Administrator();
		result = admin.addSchedule(schedulebean);
		return result;
	}
	catch (Exception e) {
		return "ERROR";
	}
}

}

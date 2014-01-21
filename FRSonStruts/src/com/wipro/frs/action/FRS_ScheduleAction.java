package com.wipro.frs.action;

import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.ScheduleBean;

public class  FRS_ScheduleAction {

	ScheduleBean sb;

	public ScheduleBean getsb() {
		return sb;
	}

	public void setSb(ScheduleBean sb) {
		this.sb = sb;
	}

	public String execute() {
		Administrator a = new Administrator();
	
		String strutsResult = a.addSchedule(sb);
		if (strutsResult.equals("SUCCESS")) {

			return "SUCCESS";
		} else {
			return "FAIL";

		}
	}

}
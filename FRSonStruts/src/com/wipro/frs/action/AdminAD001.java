package com.wipro.frs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wipro.frs.entity.Administrator;
import com.wipro.frs.entity.FlightBean;

@SuppressWarnings("serial")
public class AdminAD001 extends ActionSupport {

	FlightBean fb;

	public FlightBean getFb() {
		return fb;
	}

	public void setFb(FlightBean fb) {
		this.fb = fb;
	}

	public String execute() {
		Administrator a = new Administrator();
		String strutsResult = a.addFlight(fb);
		if (strutsResult.equals("SUCCESS")) {

			return "SUCCESS";
		} else {
			return "FAIL";

		}
	}

}
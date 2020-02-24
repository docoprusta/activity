package com.soma.activity.model.user;

import java.util.Date;

/**
 * @author <a href="mailto:gyore.soma@gmail.com">Soma Györe</a>
 */
public class UserLoginActivity {
	private Date loginDate;
	private String ipAddress;

	public UserLoginActivity(Date loginDate, String ipAddress) {
		this.loginDate = loginDate;
		this.ipAddress = ipAddress;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public String getIpAddress() {
		return ipAddress;
	}
}

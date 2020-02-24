package com.soma.activity.model.user;

import java.util.List;

/**
 * @author <a href="mailto:gyore.soma@gmail.com">Soma Györe</a>
 */
public class UserActivity {
	private List<UserLoginActivity> userLoginActivities;

	public UserActivity(List<UserLoginActivity> userLoginActivities) {
		this.userLoginActivities = userLoginActivities;
	}

	public List<UserLoginActivity> getUserLoginActivities() {
		return userLoginActivities;
	}
}

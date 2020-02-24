package com.soma.activity.controller;

import java.util.Collections;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.soma.activity.model.user.UserActivity;
import com.soma.activity.model.user.UserLoginActivity;

/**
 * @author <a href="mailto:gyore.soma@gmail.com">Soma Györe</a>
 */
@RestController
public class UserActivityController {
	@GetMapping("/activity/user/{userId}")
	public UserActivity getUserActivity(@PathVariable int userId) {
		UserLoginActivity userLoginActivity = new UserLoginActivity(new Date(), "");
		return new UserActivity(Collections.singletonList(userLoginActivity));
	}
}

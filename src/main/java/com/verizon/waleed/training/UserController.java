package com.verizon.waleed.training;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

	ArrayList<User> listOfUsers = new ArrayList<>(Arrays.asList(
			new User(671, "Gokul", "Pune"),
			new User(673, "Keerthi", "Chennai"),
			new User(621, "Shabrin", "Hyderabad"),
			new User(136, "Kaosika", "Delhi"),
			new User(6710, "Sandhya", "Mumbai")
			));
	
	@RequestMapping("/users")
	ArrayList<User> getAllUsers() {
		return listOfUsers;
	}
	
	
	@RequestMapping("/users/{userId}")
	User getUserById(@PathVariable Integer userId) {
		User user = listOfUsers
				.stream()
				.filter(ref -> ref.userId().equals(userId))
				.findFirst()
				.get();
		return user;
	}
	
	
	
	
}

package com.salavat.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(1, "Oli", LocalDate.now().minusYears(20)));
		users.add(new User(1, "Foo", LocalDate.now().minusYears(30)));
	}

	public List<User> findAll() {
		return users;
	}
}

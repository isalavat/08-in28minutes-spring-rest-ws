package com.salavat.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salavat.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

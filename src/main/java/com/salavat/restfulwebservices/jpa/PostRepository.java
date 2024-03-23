package com.salavat.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salavat.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

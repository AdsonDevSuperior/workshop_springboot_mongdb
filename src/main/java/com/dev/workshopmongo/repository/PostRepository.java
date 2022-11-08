package com.dev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dev.workshopmongo.domain.Post;
import com.dev.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}

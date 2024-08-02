package com.torquato.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.torquato.workshopmongo.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

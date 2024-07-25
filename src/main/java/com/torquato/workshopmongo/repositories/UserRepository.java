package com.torquato.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.torquato.workshopmongo.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

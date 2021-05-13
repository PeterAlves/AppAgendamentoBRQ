package com.peterson.appagendamento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.peterson.appagendamento.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}

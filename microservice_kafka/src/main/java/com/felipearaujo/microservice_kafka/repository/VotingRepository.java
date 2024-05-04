package com.felipearaujo.microservice_kafka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipearaujo.microservice_kafka.model.Voting;

@Repository
public interface VotingRepository extends MongoRepository<Voting, String>{
    
}

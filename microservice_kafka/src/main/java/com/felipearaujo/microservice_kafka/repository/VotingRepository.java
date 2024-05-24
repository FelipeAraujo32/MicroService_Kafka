package com.felipearaujo.microservice_kafka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.felipearaujo.microservice_kafka.model.Voting;

public interface VotingRepository extends MongoRepository<Voting, String>{
    
}

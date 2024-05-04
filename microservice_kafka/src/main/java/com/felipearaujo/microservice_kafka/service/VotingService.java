package com.felipearaujo.microservice_kafka.service;

import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.felipearaujo.microservice_kafka.model.Participant;
import com.felipearaujo.microservice_kafka.model.Voting;
import com.felipearaujo.microservice_kafka.repository.VotingRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VotingService {

    private VotingRepository repository;

    @KafkaListener(topics = "voting", groupId = "MicroServiceVoting")
    private void execute(ConsumerRecord<String, String> register){

        String participantStr = register.value();
        log.info("Novo voto recebido = {}", participantStr);

        ObjectMapper mapper = new ObjectMapper();
        Participant participant = null;
        
        try {
            participant = mapper.readValue(participantStr, Participant.class);
        } catch (JsonProcessingException ex) {
            log.error("Erro [{}]", participantStr, ex);
            return;
        }
        
        Voting voting = new Voting(null, participant, new Date());
        Voting entity = repository.save(voting);

        log.info("Successfully registered vote: [id={}, datetime={}]", entity.getId(), entity.getDateTime());
    }
    
}

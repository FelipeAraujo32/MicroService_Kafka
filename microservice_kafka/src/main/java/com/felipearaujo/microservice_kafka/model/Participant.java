package com.felipearaujo.microservice_kafka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("participants")
public class Participant {

    @Id
    private String id;
    private String name;
    
}

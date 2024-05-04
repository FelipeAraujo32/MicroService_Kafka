package com.felipearaujo.microservice_kafka.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("voting")
public class Voting {

    @Id
    private String id;
    private Participant participant;
    private Date dateTime;

}

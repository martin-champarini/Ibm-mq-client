package com.poc.ibmmq.demo.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.poc.ibmmq.demo.client.JmsClient;
import com.poc.ibmmq.demo.model.Person;

@Service
public class PersonService {

    private JmsClient jmsClientl;

    public PersonService(JmsClient jmsClientl) {
        this.jmsClientl = jmsClientl;
    }

    public void createPerson(String name) {
        Person newPerson = new Person(UUID.randomUUID(), name);

        jmsClientl.sendMessage(newPerson);
    }

}

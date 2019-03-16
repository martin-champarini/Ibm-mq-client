package com.poc.ibmmq.demo.client;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.poc.ibmmq.demo.model.Person;

@Component
public class JmsClient {

    private JmsTemplate jmsTemplate;

    private static final String QUEUENAME = "DEV.QUEUE.1";


    public JmsClient(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(Person person) {
        jmsTemplate.convertAndSend(QUEUENAME, person);
    }

}

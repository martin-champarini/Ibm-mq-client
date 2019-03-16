package com.poc.ibmmq.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.ibmmq.demo.service.PersonService;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/create-person")
    public void createPeroson(@RequestParam String name) {
        personService.createPerson(name);
    }
}

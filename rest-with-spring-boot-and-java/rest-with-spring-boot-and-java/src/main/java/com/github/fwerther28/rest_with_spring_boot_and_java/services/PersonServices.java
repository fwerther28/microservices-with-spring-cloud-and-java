package com.github.fwerther28.rest_with_spring_boot_and_java.services;

import com.github.fwerther28.rest_with_spring_boot_and_java.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Werther");
        person.setLastName("Siriano");
        person.setAddress("Sao Paulo - Sao Paulo - Brazil");
        person.setGender("Male");
        return person;
    }
}

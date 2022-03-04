package com.example.SpringBoot;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBoot.entity.Person;
import com.example.SpringBoot.jpa.JpaRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

private Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired
JpaRepository repository;

public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}

@Override
public void run(String... args) throws Exception {


logger.info("Inserting -> {}",
repository.insert(new Person("Ram", "Chennai", new Date())));

logger.info("Inserting -> {}",
repository.insert(new Person( "Seetha", "Banglore", new Date())));

logger.info("Inserting -> {}",
repository.insert(new Person( "Sai", "Pune", new Date())));

logger.info("Inserting -> {}",
repository.insert(new Person( "Raj", "Karnataka", new Date())));

Person updatedPerson = repository.updatePerson(2,"Seetha", "Kerala", new Date());
logger.info("Updated Employee -> {}",updatedPerson);
//Repository.deleteBy(1);

Person person = repository.findById(1);
logger.info("Employee -> {}",person);


logger.info("All users -> {}", repository.findAll());
}
} 
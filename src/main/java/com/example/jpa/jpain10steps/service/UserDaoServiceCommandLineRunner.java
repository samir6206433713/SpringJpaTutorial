package com.example.jpa.jpain10steps.service;

import com.example.jpa.jpain10steps.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
@Autowired
    private UserDAOService  userDAOService;

private static final Logger log=  LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
User user= new User("Jack","Admin");

long insert=userDAOService.insert(user);
log.info("New User is created: "+user);
    }
}

package com.example.jpa.jpain10steps.service;

import com.example.jpa.jpain10steps.UserRepository;
import com.example.jpa.jpain10steps.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    private static final Logger log=  LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user= new User("Jill","Admin");

        userRepository.save(user);
        Optional <User> userWithIdOne=userRepository.findById(1L);
        List<User> users= userRepository.findAll();
        log.info("New User is created: "+user);
        log.info("List of all uers: "+users);
    }
}

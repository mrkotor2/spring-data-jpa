package com.myProject.jpa.springdatajpa;

import com.myProject.jpa.springdatajpa.entity.User;
import com.myProject.jpa.springdatajpa.service.UserDAOService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private final UserDAOService userDAOService;

    @Autowired
    public UserDAOServiceCommandLineRunner(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Alex","Admin");
        long insert = userDAOService.insert(user);
        log.info("New user is created: " + user);

    }
}

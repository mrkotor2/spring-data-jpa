package com.myProject.jpa.springdatajpa;

import com.myProject.jpa.springdatajpa.entity.User;
import com.myProject.jpa.springdatajpa.service.UserDAOService;
import com.myProject.jpa.springdatajpa.service.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryCommandLineRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Johny","Admin");
        User savedUser = userRepository.save(user);
        log.info("New user is created: " + savedUser);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User retrieved with id: " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All users retrieved: " + users);

    }
}

package com.securityjwt.bootstrap;

import com.securityjwt.model.User;
import com.securityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setUsername("AnasMarg");
        user.setOrganizationId("12354325");

        this.userRepository.save(user);
    }
}

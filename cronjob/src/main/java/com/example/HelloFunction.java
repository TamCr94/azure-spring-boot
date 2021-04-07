package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class HelloFunction implements Function<User, Greeting> {

    Logger logger = LoggerFactory.getLogger(HelloFunction.class);

    @Autowired
    Environment env;

    @Override
    public Greeting apply(User user) {
        Greeting greeting = new Greeting("Hello! Welcome, " + user.getName() + " " + env.getActiveProfiles()[0]);

        logger.info("ENV: " + env.getActiveProfiles());
        return greeting;
    }
}

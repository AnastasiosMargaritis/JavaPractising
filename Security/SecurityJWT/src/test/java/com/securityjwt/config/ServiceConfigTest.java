package com.securityjwt.config;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ServiceConfigTest {



    @BeforeAll
    static void setup(){
        ServiceConfig serviceConfig = new ServiceConfig();
    }

    @DisplayName("Secret Key Test")
    @Test
    void singleKeyTest(){
        ServiceConfig serviceConfig = new ServiceConfig();
        System.out.println(serviceConfig.getJwtSigningKey());
    }
}
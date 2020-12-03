package com.app;

import com.app.config.ServiceConfig;
import com.app.utils.UserContextInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableResourceServer
public class Application {

	@Autowired
	private ServiceConfig serviceConfig;

	@Primary
	@Bean
	public RestTemplate getCustomRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		List interceptors = restTemplate.getInterceptors();

		if(interceptors == null){
			restTemplate.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
		}else{
			interceptors.add(new UserContextInterceptor());
			restTemplate.setInterceptors(interceptors);
		}

		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

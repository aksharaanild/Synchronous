package com.example.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class C {

    @Autowired
    private RestTemplate restTemplate;

    public String callServiceD() {
        String serviceDUrl = "http://localhost:8081/service-d";
        String response = restTemplate.getForObject(serviceDUrl, String.class);
        return "Response from Service D: " + response;
    }

}
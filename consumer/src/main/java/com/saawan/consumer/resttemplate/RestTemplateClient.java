package com.saawan.consumer.resttemplate;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateClient {

    private final RestTemplate restTemplate;

    public RestTemplateClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    //private  static final String PROVIDER_URL = "http://localhost:8081";
    private  static final String PROVIDER_URL = "http://provider";
    public String getInstance(){
        return restTemplate.getForObject(PROVIDER_URL + "/instance-info", String.class);
    }

}

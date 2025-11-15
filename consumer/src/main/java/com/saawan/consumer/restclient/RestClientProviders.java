package com.saawan.consumer.restclient;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientProviders {

    private final RestClient restClient;

    public RestClientProviders(RestClient restClient){
        this.restClient = restClient;
    }

    public String getInstanceInfo(){
        return restClient.get()
                .uri("/instance-info")
                .retrieve()
                .body(String.class);
    }


}

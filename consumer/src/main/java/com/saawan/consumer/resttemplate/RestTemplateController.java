package com.saawan.consumer.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/api")
public class RestTemplateController {

    @Autowired
    private RestTemplateClient restTemplateClient;

    @GetMapping("/instance")
    public String getInstance(){
        //RestTemplate template = new RestTemplate();
        //return template.getForObject("http://localhost:8081/instance-info", String.class);
        return restTemplateClient.getInstance();
       // return "HI";
    }
}

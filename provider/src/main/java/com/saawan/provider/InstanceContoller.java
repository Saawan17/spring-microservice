package com.saawan.provider;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceContoller {

    @Value("${server.port}")
    private String port;

    private final String instanceID = java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstaceInfo(){
        System.out.println("Request received at instance running on port: " + port);
        return "Instance served by Port: " + port + ". Instance ID: " + instanceID;
    }

}

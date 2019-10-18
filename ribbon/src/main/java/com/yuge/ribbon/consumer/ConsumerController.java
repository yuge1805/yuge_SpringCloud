package com.yuge.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/helloConsumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://SERVICE-A/hello", String.class).getBody();
    }

}

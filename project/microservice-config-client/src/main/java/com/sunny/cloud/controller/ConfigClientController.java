package com.sunny.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @Value("${test}")
    private String test;

    @Value("${pod}")
    private String pod;

    @GetMapping("/profile")
    public String getProfile() {
        return profile;
    }

}

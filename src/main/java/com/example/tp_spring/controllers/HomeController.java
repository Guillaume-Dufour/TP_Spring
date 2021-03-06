package com.example.tp_spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    public Map<String, String> version() {
        Map<String, String> map = new HashMap<>();
        map.put("version", appVersion);

        return map;
    }
}

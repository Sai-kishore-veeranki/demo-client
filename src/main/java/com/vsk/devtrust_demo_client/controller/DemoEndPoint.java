package com.vsk.devtrust_demo_client.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoEndPoint {

    @GetMapping
    public String getName() {
        return "Hello from DevTrust Demo Client!";
    }

    @GetMapping("/number")
    public int getNumber() {
        return 67;
    }

    @GetMapping("/boolean")
    public boolean getBoolean() {
        return false;
    }
}

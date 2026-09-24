package com.vsk.devtrust_demo_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlowResponseController {

    private static final long RESPONSE_DELAY_MILLIS = 5_0000;

    @GetMapping("/slow")
    public String slowResponse() {
        try {
            Thread.sleep(RESPONSE_DELAY_MILLIS);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("The slow response was interrupted", exception);
        }

        return "This response is intentionally slow.";
    }
}

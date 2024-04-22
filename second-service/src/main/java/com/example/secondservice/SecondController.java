package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second-service")
public class SecondController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is Second Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String requestHeader) {
        log.info(requestHeader);
        return requestHeader;
    }
}

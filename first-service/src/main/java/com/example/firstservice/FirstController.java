package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/first-service")
public class FirstController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is First Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String requestHeader) {
        log.info(requestHeader);
        return requestHeader;
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is a message from first service";
    }
}

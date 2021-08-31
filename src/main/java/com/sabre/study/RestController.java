package com.sabre.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicInteger;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestController.class);


    AtomicInteger integer = new AtomicInteger(0);

    @GetMapping("/test")
    public String test() throws InterruptedException {
        LOGGER.info("calling" + integer);
        return String.valueOf(integer.incrementAndGet());
    }


}

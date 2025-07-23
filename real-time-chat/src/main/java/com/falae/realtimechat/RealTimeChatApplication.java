package com.falae.realtimechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class RealTimeChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealTimeChatApplication.class, args);
    }
}

package com.example.brokenka;

import reactor.core.publisher.Flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BrokenKaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrokenKaApplication.class, args);
    }

    @ResponseBody
    @GetMapping("/")
    public Flux<String> chunked() {
        return Flux.range(1, 100).map(i -> "Item" + i);
    }
}

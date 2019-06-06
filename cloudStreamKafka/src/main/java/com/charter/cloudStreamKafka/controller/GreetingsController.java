package com.charter.cloudStreamKafka.controller;

import com.charter.cloudStreamKafka.model.Greetings;
import com.charter.cloudStreamKafka.service.GreetingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    private final GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> greetings(@RequestParam("message") String message) {
        Greetings greetings = new Greetings(System.currentTimeMillis(), message);
        greetingsService.sendGreeting(greetings);

        return new ResponseEntity<>(greetings + " Sent to Kafka", HttpStatus.OK);
    }
}

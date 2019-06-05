package com.charter.cloudStreamKafka.service;

import com.charter.cloudStreamKafka.model.Greetings;
import com.charter.cloudStreamKafka.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GreetingsListener {
    private final Logger log = LoggerFactory.getLogger(Greetings.class);
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}

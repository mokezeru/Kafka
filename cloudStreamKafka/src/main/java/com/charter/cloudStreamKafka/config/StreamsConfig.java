package com.charter.cloudStreamKafka.config;

import com.charter.cloudStreamKafka.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}

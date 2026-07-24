package com.github.fwerther28.greeting_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting-service")
public record GreetingConfiguration(String greeting, String defaultValue) {}



package com.github.fwerther28.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zipkin2.reporter.Sender;
import zipkin2.reporter.okhttp3.OkHttpSender;

@Configuration
public class ZipkinCustomSenderConfig {

    @Value("${SPRING_ZIPKIN_BASEURL:http://localhost:9411}")
    private String zipkinBaseUrl;

    @Bean
    public Sender zipkinSender() {
        String endpoint = zipkinBaseUrl + "/api/v2/spans";
        return OkHttpSender.create(endpoint);
    }
}

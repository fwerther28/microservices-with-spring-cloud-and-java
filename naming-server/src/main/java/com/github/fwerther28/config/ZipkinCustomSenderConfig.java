package com.github.fwerther28.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zipkin2.reporter.Sender;
import zipkin2.reporter.okhttp3.OkHttpSender;

@Configuration
public class ZipkinCustomSenderConfig {

    @Value("${SPRING_ZIPKIN_BASEURL:http://zipkin-server:9411}")
    private String zipkinBaseUrl;

    @Bean
    public Sender zipkinSender() {
        String base = zipkinBaseUrl.endsWith("/")
                ? zipkinBaseUrl.substring(0, zipkinBaseUrl.length() - 1)
                : zipkinBaseUrl;

        String endpoint = base.endsWith("/api/v2/spans")
                ? base
                : base + "/api/v2/spans";

        return OkHttpSender.create(endpoint);
    }
}
package com.github.fwerther28.config;

/*
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin2.reporter.BytesMessageSender;
import zipkin2.reporter.okhttp3.OkHttpSender;

@Configuration
public class ZipkinCustomSenderConfig {

    @Value("${management.zipkin.tracing.endpoint:http://zipkin-server:9411/api/v2/spans}")
    private String zipkinEndpoint;

    @Bean
    public BytesMessageSender zipkinSender() {
        return OkHttpSender.create(zipkinEndpoint);
    }
}*/
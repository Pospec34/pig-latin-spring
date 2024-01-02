package com.example.PigLatin.config;

import com.example.PigLatin.models.PigLatinConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PigLatinConverter pigLatinConverter() {
        return new PigLatinConverter();
    }

}

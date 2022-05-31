package br.com.polus.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

@Configuration
public class AdminConfiguration {

    @Bean
    public Argon2PasswordEncoder encoder(){
        return new Argon2PasswordEncoder();
    }
}

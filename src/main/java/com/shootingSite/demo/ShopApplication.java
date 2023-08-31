package com.shootingSite.demo;

import com.shootingSite.demo.auth.RegisterRequest;
import com.shootingSite.demo.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.shootingSite.demo.entity.Role.ADMIN;
import static com.shootingSite.demo.entity.Role.MANAGER;
@ComponentScan(basePackages = {"com.shootingSite.demo.service"})
@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthenticationService authenticationService){
        return args -> {
            RegisterRequest admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@admin.com")
                    .password("passwordd")
                    .role(ADMIN)
                    .build();
            System.out.println(authenticationService.register(admin).getAccessToken());
            RegisterRequest management = RegisterRequest.builder()
                    .firstname("Management")
                    .lastname("Management")
                    .email("management@management.com")
                    .password("passwordd")
                    .role(MANAGER)
                    .build();
            System.out.println(authenticationService.register(management).getAccessToken());
        };
    }
}

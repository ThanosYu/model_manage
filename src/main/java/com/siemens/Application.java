package com.siemens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Thanos Yu
 * @date 2018/9/19
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.siemens")
@EnableJpaRepositories(basePackages = "com.siemens")
@EntityScan(basePackages = "com.siemens")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

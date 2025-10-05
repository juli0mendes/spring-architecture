package io.github.juli0mendes.springarchitecture;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

        var builder = new SpringApplicationBuilder(Application.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("producao");
        builder.run(args);

        var applicationContext = builder.context();
//		var productRepository = applicationContext.getBean("productRepository");

        var environment = applicationContext.getEnvironment();
        var applicationName = environment.getProperty("spring.application.name");

        System.out.println("Application Name: " + applicationName);
    }
}

package io.github.juli0mendes.springarchitecture;

import io.github.juli0mendes.springarchitecture.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfiguration {

    @Autowired
    private PropertiesApp propertiesApp;

//    @Bean
    public MailSender mailSender() {
        return null;
    }
}

package io.github.juli0mendes.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void send (String message) {
        System.out.println("Sending mail: " + message);
    }
}

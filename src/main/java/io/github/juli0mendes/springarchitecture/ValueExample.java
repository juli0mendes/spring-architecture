package io.github.juli0mendes.springarchitecture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {

    @Value("${app.config.var}")
    private String var;

    public void printVar() {
        System.out.println("The value of var is: " + var);
    }
}

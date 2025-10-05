package io.github.juli0mendes.springarchitecture.manufacturer.configuration;

import io.github.juli0mendes.springarchitecture.manufacturer.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static io.github.juli0mendes.springarchitecture.manufacturer.EngineType.ASPIRATED;
import static io.github.juli0mendes.springarchitecture.manufacturer.EngineType.ELECTRIC;
import static io.github.juli0mendes.springarchitecture.manufacturer.EngineType.TURBO;

@Configuration
public class EngineConfiguration {

    @Bean(name = "aspiratedEngine")
    public Engine aspiratedEngine() {
        var engine = new Engine();
        engine.setHorsepower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setDisplacement(2.0);
        engine.setType(ASPIRATED);

        return engine;
    }

    @Bean(name = "electricEngine")
    public Engine eletricEngine() {
        var engine = new Engine();
        engine.setHorsepower(110);
        engine.setCylinders(3);
        engine.setModel("TH-10");
        engine.setDisplacement(1.4);
        engine.setType(ELECTRIC);

        return engine;
    }

    @Primary
    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setHorsepower(180);
        engine.setCylinders(4);
        engine.setModel("TB-20");
        engine.setDisplacement(1.5);
        engine.setType(TURBO);

        return engine;
    }
}

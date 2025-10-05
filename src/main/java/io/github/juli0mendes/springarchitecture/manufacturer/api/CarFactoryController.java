package io.github.juli0mendes.springarchitecture.manufacturer.api;

import io.github.juli0mendes.springarchitecture.manufacturer.Engine;
import io.github.juli0mendes.springarchitecture.manufacturer.HondaHrv;
import io.github.juli0mendes.springarchitecture.manufacturer.Key;
import io.github.juli0mendes.springarchitecture.manufacturer.StatusCar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cars")
public class CarFactoryController {

    private final Engine engine;

    public CarFactoryController(@TurboEngine final Engine engine) {
        this.engine = engine;
    }

    @PostMapping
    public StatusCar startCar(@RequestBody Key key) {
        var car = new HondaHrv(this.engine);
        return car.turnIgnition(key);
    }
}

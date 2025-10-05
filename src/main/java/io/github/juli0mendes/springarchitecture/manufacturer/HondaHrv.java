package io.github.juli0mendes.springarchitecture.manufacturer;

import static java.awt.Color.BLACK;
import static io.github.juli0mendes.springarchitecture.manufacturer.Manufacturer.HONDA;

public class HondaHrv extends Car {

    public HondaHrv(Engine engine) {
        super(engine);
        setModel("HRV");
        setColor(BLACK);
        setManufacturer(HONDA);
    }
}

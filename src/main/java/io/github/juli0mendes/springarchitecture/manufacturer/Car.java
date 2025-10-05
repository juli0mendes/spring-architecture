package io.github.juli0mendes.springarchitecture.manufacturer;

import java.awt.Color;

public class Car {

    private String model;
    private Color color;
    private Engine engine;
    private Manufacturer manufacturer;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public StatusCar turnIgnition(Key key) {
        if (key.getManufacturer() != this.manufacturer) {
            return new StatusCar("Key does not match the car manufacturer.");
        }
        return new StatusCar("Car started successfully! Running with engine: " + this.engine);
    }
}

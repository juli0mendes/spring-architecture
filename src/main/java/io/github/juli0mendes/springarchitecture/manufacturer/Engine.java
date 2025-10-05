package io.github.juli0mendes.springarchitecture.manufacturer;

public class Engine {

    private String model;
    private Integer horsepower;
    private Integer cylinders;
    private Double displacement;
    private EngineType type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsepower=" + horsepower +
                ", cylinders=" + cylinders +
                ", displacement=" + displacement +
                ", type=" + type +
                '}';
    }
}
